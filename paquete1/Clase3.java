package paquete1;

public class Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Replace, reemplazo a "os dias" por "as tardes"
	    String texto1="buenos dias";
		String texto5 = texto1.replace("os dias","as tardes");
		System.out.println(texto5);


		//texto2 contiene "has"?
		String texto2="como has estado";
		boolean texto6 = texto2.contains("has");//contains

		System.out.println(texto6);

		//texto5 contiene "des"?
		boolean texto7 = texto5.endsWith("des");
		System.out.println(texto7);
		
		
	}
}
