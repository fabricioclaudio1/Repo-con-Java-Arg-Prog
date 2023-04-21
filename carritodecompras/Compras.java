package carritodecompras;
import java.util.*;
public class Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Objetos Producto
		Producto p1= new Producto("Leche", 100, 1);
		Producto p2= new Producto("Cereal", 150, 2);
		Producto p3= new Producto("Azucar", 50, 3);

		//Objetos Carrito
		Carrito c1= new Carrito(1);

		//Objetos ItemCarrito: la usare como un array
		ItemCarrito [] item= new ItemCarrito[3];

		item[0]= new ItemCarrito(c1, p1, 2);
		item[1]= new ItemCarrito(c1, p2, 3);
		item[2]= new ItemCarrito(c1, p3, 2);

		//
		mostrarCompra(item, c1);

	}//main

	public static void mostrarCompra(ItemCarrito cargaItem[], Carrito carro) {
		
		Scanner entrada= new Scanner(System.in);
		double entradaDesc= 0; 
		System.out.println("|Num. Carro: "+carro.getNum());
		for(ItemCarrito item: cargaItem) {
			System.out.println(item.getDatosItem()); 
			carro.sumarMonto(item);
		}
		System.out.println("|Total: " + carro.getMontoTotal());
		
		System.out.println("Forma de pago: ");
		System.out.println("1. Efectivo (30% de descuento).");
		System.out.println("2. Tarjeta (compra mayor a 5000 le hacemos un recargo de 1000 pesos).");
		
		//TP-Clase7
		entradaDesc=entrada.nextDouble();
		if(entradaDesc==1) {
			///Descuento Porcentual
		    Descuento dporcentaje=new DescPorcentaje();
		    dporcentaje.setMontoDesc(0.3);
		    System.out.println("Monto descuento porcentual: " + dporcentaje.descontarMonto(carro.getMontoTotal()));//Metodo de clase DescPorcentaje, abstract de Clase Descuento
		}
		else {
			if(carro.getMontoTotal()>=5000) {
				//Uso de Clase Descuento con sus respectivas Subclases
		        ///Descuento fijo
		        Descuento dfijo= new DescFijo();
		        dfijo.setMontoDesc(1000); //Metodo setter de clase Descuento
		        System.out.println("Monto descuento fijo: " + dfijo.descontarMonto(carro.getMontoTotal()));//Metodo de clase DescFijo, abstract de Clase Descuento
			}
			else {
				System.out.println("El Monto Total no tuvo descuentos");
			}
		}
		entrada.close();
		
	}

}//
