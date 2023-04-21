package paquete1;

public class Clase1Ejercicio2 {

	public static void main(String[] args) {
		int ingresoMensual, cantVehiculos, cantInmuebles/*, propiedadLujo*/;
		
		ingresoMensual=580000;
		cantVehiculos=3;
		cantInmuebles=3;
		/*propiedadLujo=4;*/
		
		
		if(ingresoMensual<163539 || cantVehiculos <=1 || cantInmuebles<=1) {
	        System.out.println("Ud pertenece a categoria I");
		}
		else if((ingresoMensual>163539 && ingresoMensual<572386.50) || cantVehiculos<=1 || cantInmuebles<=2) {
			System.out.println("Ud pertenece a categoria II");
		}
		else if (ingresoMensual>572386.50 || cantVehiculos>=3 || cantInmuebles>=3) {
			System.out.println("Ud pertenece a categoria III");
		}
	}
}
