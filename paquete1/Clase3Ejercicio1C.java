package paquete1;

public class Clase3Ejercicio1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= {32,42,74,93,16,84,27,12,35,89,23};
		int x=38, resultado=0;
		
		for(int n:numeros) {
			if(n>x) {
				resultado +=n;
			}
		}
		System.out.println("La suma de los numeros mayores a " + x + " es: " + resultado);
		
	}

}
