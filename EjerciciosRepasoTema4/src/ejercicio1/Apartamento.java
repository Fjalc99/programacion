package ejercicio1;

public class Apartamento extends Habitacion {

	private double servicioLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes,
			double servicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, numDias, numOcupantes);
		this.servicioLimpieza = servicioLimpieza;
	}

	public double getServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(double servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + "]";
	}

	@Override
	public double calcularAlquiler(int descuento) {
		// TODO Auto-generated method stub
		return super.calcularAlquiler(descuento) + servicioLimpieza ;
	}
	
	
	
}
