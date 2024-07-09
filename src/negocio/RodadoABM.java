package negocio;

import dao.RodadoDao;
import datos.Rodado;

///Clase RodadoABM:
public class RodadoABM 
{
	//Atributo:
	private static RodadoABM instancia = null;
	
	//Constructor:
	protected RodadoABM() {}
	
	//Obtener instancia:
	public static RodadoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new RodadoABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 5:
	public Rodado traerRodado(String dominio) 
	{
		return RodadoDao.getInstance().traerRodado(dominio);
	}
}
