package datos;

import java.time.LocalDate;
import java.time.LocalTime;

///Clase Manual:
public class Manual extends Peaje
{
	//Atributos:
	private String codCabina;
	
	//Constructores:
	public Manual() {}
	
	public Manual(LocalDate fecha, LocalTime hora, double precio, String codCabina) 
	{
		super(fecha, hora, precio);
		this.codCabina = codCabina;
	}

	//Getter:
	public String getCodCabina() 
	{
		return codCabina;
	}

	//Setter:
	public void setCodCabina(String codCabina) 
	{
		this.codCabina = codCabina;
	}
	
	//To String:
	public String toString() 
	{
		return "\nManual = [" + super.toString() + ", Codigo de la cabina = #" + codCabina + "]\n";
	}
}
