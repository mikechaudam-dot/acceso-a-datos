

//Crea la estructura centro/2026/exportaciones con una sola llamada 
// y escribe dentro un fichero de texto. Comprueba qué ocurre si ejecutas
//el programa dos veces seguidas y explica por qué no falla.

package aAD;

import java.nio.file.*;
import java.io.IOException;

public class CentroExportaciones {

	public static void main(String[] args) throws IOException {
		
		//Creamos la ruta FORMA ERRONE si lo que queremos es crear una ruta de varios directorios 
		/*
		Path dir1 = Path.of("centro");
		Path dir2 = Path.of("2026");
		Path arhivo = Path.of("exportaciones.csv");
		*/
		
		//Creamos la ruta de la forma CORRECTA 
		Path dir1 = Path.of("centro/2026/exportaciones");
		Path fichero = dir1.resolve("prueba.txt");
		
		System.out.println(dir1);
		
		//Path miRuta = Paths.get("centro").resolve("2026");
		
		//Creamos los archivos 
		Files.createDirectories(dir1);
		Files.writeString(fichero, "Nada personal");
		
		//Inspeccionamos 
		System.out.println("----Inspeccionando con las rutas----");
		
		System.out.println("Ruta absoluta de dir1: " + dir1.toAbsolutePath());
		System.out.println("Ruta absoluta del fichero: " + fichero.toString());
		
		//
	}

}
