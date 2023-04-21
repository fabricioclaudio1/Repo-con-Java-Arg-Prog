package carritodecomprastp8;

public abstract class Descuento {
	private double descuento;
	
	public abstract double montoFinal(double montoInicial);
	
	public double dameMonto() {
		return descuento;
	}
	public void montoDescuento(double desc) {
		descuento = desc;
	}
}
