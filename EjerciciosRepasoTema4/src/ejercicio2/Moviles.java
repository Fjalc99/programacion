package ejercicio2;

public class Moviles extends Producto {

	private String modelo;

	public Moviles(int id, double precioBase, int cantUnidades, String nombre, String modelo) {
		super(id, precioBase, cantUnidades, nombre);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString() +" Moviles [modelo=" + modelo + "]";
	}

	@Override
	public double calcularPVP(double porcentaje, double ExtraEspadaDoble) {
		// TODO Auto-generated method stub
		return super.getPrecioBase() +  ((super.getPrecioBase() * porcentaje) / 100);
	}

	
	
	
}
