package negocio;

import datos.Telepeaje;
import datos.Rodado;
import datos.Abonado;
import dao.TelepeajeDao;
import java.util.List;

///Clase TelepeajeABM:
public class TelepeajeABM 
{
	//Atributo:
	private static TelepeajeABM instancia = null;
	
	//Constructor:
	protected TelepeajeABM() {}
	
	//Obtener instancia:
	public static TelepeajeABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new TelepeajeABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 2:
	public List<Telepeaje> traerTelepeaje()
	{
		return TelepeajeDao.getInstance().traerTelepeaje();
	}
	
	//CU 6:
	public List<Telepeaje> traerTelepeaje(Rodado rodado)
	{
		return TelepeajeDao.getInstance().traerTelepeaje(rodado);
	}
	
	//CU 9:
	public List<Telepeaje> traerTelepeaje(Abonado abonado)
	{
		return TelepeajeDao.getInstance().traerTelepeaje(abonado);
	}
}
