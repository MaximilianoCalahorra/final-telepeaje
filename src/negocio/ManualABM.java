package negocio;

import dao.ManualDao;
import datos.Manual;
import java.util.List;
import java.time.LocalDate;

///Clase ManualABM:
public class ManualABM 
{
	//Atributo:
	private static ManualABM instancia = null;
	
	//Constructor:
	protected ManualABM() {}
	
	//Obtener instancia:
	public static ManualABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new ManualABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 1:
	public List<Manual> traerManual()
	{
		return ManualDao.getInstance().traer();
	}
	
	//CU 3:
	public List<Manual> traerManual(LocalDate fecha)
	{
		return ManualDao.getInstance().traerManual(fecha);
	}
	
	//CU 4:
	public double cerrarCaja(LocalDate fecha) 
	{
		double total = 0;
		List<Manual> manuales = traerManual(fecha);
		for(Manual manual: manuales) 
		{
			total += manual.getPrecio();
		}
		return total;
	}
}
