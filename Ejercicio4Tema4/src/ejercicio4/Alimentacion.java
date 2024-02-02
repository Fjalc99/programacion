package ejercicio4;

public class Alimentacion extends Producto {

	private double porcentajeDescuento;
	private boolean caducaEn2Dias;
	
	public Alimentacion(String nombre, int precioUnitario, double codIdentificacion, double porcentajeDescuento,
			boolean caducaEn2Dias) {
		super(nombre, precioUnitario, codIdentificacion);
		this.porcentajeDescuento = porcentajeDescuento;
		this.caducaEn2Dias = caducaEn2Dias;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isCaducaEn2Dias() {
		return caducaEn2Dias;
	}

	public void setCaducaEn2Dias(boolean caducaEn2Dias) {
		this.caducaEn2Dias = caducaEn2Dias;
	}

	@Override
	public String toString() {
		return super.toString() + "Alimentacion [porcentajeDescuento=" + porcentajeDescuento + ", caducaEn2Dias=" + caducaEn2Dias + "]";
	}

	@Override
	public double calcularPrecioUnitario() {
		// TODO Auto-generated method stub
		
		double cien=100;
		if(caducaEn2Dias) {
			return super.getPrecioUnitario() - (super.getCodIdentificacion() * porcentajeDescuento/cien);
		}else {
			return super.getPrecioUnitario();
		}
	}
	
	public void mostrarSiCaducaEn2Dias() {
		
		if(caducaEn2Dias) {
			System.out.println("Al producto anterior le queda menos de 2 días para caducar");
		}
	}
	
	
	
}
