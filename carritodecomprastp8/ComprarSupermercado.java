package carritodecomprastp8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ComprarSupermercado {

	public static void main(String[] args) throws IOException {
		

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
            Persona per1 = new Persona("Claudio","Fabricio", 39218910);//se ejemplariza persona
            Carrito_Compras carr1 = new Carrito_Compras(per1, 001);//se instancia un carro
            
        	ItemCarrito cargaItem[] = new ItemCarrito[3]; //se crea un vector de objetos de clase ItemCarrito
        	
    		cargaItem[0] = new ItemCarrito(carr1,cargaProducto,3,0); 					
    		cargaItem[1] = new ItemCarrito(carr1,cargaProducto,2,1);		
    		cargaItem[2] = new ItemCarrito(carr1,cargaProducto,5,2);
    		
    		mostrarCompras(cargaItem,carr1,per1);
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no está disponible o no exite");
        } finally{
        	if (entrada != null)
           entrada.close();           
        }  	
	}
        
public static void cargarProductos(String cadena, Producto cargaProducto[],int i) {

	String[] items = cadena.split(",");
	
	int codigo = Integer.parseInt(items[0]);
	String nombre = items[1];
	double precio = Double.parseDouble(items[2]);
	int stock = Integer.parseInt(items[3]);	
	
	cargaProducto[i] = new Producto(codigo,nombre," ",precio,stock);//dejo vacia la descripcion, aqui pueden
																	//modificarlo
	
}
	
public static void mostrarCompras(ItemCarrito cargaItem[],Carrito_Compras carr1, Persona per1) {
	
		double suma =0;
		System.out.println("Carrito de compras: "+carr1.dameNumero()+"--Persona: "+per1.un_nombre());
		 cargaItem[0].mostrarTitulo();
		for (ItemCarrito items:cargaItem) {
			 items.mostrarItems();
			 suma= suma +items.dameMonto();
		}

		System.out.println("\nEl Total del carrito es: "+ suma);
		mostrarDescuento(suma);
	}
public static void mostrarDescuento(double suma) {
	
	 LocalDate dia = LocalDate.now();
     int descuento = dia.getDayOfMonth();  
   
     if (descuento%2!=0) {
    	 Descuento desc1 = new DescuentoFijo();
    	 desc1.montoDescuento(550.20);
    	 System.out.println("El monto con descuento es: "+ desc1.montoFinal(suma));
     }
     else {
    	 Descuento desc2 = new DesuentoTopoPorcentaje();
    	 desc2.montoDescuento(10);
    	 System.out.println("El monto con descuento es: "+desc2.montoFinal(suma));
     }
	
	}
}



