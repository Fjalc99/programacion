package ejercicio2;

public class EspadaLaser extends Producto {

	private String tipoEspada;

	public EspadaLaser(int id, double precioBase, int cantUnidades, String nombre, String tipoEspada) {
		super(id, precioBase, cantUnidades, nombre);
		this.tipoEspada = tipoEspada;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public String toString() {
		return super.toString() + " EspadaLaser [tipoEspada=" + tipoEspada + "]";
	}

	@Override
	public double calcularPVP(double porcentaje, double ExtraEspadaDoble) {
		// TODO Auto-generated method stub
		double total;
		
		total = super.getPrecioBase() + ((super.getPrecioBase() * porcentaje)/100);
		if (tipoEspada.equalsIgnoreCase("doble")) {
			total += ExtraEspadaDoble;
		}
		
		return total;
	}
	
	public void  avisarSableLaser() {
		
		System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
		
	}
	
	
	
}
