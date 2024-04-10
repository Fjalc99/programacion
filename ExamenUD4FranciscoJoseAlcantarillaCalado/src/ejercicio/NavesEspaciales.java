package ejercicio;

public class NavesEspaciales extends Avion {

	private int numMotores;

	public NavesEspaciales(int id, double longitud, double litrosCombustible, int numMotores) {
		super(id, longitud, litrosCombustible);
		this.numMotores = numMotores;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	@Override
	public String toString() {
		return super.toString() + "NavesEspaciales [numMotores=" + numMotores + "]";
	}

	@Override
	public double calcularPrecioAterrizaje(double porcentaje, double extraPorMisil) {
		// TODO Auto-generated method stub
		double cien=100.0;
		int cuatro=4;
		
		if (numMotores > cuatro ) {
			
			return super.calcularPrecioAterrizaje(porcentaje, extraPorMisil) + ((super.calcularPrecioAterrizaje(porcentaje, extraPorMisil) * porcentaje)/cien );
		}else {
			return super.calcularPrecioAterrizaje(porcentaje, extraPorMisil);
		}
		
	}
	
	public void avisarExtraterrestres() {
		System.out.println("Nave espacial, llamen a los men in black");
	}
	
	
	
}
