package carritodecompras;
//TP-Clase7
public class DescPorcentaje extends Descuento{
	
	@Override
	public double descontarMonto(double montoInicial) {//Implementacion del metodo abstracto de la clase Descuento
		return montoInicial - (montoInicial * getMontoDesc());
	}
}
