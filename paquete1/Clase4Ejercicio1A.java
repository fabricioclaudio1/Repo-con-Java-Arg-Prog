package paquete1;

public class Clase4Ejercicio1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=0,num3=0, medio=0, menor=0, mayor=0;

		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		num3 = Integer.parseInt(args[2]);
		String orden= args[3];

		System.out.println(num1+ " " + num2+ " " + num3 + " " + orden);

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
		
		System.out.println("El mayor es: "+mayor);
		System.out.println("El mediano es: "+medio);
		System.out.println("El menor es: "+menor);
		
		switch (orden) {
		case "a":
			System.out.println("Orden ascendente");
			System.out.println(menor + " " + medio + " " + mayor);
			break;
			
		case "d":
			System.out.println("Orden descendente");
			System.out.println(mayor + " " + medio + " " + menor);
			break;
			
		default:
			break;
		}
	}

}
