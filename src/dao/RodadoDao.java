package dao;

import datos.Rodado;
import org.hibernate.HibernateException;

///Clase RodadoDao:
public class RodadoDao extends Dao<Rodado>
{
	//Atributo:
	private static RodadoDao instancia = null;
	
	//Constructor:
	protected RodadoDao() {}
	
	//Obtener instancia:
	public static RodadoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new RodadoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 5:
	public Rodado traerRodado(String dominio) 
	{
		Rodado rodado = null;
		try 
		{
			iniciaOperacion();
			String hql = "FROM Rodado d INNER JOIN FETCH d.abonado WHERE d.dominio = '" + dominio + "'";
			rodado = (Rodado)session.createQuery(hql).uniqueResult();
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally 
		{
			session.close();
		}
		return rodado;
	}
}
