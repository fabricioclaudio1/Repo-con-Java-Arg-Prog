package carritodecompras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ComprasTP8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        Producto cargaProducto[] = new Producto[3];//Se instancia un objeto tipo vector de la clase Producto

		File f = new File("C:\\Users\\Fabricio\\Desktop\\ArgProg4.0- Java\\carritoCompras2.txt");
        String cadena;
        Scanner entrada = null;


        try {
            entrada = new Scanner(f);         //se crea un Scanner asociado al fichero

            while (entrada.hasNext()) {       //mientras no se alcance el final del fichero  
            	 for (int i=0; i<cargaProducto.length; i++) {
                     cadena = entrada.nextLine();  //se lee una línea del fichero
                     int indice = i;
                     cargarProductos(cadena, cargaProducto, indice);//llama al metodo donde se cargan los productos               
            	 }
            }
            //Persona per1 = new Persona("Claudio","Fabricio", 39218910);//se ejemplariza persona
            Carrito carr1 = new Carrito(001);//se instancia un carro

        	ItemCarrito cargaItem[] = new ItemCarrito[3]; //se crea un vector de objetos de clase ItemCarrito

    		cargaItem[0] = new ItemCarrito(carr1,cargaProducto[0],3); 					
    		cargaItem[1] = new ItemCarrito(carr1,cargaProducto[1],2);		
    		cargaItem[2] = new ItemCarrito(carr1,cargaProducto[2],5);

    		mostrarCompras(cargaItem,carr1);

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no está disponible o no exite");
        } finally{
        	if (entrada != null)
           entrada.close();           
        }  	
	}

public static void cargarProductos(String cadena, Producto cargaProducto[],int i) {

	String[] items = cadena.split(",");

	String nombre = items[0];
	double precio = Double.parseDouble(items[1]);
	int stock = Integer.parseInt(items[2]);	

	cargaProducto[i] = new Producto(nombre,precio,stock);															//modificarlo

}

public static void mostrarCompras(ItemCarrito cargaItem[],Carrito carr1) {

		double suma =0;
		System.out.println("Carrito de compras: "+carr1.getNum()+"|Persona:-- ");
		System.out.println("Prod    Cant\tPrecio\tSub-Total");
		for (ItemCarrito items:cargaItem) {
			 items.datosItem();
			 suma= suma +items.getMontoItem();
		}

		System.out.println("\nEl Total del carrito es: "+ suma);
		mostrarDescuento(suma);
}
public static void mostrarDescuento(double suma) {

	 LocalDate dia = LocalDate.now();
     int descuento = dia.getDayOfMonth();  

     if (descuento%2!=0) {
    	 Descuento desc1 = new DescFijo();
    	 desc1.setMontoDesc(550.20);
    	 System.out.println("El monto con descuento es: "+ desc1.descontarMonto(suma));
     }
     else {
    	 Descuento desc2 = new DescTopoPorcentajeTP8();
    	 desc2.setMontoDesc(10);
    	 System.out.println("El monto con descuento es: "+desc2.descontarMonto(suma));
     }

}

}
