package tp_integrador_pronosticos_deportivos;

public class Equipo {
	private String nombre; //Variable
	private String descripcion; //Variable
	
	public Equipo() { //Metodo Constructor
	}
	
	public String getNombre() {//Metodo Getter
		return nombre;
	}
	
	public String getDescripcion() {//Metodo Getter
		return descripcion;
	}
	
	
	public void setDescripcion(String descripcion) {//Metodo Setter
		this.descripcion=descripcion;
	}
	public void setNombre(String nombre) {//Metodo Setter
		this.nombre=nombre;
	}
	
	
}
