package carritodecomprastp8;

public class ItemCarrito {
	public ItemCarrito (Carrito_Compras num, Producto [] p, int cantidad,int i) {
		carro=num.dameNumero();
		prodI = p;
		this.cantidad = cantidad;
		montoItem = prodI[i].un_precio() * cantidad;
		montoTotal=0.0;
		this.i=i;
	}
	
	private int carro;
	private int cantidad;
	private double montoItem;
	private double montoTotal;
	private Producto []prodI;	
	private int i;
	
	public int dameCarro() {
		return carro;
	}
	public double dameMonto() {
		return montoItem;
	}
	public double dameMontoT() {
		return montoTotal;
	}	
	public void mostrarItems() {
		System.out.println(prodI[i].un_nombre()+"\t"+cantidad+"\t" +prodI[i].un_precio()+
				"\t"+ String.format("%.2f", montoItem) );	
	}
	public void mostrarTitulo() {
		System.out.println("Prod    Cant\tPrecio\tSub-Total");
	}
	
	public String  dameNombre() {
		String nombre = prodI[i].un_nombre();
		return nombre;
	}
	
}
