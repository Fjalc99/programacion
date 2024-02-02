package ejercicio4;

public class Electronica extends Producto {

	
	private double porcentajeImpuestos;

	public Electronica(String nombre, int precioUnitario, double codIdentificacion, double porcentajeImpuestos) {
		super(nombre, precioUnitario, codIdentificacion);
		this.porcentajeImpuestos = porcentajeImpuestos;
	}

	public double getPorcentajeImpuestos() {
		return porcentajeImpuestos;
	}

	public void setPorcentajeImpuestos(double porcentajeImpuestos) {
		this.porcentajeImpuestos = porcentajeImpuestos;
	}

	@Override
	public String toString() {
		return super.toString() + "Electronica [porcentajeImpuestos=" + porcentajeImpuestos + "]";
	}

	@Override
	public double calcularPrecioUnitario() {
		// TODO Auto-generated method stub
		double cien=100;
		
		return super.getPrecioUnitario() + (super.getPrecioUnitario() * porcentajeImpuestos/cien);
	}
	
	//Como no tenemos que hacer el metodo con llaves en la madre hace falta sobrescribir el metodo en las hijas 
	//haciendo el metodo de arriba abstracto
}
