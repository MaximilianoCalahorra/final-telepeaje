package datos;

///Clase Rodado:
public class Rodado
{
	//Atributos:
	private int id;
	private String dominio;
	private int categoria;
	private Abonado abonado;
	
	//Constructores:
	public Rodado() {}
	
	public Rodado(String dominio, int categoria, Abonado abonado) 
	{
		this.dominio = dominio;
		this.categoria = categoria;
		this.abonado = abonado;
	}

	//Getters:
	public int getId()
	{
		return id;
	}

	public String getDominio()
	{
		return dominio;
	}

	public int getCategoria()
	{
		return categoria;
	}

	public Abonado getAbonado() 
	{
		return abonado;
	}

	//Setters:
	protected void setId(int id) 
	{
		this.id = id;
	}

	public void setDominio(String dominio) 
	{
		this.dominio = dominio;
	}

	public void setCategoria(int categoria)
	{
		this.categoria = categoria;
	}

	public void setAbonado(Abonado abonado)
	{
		this.abonado = abonado;
	}
	
	//To String:
	public String toString() 
	{
		return "Rodado = [ID = #" + id + ", Dominio = " + dominio + ", Categoria = #" + categoria + ", " + abonado.toString() + "]";
	}
}
