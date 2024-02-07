package ejercicio10;

public class Maquina {
	
	private Ticket t;

	public Maquina(Ticket t) {
		super();
		this.t = t;
	}
	
	

	@Override
	public String toString() {
		return "Maquina [t=" + t + "]";
	}



	public Ticket getT() {
		return t;
	}



	public void setT(Ticket t) {
		this.t = t;
	}



	public double calcularPrecioBillete(double precio, int numPersonas) {
		
		
		return  precio * numPersonas;	
	}
}
