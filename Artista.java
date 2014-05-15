
import java.io.*;

public class Artista implements Serializable	
{
	private String nombre;
	private String nacionalidad;
	private String genero; 
	private int agno;

	public Artista(String nombre,String nacionalidad,String genero,int agno)
	{
		System.out.println("Nuevo Artista"); 
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		this.genero=genero;
		this.agno=agno;
	}

	public Artista()
	{
		System.out.println("Nuevo Artista"); 
	}

	public String getNombre()
	{
		return nombre;
	}

	public void imprimirdatos()
	{
		System.out.println("Nombre del Artista: " +nombre);
		System.out.println("Nacionalidad del Artista: " +nacionalidad);
		System.out.println("Genero del Artista: " +genero);
		System.out.println("Año del Artista: " +agno);
	}
}