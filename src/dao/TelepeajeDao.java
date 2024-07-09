package dao;

import datos.Telepeaje;
import datos.Rodado;
import datos.Abonado;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.HibernateException;


///Clase TelepeajeDao:
public class TelepeajeDao extends Dao<Telepeaje>
{
	//Atributo:
	private static TelepeajeDao instancia = null;
	
	//Constructor:
	protected TelepeajeDao() {}
	
	//Obtener instancia:
	public static TelepeajeDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new TelepeajeDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 2:
	public List<Telepeaje> traerTelepeaje()
	{
		List<Telepeaje> telepeajes = new ArrayList<Telepeaje>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Telepeaje t INNER JOIN FETCH t.rodado r INNER JOIN FETCH r.abonado"; //TODO
			telepeajes = session.createQuery(hql, Telepeaje.class).list();
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally
		{
			session.close();
		}
		return telepeajes;
	}

	//CU 6:
	public List<Telepeaje> traerTelepeaje(Rodado rodado)
	{
		List<Telepeaje> telepeajes = new ArrayList<Telepeaje>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Telepeaje t INNER JOIN FETCH t.rodado r INNER JOIN FETCH r.abonado WHERE r.id = " + rodado.getId(); //TODO
			telepeajes = session.createQuery(hql, Telepeaje.class).list();
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally 
		{
			session.close();
		}
		return telepeajes;
	}
	
	//CU 9:
	public List<Telepeaje> traerTelepeaje(Abonado abonado)
	{
		List<Telepeaje> telepeajes = new ArrayList<Telepeaje>();
		try 
		{
			iniciaOperacion();
			String hql = "FROM Telepeaje t INNER JOIN FETCH t.rodado r INNER JOIN FETCH r.abonado a WHERE a.id = " + abonado.getId(); //TODO
			telepeajes = session.createQuery(hql, Telepeaje.class).getResultList();
		}
		catch(HibernateException he) 
		{
			manejaExcepcion(he);
		}
		finally 
		{
			session.close();
		}
		return telepeajes;
	}
}
