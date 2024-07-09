package dao;

import datos.Abonado;
import org.hibernate.HibernateException;

///Clase AbonadoDao:
public class AbonadoDao extends Dao<Abonado>
{
	//Atributo:
	private static AbonadoDao instancia = null;
	
	//Constructor:
	protected AbonadoDao() {}
	
	//Obtener instancia:
	public static AbonadoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new AbonadoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 8:
	public Abonado traerAbonado(long dni) 
	{
		Abonado abonado = null;
		try 
		{
			iniciaOperacion();
			String hql = "FROM Abonado a WHERE a.dni = " + dni;
			abonado = (Abonado)session.createQuery(hql).uniqueResult();
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally 
		{
			session.close();
		}
		return abonado;
	}
}
