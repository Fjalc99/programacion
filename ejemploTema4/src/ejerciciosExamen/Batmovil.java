package ejerciciosExamen;

public class Batmovil extends Vehiculo {

	private int numRuedas;

	public Batmovil(String matricula, double tamMetros, int añoFabricacion, int numRuedas) {
		super(matricula, tamMetros, añoFabricacion);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Batmovil [numRuedas=" + numRuedas + "]";
	}
	
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		
		int dos=2;
		return super.calcularPrecio() + (numRuedas*dos);
	}

}
