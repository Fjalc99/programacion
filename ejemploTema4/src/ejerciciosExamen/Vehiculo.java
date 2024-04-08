package ejerciciosExamen;

public class Vehiculo implements IAlquiler {

	private String matricula;
	private double tamMetros;
	private int añoFabricacion;
	
	public Vehiculo(String matricula, double tamMetros, int añoFabricacion) {
		super();
		this.matricula = matricula;
		this.tamMetros = tamMetros;
		this.añoFabricacion = añoFabricacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTamMetros() {
		return tamMetros;
	}

	public void setTamMetros(double tamMetros) {
		this.tamMetros = tamMetros;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tamMetros=" + tamMetros + ", añoFabricacion=" + añoFabricacion
				+ "]";
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		int cien=100;
		
		return (tamMetros * añoFabricacion) / cien;
	}

	
	
}
