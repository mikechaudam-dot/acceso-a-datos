
package aAD;

import java.nio.file.*;
import java.io.IOException;

public class SiExiste2_3 {
	
	/* Ejercicio 2.3. Escribe un programa que reciba una ruta e imprima si existe, si es fichero o directorio, su
	tamaño y su fecha de última modificación. Pruébalo con una ruta inexistente y comprueba que no se
	cae.
	*/
	
	//Esto es una chambonada
	public static void main(String[] args) throws IOException { //Estoy es una mala practica solo lo estamos haciendo por el ejercicio, en un programa real no se hace
		
		Path dir1 = Path.of("centro/2026/exportaciones/pruebggga.txt");	
		
		if (Files.exists(dir1)){
			System.out.println("La ruta existe, es un fichero?: " + Files.isRegularFile(dir1) + " es un directorio? :" + Files.isDirectory(dir1) + " tamaño: " + Files.size(dir1) + " ultima modificacion: " + Files.getLastModifiedTime(dir1));
		}else {
			System.out.println("La ruta no exite, lo siento");
		}
	
	//Codigo refactorizado por Eduardo:
		
		
	}

}
