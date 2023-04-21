package carritodecompras;

public class Carrito {//Variables, Métodos Constructores, Métodos Getters, Métodos Setters
	private int num;
	private double montoTotal;
	//private Cliente client;

	public Carrito(int num) {/*, Cliente client*/
		this.num=num;
		montoTotal=0.0;
		//this.client=client;
	}

	public int getNum() {//Método Getter
		return num;
	}

	public double getMontoTotal() {//Método Getter
		return montoTotal;
	}

	public void sumarMonto(ItemCarrito montoItem) { //Método Setter
		montoTotal= montoTotal + montoItem.getMontoItem();
	}

}
