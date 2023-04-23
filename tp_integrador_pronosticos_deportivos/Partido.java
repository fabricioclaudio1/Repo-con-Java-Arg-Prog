package tp_integrador_pronosticos_deportivos;
//+ publico - privado
public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2, int goles1, int goles2) {
		this.equipo1=equipo1;
		this.equipo2=equipo2;
		this.golesEquipo1=goles1; //Integer.parseInt(result[2]);
		this.golesEquipo2=goles2; //Integer.parseInt(result[3]);
	}
	public void info() {
		System.out.println(equipo1.getNombre() + " " + golesEquipo1 + " | " + golesEquipo2 + " " + equipo2.getNombre());
	}
	
	public String getNombre1() {
		return equipo1.getNombre();
	}
	
	public String getNombre2() {
		return equipo2.getNombre();
	}
	
	public String resultado() {
		if(golesEquipo1>golesEquipo2) {
			return "1"; //Gana equipo1
		}
		else {
			if(golesEquipo2>golesEquipo1) {
				return "2"; //Pierde equipo1
			}
			else {
				return "0"; //Empate
			}
		}
	}
}
