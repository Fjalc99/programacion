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



	public double calcularPrecioBillete(Ticket t) {
		
		
		return  t.getPrecio() * t.getNumPersonas();	
	}
	
	
	public double calcularVuelta (double paga) {
		
		return paga - calcularPrecioBillete(t);		
	}
	
public double calcularVueltaV2 (double paga) {
		
		if(paga< calcularPrecioBillete(t)) {
			return -1;
		}else {
			return paga - calcularPrecioBillete(t);
		}
	}
}
