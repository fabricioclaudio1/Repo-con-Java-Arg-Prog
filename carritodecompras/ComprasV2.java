package carritodecompras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComprasV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String archivo = "C:\\Users\\Fabricio\\Desktop\\ArgProg4.0- Java\\comprasv2.txt";
        int cant = 0;
        double precioUnitario = 0;
        String producto = "";
        double total=0;
        
        try {
            FileReader fr = new FileReader(archivo); //Leo datos de 'archivo
            BufferedReader br = new BufferedReader(fr); //BufferedReader junto con FileReader leen líneas de texto de un archivo de manera más eficiente y rápida.
            
            System.out.println("Cantidad    Precio Unitario    Producto");
            String linea;
            while ((linea = br.readLine()) != null) { //readLine() lee la primer linea de 'archivo' al volver a entrar al bucle lee la siguiente linea
                String[] campos = linea.split(";");
                if (campos.length == 3) { // Verificamos que la línea tenga los 3 campos esperados
                    cant = Integer.parseInt(campos[0]);
                    precioUnitario = Double.parseDouble(campos[1]);
                    producto = campos[2];
                 
                    System.out.println(cant + "           " + precioUnitario + "               " + producto);
                    total+= (cant*precioUnitario);
                }
            }
            System.out.println("Carrito Precio:  " + total);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
