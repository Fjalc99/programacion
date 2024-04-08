package ejercicio1;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDias;
	private int numOcupantes;
	
	
	
	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.numOcupantes = numOcupantes;
	}



	public double getPrecioBase() {
		return precioBase;
	}



	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}



	public boolean isOcupada() {
		return ocupada;
	}



	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public int getNumDias() {
		return numDias;
	}



	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}



	public int getNumOcupantes() {
		return numOcupantes;
	}



	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}
	
	
	
	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", numDias=" + numDias + ", numOcupantes=" + numOcupantes + "]";
	}



	public double calcularAlquiler (int descuento) {
		
		return precioBase * numDias;
		
		
	}
	
	
}
