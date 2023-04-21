package carritodecomprastp8;

public class DescuentoPorcentaje extends Descuento {
	
	public double montoFinal(double montoInicial) {
		return montoInicial - (montoInicial * this.dameMonto()/100);
	}

}
