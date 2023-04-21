package carritodecompras;
//TP-Clase7
public class DescFijo extends Descuento {
	
	@Override
	public double descontarMonto(double montoInicial) {//Implementacion del metodo abstracto de la clase Descuento
		return (montoInicial - getMontoDesc()); //No use 'this' en 'getMontoDesc()'. Esto puede generar un problema?
	}
	
}
