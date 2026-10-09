package aAD.flujos.Ficheros;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.IOException;

public class AlumnosRock {

	public static void main(String[] args) {
		
		Path ruta = Paths.get("Alumnos.csv");
		
		try(BufferedReader lector = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){
			
			String linea = "";
			
			System.out.println("===== Inicio de lectura Rockeritos =====");
			
			while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
			
			System.out.println("<<<<<<<< Lectura de lineas finalizadas >>>>>>>>>");

		}catch(IOException e) {
			System.out.println("Error al leer el archivo " + e.getMessage());
			
		}
		
		

	}

}
