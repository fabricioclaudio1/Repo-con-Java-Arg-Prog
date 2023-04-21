package paquete1;

public class Clase1Ejercicio1 {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		System.out.print(numeroInicio + "-");
		while(numeroInicio<numeroFin) {
			numeroInicio++;
			System.out.print(numeroInicio + "-");
		}
		
		System.out.println();
		System.out.println("------");
		numeroInicio = 5;
		if((numeroInicio%2)==0) {
				System.out.print(numeroInicio + "-");
			}
		while(numeroInicio<=numeroFin) {
			if((numeroInicio%2)==0) {
				System.out.print(numeroInicio + "-");
			}
			numeroInicio++;
		}
		
		System.out.println();
		System.out.println("------");
		numeroInicio = 5;
		int par=1;
		
		if((numeroInicio%2)==0 && par==1) {
			System.out.print(numeroInicio + "-");
		}
		while(numeroInicio<=numeroFin) {
			if((numeroInicio%2)==0 && par==1) {
				System.out.print(numeroInicio + "-");
			}
			else {
				if((numeroInicio%2)!=0 && par==0){
					System.out.print(numeroInicio + "-");
				}
			}
			numeroInicio++;
		}
	}
}
