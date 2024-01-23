package ejercicio1Interfces;

public class Objeto {

	
	private boolean prestado;

	public Objeto(boolean prestado) {
		
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Objeto [prestado=" + prestado + "]";
	}
	
	
	
}
