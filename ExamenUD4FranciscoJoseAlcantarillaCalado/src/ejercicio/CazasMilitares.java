package ejercicio;

public class CazasMilitares extends Avion {

	private int numMisiles;

	public CazasMilitares(int id, double longitud, double litrosCombustible, int numMisiles) {
		super(id, longitud, litrosCombustible);
		this.numMisiles = numMisiles;
	}

	public int getNumMisiles() {
		return numMisiles;
	}

	public void setNumMisiles(int numMisiles) {
		this.numMisiles = numMisiles;
	}

	@Override
	public String toString() {
		return super.toString()+ "CazasMilitares [numMisiles=" + numMisiles + "]";
	}

	@Override
	public double calcularPrecioAterrizaje(double porcentaje, double extraPorMisil) {
		// TODO Auto-generated method stub
		
		
		return super.calcularPrecioAterrizaje(porcentaje,extraPorMisil) + (extraPorMisil * numMisiles);
	}
	
	
	
	
}
