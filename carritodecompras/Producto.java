package carritodecompras;

public class Producto {//Variables, Métodos Constructores, Métodos Getters: se utiliza para acceder a variables 'privadas'..
	                   //..Métodos Setters: se utiliza para establecer el valor de una variable 'privada'
	                   //En resumen, los Métodos Getters y Setters son los Métodos diseñados para obtener o asignar valores a los atributos 
	private String nombre; //Variable
	private double precio; //Variable
	private int codigo; //Variable
	
	public Producto(String nombre, double precio, int codigo) { //Método constructor
		this.nombre=nombre;
		this.precio=precio;
		this.codigo=codigo;
	}
	
	public String getNombre() {// Método getter: accedo a la variable privada nombre
		return nombre;
	}
	
	public double getprecio() {// Método getter: accedo a la variable privada precio
		return precio;
	}
	
	public int getCodigo() {// Método getter: accedo a la variable privada codigo
		return codigo;
	}
	
}
