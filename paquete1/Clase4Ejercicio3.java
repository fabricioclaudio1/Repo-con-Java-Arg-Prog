package paquete1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Clase4Ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//nombres a array_nombres
		String nombres="hernan;leonel;julian;enzo;roman;andres;rodrigo;javier;ignacio;matias";

		String array_nombres[] = nombres.split(";");

		for (String nom : array_nombres) { // for mejorado

		    System.out.println(nom);
		
		}
		
		Files.writeString(Paths.get("C:\\Users\\Fabricio\\miprimerarchivo.txt"), nombres);
		System.out.println("Tarea realizada");
		
  
	}//main
}
