package tp_integrador_pronosticos_deportivos;

public class Pronostico {
	private String equipo;
	private String pronostico;
	private int puntos=0;
	
	public Pronostico(String equipo, String pronostico) {
		this.equipo=equipo;
		this.pronostico=pronostico;
	}
	public String getEquipo() {
		return this.equipo;
	}
	
	public String getPronostico() {
		return this.pronostico;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}
}
