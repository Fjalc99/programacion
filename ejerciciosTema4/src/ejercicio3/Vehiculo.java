package ejercicio3;

public class Vehiculo {

	private int emisiones;
	private double cilindradas;
	private double potencia;
	
	
	public Vehiculo(int emisiones, double cilindradas, double potencia) {
		super();
		this.emisiones = emisiones;
		this.cilindradas = cilindradas;
		this.potencia = potencia;
		
		
	}


	public int getEmisiones() {
		return emisiones;
	}


	public void setEmisiones(int emisiones) {
		this.emisiones = emisiones;
	}


	public double getCilindradas() {
		return cilindradas;
	}


	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	@Override
	public String toString() {
		return "Vehiculo [emisiones=" + emisiones + ", cilindradas=" + cilindradas + ", potencia=" + potencia + "]";
	}
	
	
}
