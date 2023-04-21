package carritodecompras;

public class ItemCarrito { //Variables, Métodos Constructores, Métodos Getters
	private Carrito carro; //Variable
	private Producto prod; //Variable
	private int cantidad; //Variable
	private double montoItem; //Variable
	
	public ItemCarrito(Carrito carro, Producto prod, int cantidad) {
		this.carro=carro;
		this.prod=prod;
		this.cantidad=cantidad;
		montoItem=prod.getprecio()*cantidad;
	}
	
	public double getMontoItem() {//Método Getter
		return montoItem;
	}
	
	public String getDatosItem() { //Métodos Getter
		return "|Num. Carro: "+carro.getNum()+"|Producto: "+ prod.getNombre()+" |Cantidad: " +cantidad+ " |Precio: "
				+prod.getprecio()+" |Sub Total: "+ montoItem;
	}
	
}
