package ejercicio10;

public class Ticket {

	private double precio;
	private int numPersonas;
	private String destino;
	
	
	
	public Ticket(double precio, int numPersonas, String destino) {
		
		this.precio = precio;
		this.numPersonas = numPersonas;
		this.destino = destino;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getNumPersonas() {
		return numPersonas;
	}


	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	@Override
	public String toString() {
		return "Ticket [precio=" + precio + ", numPersonas=" + numPersonas + ", destino=" + destino + "]";
	}
	
	
}
