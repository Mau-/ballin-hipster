public class Disco 
{
	
	private int agno;
	private String pais;
	private int canciones;
	private int discos;
	private Artista artista;
	private String titulo;
	private String disquera;
	private float precio;
	

	public Disco(int agno, String pais, int canciones, int discos, Artista artista, String titulo, String disquera, float precio)
	{
		System.out.println("Nuevo Disco");
		this.agno = agno;
		this.pais = pais;
		this.canciones = canciones;
		this.discos = discos;
		this.artista = artista;
		this.titulo = titulo;
		this.disquera = disquera;
		this.precio = precio;
	}

	public void imprimirdatos()
	{
		System.out.println("Año: "+agno);
		System.out.println("País: "+pais);
		System.out.println("Canciones: " +canciones);
		System.out.println("Discos: " +discos);
		System.out.println("Artista: " +artista.getNombre());
		System.out.println("Título: " +titulo);
		System.out.println("Disquera: " +disquera);
		System.out.println("Precio: " +precio);
	}
}