package negocio;

import dao.AbonadoDao;
import datos.Abonado;

///Clase AbonadoABM:
public class AbonadoABM 
{
	//Atributo:
	private static AbonadoABM instancia = null;
	
	//Constructor:
	protected AbonadoABM() {}
	
	//Obtener instancia:
	public static AbonadoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new AbonadoABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 8:
	public Abonado traerAbonado(long dni) 
	{
		return AbonadoDao.getInstance().traerAbonado(dni);
	}
}
