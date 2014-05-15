
import java.io.*;
import java.util.*;

public class Archivos
{

	public Archivos()
	{

	}
	
	public static void escribirArchivo(ArrayList<Artista> lista)
	{
		try
		{
			File file = new File("Artista.txt");
		            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
		            out.writeObject(lista);
		            out.close();
		}
	            catch (FileNotFoundException ex)
	             {
		            System.out.println("Error with specified file") ;
		            ex.printStackTrace();
	       	 }
	        	catch (IOException ex) 
	        	{
		            System.out.println("Error with I/O processes") ;
		            ex.printStackTrace();
	        	}   
	}

	public static List<Artista> leerArchivo()
	{
		try
		{
			File file = new File("Artista.txt");
		            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		            List<Artista> lista = (List<Artista>)in.readObject();
		            in.close();
		            return lista;
		}
	            catch (FileNotFoundException ex)
	             {
		            System.out.println("Error with specified file") ;
		            ex.printStackTrace();
	       	 }
	        	catch (IOException ex) 
	        	{
		            System.out.println("Error with I/O processes") ;
		            ex.printStackTrace();
	        	}  
	        	catch (ClassNotFoundException ex) 
	        	{
		            System.out.println("Error con la clase") ;
		            ex.printStackTrace();
	        	} 
	        	return null;   
	}

}