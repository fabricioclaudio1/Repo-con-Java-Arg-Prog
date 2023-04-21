package carritodecompras;

public class DescTopoPorcentajeTP8 extends Descuento {
	
	public double descontarMonto(double montoInicial) {
		 double tope = montoInicial - (montoInicial * this.getMontoDesc()/100);
		 if (tope > 500) {
			 return 500;
		 }
		 else 
		 return tope;
	}
}
