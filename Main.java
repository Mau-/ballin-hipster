import java.util.*;
public class Main
{
	public static void main (String args[])
	{
		//Disco disk = new Disco(44,"País",333,222,new Artista(),"Título","Disquera",1);
		//disk.imprimirdatos();

		AbcArtistas imprimirtodo= new AbcArtistas();
		ArrayList<Artista> lista1 = (ArrayList<Artista>) Archivos.leerArchivo();
		if (lista1 != null){
			imprimirtodo.lista = lista1;
		}

		int opcion=0;
		while(opcion!=5)
		{
			Scanner scanIn = new Scanner(System.in);
			System.out.println("¿Qué desea hacer?");
			System.out.println("Presione 1 para dar de alta");
			System.out.println("Presione 2 para consulta");
			System.out.println("Presione 3 para editar");
			System.out.println("Presione 4 para borrar ");
			System.out.println("Presione 5 para salir");
			opcion = scanIn.nextInt();

			switch(opcion)
			{
				case 1:
					imprimirtodo.ingresarartista();
				break;
				case 2:
					imprimirtodo.imprimetodo();
				break;
				case 3:
					imprimirtodo.editarartista();
					imprimirtodo.imprimetodo();
				break;
				case 4:
					imprimirtodo.eliminarartista();
					imprimirtodo.imprimetodo();
				break;
				case 5:
					Archivos.escribirArchivo(imprimirtodo.lista);
					System.out.println("ADIOS");
				break;
				default: 
					System.out.println("SELECCIONA UNA OPCION INDICADA");

			}

		}
	}
}