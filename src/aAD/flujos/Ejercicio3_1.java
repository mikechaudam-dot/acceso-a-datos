package aAD.flujos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio3_1 {
	
	/*Escribe un programa que copie un fichero binario usando flujos de bytes en bloques de 8192. 
	 * Comprueba con una imagen que el resultado es idéntico al original comparando los tamaños y abriendo la copia.
	 */ 

	public static void main(String[] args) {
		
		//Establecemos las rutas de origen y la de destino
		Path original = Path.of("newVegas.jpg");
		Path copia = Path.of("copiaNewVegas.jpg");
		
		//Abrimos el InputStream y el OutputStream
		try (InputStream in = Files.newInputStream(original);
			 OutputStream out = Files.newOutputStream(copia)){
			
			byte[] bufer = new byte[8192];
				
			int bytesLeidos;
            int numBloque = 0;
            
            System.out.println("=== Leyendo y copiando archivo en bloques de 8192 bytes ===");
            
            while ((bytesLeidos = in.read(bufer)) != -1){
            	numBloque ++;
            }
            
            String fragmento = new String (bufer, 0, bytesLeidos, StandardCharsets.UTF_8);
            
            System.out.printf("Bloque #%d | Bytes Leidos: %d | ");
            
		}catch (IOException e){
			System.out.println("Error durante la operacion de E/S: " + e.getMessage());
		}
		
		
		
		

}
	
}
