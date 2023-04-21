package paquete1;

import java.util.Scanner;

public class Clase4Ejercicio1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        if(args != null) {
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			String AoD= args[3];
			
			int[] numOrdenado= new int[3];
			numOrdenado= ordenarNumeros(num1, num2, num3, AoD);
			
			System.out.println("Numeros ordenados: ");
			for(int n: numOrdenado) {
				System.out.print(n + " ");
			}
			
			
		} else {
			Scanner entrada= new Scanner(System.in);
			//Por qué tengo que poner el String AoD antes que los int num1,num2,num3, para que me tome AoD por consola? En caso contrario no me lo toma. O sea si pongo String AoD en al linea 20, solo me piden los nums 
			System.out.println("Escribe A o D para ordenar los nums Ascend o Descend respect..");
			String AoD= entrada.nextLine();
			
			System.out.println("Elige un numero");
			int num1= entrada.nextInt();
			System.out.println("Elige otro numero");
			int num2= entrada.nextInt();
			System.out.println("Elige el ultimo numero");
			int num3= entrada.nextInt();
			
			int[] numOrdenado= new int[3];
			numOrdenado= ordenarNumeros(num1, num2, num3, AoD);
			
			System.out.println("Numeros ordenados: ");
			for(int n: numOrdenado) {
				System.out.print(n + " ");
			}
			entrada.close();
		}
	}//main
	public static int[] ordenarNumeros(int num1, int num2, int num3, String AoD) {
		int[] numeros= new int[3];
		int mayor=0, medio=0, menor=0;
		
		if ((num1 > num2) && (num1 > num3)) {

		    mayor=num1;
		    if (num2 > num3) {
		        medio=num2;
		        menor=num3;
		    }else {
		        medio=num3;
		        menor=num2;
		    }
		}else{
			if ((num2 > num3) && (num2 > num1)) {
				mayor=num2;
			    if (num1 > num3) {
			        medio=num1;
			        menor=num3;
			    }else {
			        medio=num3;
			        menor=num1;
			    }
			}else {
			    mayor=num3;
			    if (num2 > num1) {
			        medio=num2;
			        menor=num1;
			    }else {
			        medio=num1;
			        menor=num2;
		        }
		    }
		}
		
		switch (AoD) {
		case "A":
			numeros[0]=menor;
			numeros[1]=medio;
			numeros[2]=mayor;
			break;
		
        case "D":
			numeros[0]=mayor;
			numeros[1]=medio;
			numeros[2]=menor;
			break;

		default:
			break;
		}
		
		return numeros;
	}

}//
