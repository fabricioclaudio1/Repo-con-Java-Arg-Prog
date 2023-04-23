package carritodecompras;
//TP-Clase7
public abstract class Descuento {//Variables o atributos, 
    private double montoDesc;
	
    //Sin Metodo Constructor. No necesita un estado inicial?
    
    public double getMontoDesc() { //Método Getter
    	return montoDesc;
    }
    
	public void setMontoDesc(double montoDesc) { //Método Setter
		this.montoDesc=montoDesc;
	}
	
	public abstract double descontarMonto(double montoInicial); //Método abstracto
}
