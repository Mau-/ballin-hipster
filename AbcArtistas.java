import java.util.*;
public class AbcArtistas
{
	public ArrayList<Artista> lista=new ArrayList<Artista>();
               
	public AbcArtistas()
	{

	}

	public void ingresarartista()
	{

		Scanner scanIn = new Scanner(System.in);
		String nomArtista="";
 		String nacion="";
 		String genero="";
 		int agno=0;
 		boolean condicion=true; 

 		do
 		{
 			try
	 		{
	 			System.out.println("Ingresa el nombre del artista");
		       		nomArtista = scanIn.nextLine();
		   		System.out.println("Ingresa el País del artista");
			       	nacion = scanIn.nextLine();
			       	System.out.println("Ingresa el Género del artista");
		   		genero = scanIn.nextLine();
			       	System.out.println("Ingresa el Año del artista");
			       	agno = scanIn.nextInt();
		 		
		       		condicion = false;
	 		}
			catch(InputMismatchException e)
			{
				System.out.println("Debes Introducir el Año en números");
				e.printStackTrace();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Debes introducir algo");
				e.printStackTrace(); 
			}
 		}
 		while (condicion);
 	
 		Artista artistas1 = new Artista(nomArtista,nacion,genero,agno);
		artistas1.imprimirdatos();
		lista.add(artistas1);
 	}

 	public void editarartista()
 	{
 		System.out.println("Ingresa el Nombre del Artista que deseas editar: ");
 		Scanner ln = new Scanner(System.in);
 		String nomArtista="";
 		int indice=0;
 		boolean encontrado=false;
 		nomArtista = ln.nextLine();	
 		
 		for(int i=0; i<lista.size();i++)
 		{
 			if (lista.get(i).getNombre().equals(nomArtista))
 			{
 				indice = i;
 				encontrado = true;
 				break;
 			}	
 		}

 		if (encontrado)
 		{
	 		String nombre="";
	 		String nacionalidad="";
	 		String genero="";
	 		int agno=0;
			System.out.println("Ingresa el nombre del artista");
			nombre = ln.nextLine();
			System.out.println("Ingresa el País del artista");
			nacionalidad = ln.nextLine();
			System.out.println("Ingresa el Género del artista");
			genero = ln.nextLine();
			System.out.println("Ingresa el Año del artista");
			agno = ln.nextInt();
			Artista artista = new Artista(nombre,nacionalidad,genero,agno);
			lista.set(indice, artista);
 		} 

 		else
 		{
 			System.out.println("El artista no ha sido encontrado");

 		}
 	}

	public void eliminarartista()
 	{
 		System.out.println("Ingresa el Nombre del Artista que deseas eliminar: ");
 		Scanner ln = new Scanner(System.in);
 		String nomArtista="";
 		int indice=0;
 		boolean encontrado=false;
 		nomArtista = ln.nextLine();	
 		
 		for(int i=0; i<lista.size();i++)
 		{
 			if (lista.get(i).getNombre().equals(nomArtista))
 			{
 				indice = i;
 				encontrado = true;
 				break;
 			}	
 		}

 		if (encontrado)
 		{
			lista.remove(indice);
 		} 

 		else
 		{
 			System.out.println("El artista no ha sido encontrado");

 		}
 	}

 	public void imprimetodo()
 	{
 		/*for(int i=0; i<lista.size();i++)
 		{
 			lista.get(i).imprimirdatos();
 		}*/
 		for (Artista a: lista)
 		{
 			a.imprimirdatos();
 		}
 	}
}