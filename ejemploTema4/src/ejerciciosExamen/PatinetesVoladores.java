package ejerciciosExamen;

public class PatinetesVoladores extends Vehiculo implements IAlquiler {

	private double potenciaPatinete;

	public PatinetesVoladores(String matricula, double tamMetros, int añoFabricacion, double potenciaPatinete) {
		super(matricula, tamMetros, añoFabricacion);
		this.potenciaPatinete = potenciaPatinete;
	}

	public double getPotenciaPatinete() {
		return potenciaPatinete;
	}

	public void setPotenciaPatinete(double potenciaPatinete) {
		this.potenciaPatinete = potenciaPatinete;
	}

	@Override
	public String toString() {
		return "PatinetesVoladores [potenciaPatinete=" + potenciaPatinete + "]";
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		
		
		return super.calcularPrecio() + potenciaPatinete;
	}

	public void avisarPatinete () {
		
		System.out.println("¡Cuidado que voy volando!");
	}
	
}
