package paquete1;

public class Clase3Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nombres a array_nombres
		String nombres="hernan;leonel;julian;enzo;roman;andres;rodrigo;javier;ignacio;matias";

		String array_nombres[] = nombres.split(";");

		for (String nom : array_nombres) { // for mejorado

		    System.out.println(nom);
		
		}
	}

}
