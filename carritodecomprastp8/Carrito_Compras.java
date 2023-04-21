package carritodecomprastp8;

public class Carrito_Compras {
	private int numCarrito;
	private Persona persona;
	private Producto producto;
	private int cantidad;
	private double monto;
	
	public Carrito_Compras(Persona per1, int numero) {
		numCarrito=numero;
		persona = per1;
		monto = 0.0;
	}
	public int dameNumero() {
		return numCarrito;
	}
	public Persona damePersona() {
		return persona;
	}
	public double montoCarrito() {
		return monto;
	}
	public int dameCantidad() {
		return cantidad;
	}
	public double dameMonto() {
		return monto;
	}
	public Producto dameProducto() {
		return producto;
	}
	public void verCompras() {
		System.out.println(cantidad+ "     "+producto.un_nombre()+"       "+producto.un_precio()+"         "+monto );
	}


}
