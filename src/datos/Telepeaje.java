package datos;

import java.time.LocalDate;
import java.time.LocalTime;

///Clase Telepeaje:
public class Telepeaje extends Peaje
{
	//Atributos:
	private Rodado rodado;
	private String lector;
	
	//Constructores:
	public Telepeaje() {}
	
	public Telepeaje(LocalDate fecha, LocalTime hora, double precio, Rodado rodado, String lector) 
	{
		super(fecha, hora, precio);
		this.rodado = rodado;
		this.lector = lector;
	}

	//Getters:
	public Rodado getRodado() 
	{
		return rodado;
	}

	public String getLector() 
	{
		return lector;
	}

	//Setters:
	public void setRodado(Rodado rodado)
	{
		this.rodado = rodado;
	}

	public void setLector(String lector)
	{
		this.lector = lector;
	}
	
	//To String:
	public String toString() 
	{
		return "\nTelepeaje = [" + super.toString() + ", " + rodado.toString() + ", Lector = " + lector + "]\n";
	}
	
	//CU 7:
	public double calcularDescuento(double porcentajeDescuento) 
	{
		double descuento = 0;
		//Corresponde descuento si es un día de fin de semana o si es antes de las 7:00 (no inclusive) o después de las 19:00 (inclusive):
		if(fecha.getDayOfWeek().getValue() > 4 || hora.isBefore(LocalTime.of(7, 0)) || !hora.isBefore(LocalTime.of(19, 0))) 
		{
			descuento = precio * porcentajeDescuento / 100;
		}
		return descuento;
	}
}