package paquete1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clase4Ejercicio3ConTry_Catch {

	public static void main(String[] args) {

		File archivo = new File("C:\\Users\\Fabricio\\miprimerarchivo.txt");

		int sumaInt=0;

		try {
			Scanner sumaNumeros = new Scanner(archivo);

			while (sumaNumeros.hasNextInt()) {

				sumaInt = sumaInt + sumaNumeros.nextInt();

			}
			sumaNumeros.close();

		    System.out.println("La suma es: "+ sumaInt);

		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encontró en la ubicación especificada.");
			e.printStackTrace(); //Proporciona info para encontrar el error
		}
		
	}
}

