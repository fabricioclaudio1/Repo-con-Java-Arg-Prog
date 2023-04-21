package paquete1;

public class Clase3Ejercicio1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Orden de 3 numeros en vector
				boolean orden_asc = false; //Elijo orden ascendete (true) o desc (false)

				int []vectorA = {800,0,10};

				int num1=0, num2=0,num3=0, medio=0, menor=0, mayor=0;

				num1 = vectorA[0];

				num2 = vectorA[1];

				num3 = vectorA[2];

				System.out.println(num1+" " + num2+" " + num3);

				if ((num1 > num2) && (num1 > num3)) {

				    mayor=num1;

				    if (num2 > num3) {

				        medio=num2;

				        menor=num3;

				    }else {

				        medio=num3;

				        menor=num2;

				    }

				}

				else{

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

				System.out.println("El mayor es: "+mayor);
				System.out.println("El mediano es: "+medio);
				System.out.println("El menor es: "+menor);

				int vecOrdenado [] = new int[3];

				if (orden_asc) {
					
					System.out.println("Orden ascendente");

					vecOrdenado[0]=menor;
			
					vecOrdenado[1]=medio;
			
					vecOrdenado[2]=mayor;

				}else {
					System.out.println("Orden descendente");

					vecOrdenado[0]=mayor;
			
					vecOrdenado[1]=medio;
			
					vecOrdenado[2]=menor;

				}

				for (int i=0; i< vecOrdenado.length; i++ ) {

					System.out.print(vecOrdenado[i]+"-");

				}
	}

}
