package datos;

///Clase Abonado:
public class Abonado
{
	//Atributos:
	private int id;
	private String apellido;
	private String nombres;
	private long dni;
	
	//Constructores:
	public Abonado() {}
	
	public Abonado(String apellido, String nombres, long dni) 
	{
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
	}

	//Getters:
	public int getId()
	{
		return id;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public String getNombres() 
	{
		return nombres;
	}

	public long getDni()
	{
		return dni;
	}

	//Setters:
	protected void setId(int id) 
	{
		this.id = id;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public void setNombres(String nombres)
	{
		this.nombres = nombres;
	}

	public void setDni(long dni)
	{
		this.dni = dni;
	}
	
	//To String:
	public String toString() 
	{
		return "Abonado = [ID = #" + id + ", Apellido = " + apellido + ", Nombres = " + nombres + ", DNI = #" + dni + "]";
	}
}
