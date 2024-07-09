package datos;

import java.time.LocalDate;
import java.time.LocalTime;

///Clase Peaje:
public abstract class Peaje
{
	//Atributos:
	protected int idPeaje;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected double precio;
	
	//Constructores:
	public Peaje() {}
	
	public Peaje(LocalDate fecha, LocalTime hora, double precio) 
	{
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
	}

	//Getters:
	public int getIdPeaje()
	{
		return idPeaje;
	}

	public LocalDate getFecha()
	{
		return fecha;
	}

	public LocalTime getHora() 
	{
		return hora;
	}

	public double getPrecio() 
	{
		return precio;
	}

	//Setters:
	protected void setIdPeaje(int idPeaje)
	{
		this.idPeaje = idPeaje;
	}

	public void setFecha(LocalDate fecha) 
	{
		this.fecha = fecha;
	}

	public void setHora(LocalTime hora)
	{
		this.hora = hora;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	//To String:
	public String toString() 
	{
		return "ID = #" + idPeaje + ", Fecha = " + fecha + ", Hora = " + hora + ", Precio = $" + precio;
	}
}
