package dao;

import datos.Manual;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import org.hibernate.HibernateException;

///Clase ManualDao:
public class ManualDao extends Dao<Manual>
{
	//Atributo:
	private static ManualDao instancia = null;
	
	//Constructor:
	protected ManualDao() {}
	
	//Obtener instancia:
	public static ManualDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new ManualDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 3:
	public List<Manual> traerManual(LocalDate fecha)
	{
		List<Manual> manuales = new ArrayList<Manual>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Manual m WHERE m.fecha = '" + fecha + "'";
			manuales = session.createQuery(hql, Manual.class).list();
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally 
		{
			session.close();
		}
		return manuales;
	}
}
