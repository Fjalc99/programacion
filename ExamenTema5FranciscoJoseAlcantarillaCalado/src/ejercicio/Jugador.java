package ejercicio;

public class Jugador implements Comparable <Jugador> {

	private String nombre;
	private String posicion;
	private int dorsal;
	private int golesAnotados;
	private boolean titular;
	
	
	public Jugador(String nombre, String posicion, int dorsal, int golesAnotados, boolean titular) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.dorsal = dorsal;
		this.golesAnotados = golesAnotados;
		this.titular = titular;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public int getGolesAnotados() {
		return golesAnotados;
	}


	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}


	public boolean isTitular() {
		return titular;
	}


	public void setTitular(boolean titular) {
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", dorsal=" + dorsal + ", golesAnotados="
				+ golesAnotados + ", titular=" + titular + "]";
	}


	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return (this.getPosicion().toLowerCase().compareTo(o.getPosicion().toLowerCase()));
	}
	
	
	
	
}
