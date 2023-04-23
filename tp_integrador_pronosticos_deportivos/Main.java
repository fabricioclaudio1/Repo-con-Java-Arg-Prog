package tp_integrador_pronosticos_deportivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fResultado = new File("C:\\Users\\Fabricio\\Desktop\\ArgProg4.0- Java\\resultados.txt");
		File fPronostico = new File("C:\\Users\\Fabricio\\Desktop\\ArgProg4.0- Java\\pronostico.txt");
		
		String arrayResultado[]; //Aca guardare los datos del archivo resultado
		Equipo []equip= new Equipo[2]; 
		equip[0]=new Equipo();
		equip[1]=new Equipo();
		Partido partidos;
		
		String arrayPronostico[];
		Pronostico pronost = null;
		
		int sumaPuntos=0;
		
		try {
			Scanner readerResultado = new Scanner(fResultado);
			Scanner readerPronostico = new Scanner(fPronostico);
			while (readerPronostico.hasNextLine() && readerResultado.hasNextLine()) {
				
				String lineResultado= readerResultado.nextLine(); //obtengo linea de archivo resultado
				arrayResultado= lineResultado.split(","); //Guardo en un array los datos de archivo resultado
				equip[0].setNombre(arrayResultado[0]);
				equip[1].setNombre(arrayResultado[1]);
				partidos= new Partido(equip[0], equip[1], Integer.parseInt(arrayResultado[2]), Integer.parseInt(arrayResultado[3]));
				
				String linePronostico = readerPronostico.nextLine();//obtengo linea de archivo pronostico
				arrayPronostico=linePronostico.split(",");
				pronost= new Pronostico(arrayPronostico[0], arrayPronostico[1]);
				
				sumaPuntos += resultadoPronostico(partidos, pronost);
			}
			pronost.setPuntos(sumaPuntos);
			System.out.println("Puntaje total: " + pronost.getPuntos());
			
			readerPronostico.close();
			readerResultado.close();

		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encontró en la ubicación especificada.");
			e.printStackTrace(); //Proporciona info para encontrar el error
		}
		
	}//fin-main
	
	public static int resultadoPronostico(Partido partidos,Pronostico pronost) {
		partidos.info();
		System.out.print("Tu pronostico este partido fue: ");
		if(pronost.getPronostico().equals("1")) {
			System.out.println("Gana " + partidos.getNombre1());
		}
		else if(pronost.getPronostico().equals("2")) {
			System.out.println("Pierde " + partidos.getNombre1());
		}
		else {
			System.out.println("Empate");
		}
		
		System.out.print("Puntaje: ");
		if(partidos.resultado().equals(pronost.getPronostico())) {
			System.out.println("1");
			return 1;
		}
		else {
			System.out.println("0");
			return 0;
		}
		
		
	}

}
