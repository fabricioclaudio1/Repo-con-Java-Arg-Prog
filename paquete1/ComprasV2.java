package paquete1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComprasV2 {
    public static void main(String[] args) {
        String archivo = "ruta/al/archivo.txt";
        //Creo 3 variables
        int cant = 0;
        double precioUnitario = 0;
        String producto = "";
        
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length == 3) { // Verificamos que la línea tenga los 3 campos esperados
                    cant = Integer.parseInt(campos[0]);
                    precioUnitario = Double.parseDouble(campos[1]);
                    producto = campos[2];
                    
                    // Aquí puedes hacer lo que quieras con los valores de las variables cant, precioUnitario y producto
                    System.out.println("Cantidad: " + cant);
                    System.out.println("Precio unitario: " + precioUnitario);
                    System.out.println("Producto: " + producto);
                }
            }
            
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}