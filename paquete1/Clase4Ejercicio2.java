package paquete1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clase4Ejercicio2 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File archivo = new File(args[0]);

		int sumaInt=0;

		Scanner sumaNumeros = new Scanner(archivo);
		System.out.println(args[1]); //por qué "*" es .classpath?
		
		switch (args[1]) {
		
		case "+":
			while (sumaNumeros.hasNextInt()) {
			    sumaInt = sumaInt + sumaNumeros.nextInt();
		    }
	        System.out.println("La suma es: "+ sumaInt);
			break;
			
        case ".classpath":
        	sumaInt=1; //necesario que sea 1 para que la multipl no sea 0
        	while (sumaNumeros.hasNextInt()) {
    			sumaInt = sumaInt * sumaNumeros.nextInt();
    		}

    	    System.out.println("La multiplicacion es: "+ sumaInt);
			break;
			
		default:
			System.out.println("No eligió la operacion suma o multiplicacion");
			break;
			
		}
		
		sumaNumeros.close();
		
	}
	
}


