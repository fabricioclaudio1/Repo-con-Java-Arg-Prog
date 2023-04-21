package carritodecomprastp8;

public class DesuentoTopoPorcentaje extends Descuento {

	public double montoFinal(double montoInicial) {
		 double tope = montoInicial - (montoInicial * this.dameMonto()/100);
		 if (tope > 500) {
			 return 500;
		 }
		 else 
		 return tope;
	}

}