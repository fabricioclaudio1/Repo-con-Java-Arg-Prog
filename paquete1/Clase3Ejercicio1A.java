package paquete1;

public class Clase3Ejercicio1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONTAR LA CANTIDAD DE APARICIONES DE UN CARACTER EN UN TEXTO
		String palabra="Hola como estas";

		int contador=0,posicion=0;

		char caracter = 'a';

		String palabra_minu = palabra.toLowerCase();//hace las letras minusculas

		posicion = palabra_minu.indexOf(caracter);

		System.out.println(posicion); //posicion de primer caracter "a"

		if (posicion != -1 ) {

			while (posicion != -1 ) {
	
				contador++;
		
				posicion = palabra_minu.indexOf(caracter,posicion+1);
	
			}
	
			System.out.println("La cantidad de coincidencias es: " + contador);

		}else {

		    System.out.println("No hay coincidencia");

		}
	}

}
