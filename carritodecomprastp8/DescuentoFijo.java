package carritodecomprastp8;

public class DescuentoFijo extends Descuento {
	
	@Override
	public double montoFinal(double montoInicial) {
		return montoInicial - this.dameMonto();
	}
}
