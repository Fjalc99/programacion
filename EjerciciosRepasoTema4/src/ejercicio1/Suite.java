package ejercicio1;

public class Suite extends Habitacion {

	private double m2;
	private double gastoServiciosHabitaciones;
	
	
	

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes, double m2,
			double gastoServiciosHabitaciones) {
		super(precioBase, ocupada, nombreCliente, numDias, numOcupantes);
		this.m2 = m2;
		this.gastoServiciosHabitaciones = gastoServiciosHabitaciones;
	}



	public double getM2() {
		return m2;
	}



	public void setM2(double m2) {
		this.m2 = m2;
	}


	public double getGastoServiciosHabitaciones() {
		return gastoServiciosHabitaciones;
	}



	public void setGastoServiciosHabitaciones(double gastoServiciosHabitaciones) {
		this.gastoServiciosHabitaciones = gastoServiciosHabitaciones;
	}


	@Override
	public String toString() {
		return "Suite [m2=" + m2 + ", gastoServiciosHabitaciones=" + gastoServiciosHabitaciones + "]";
	}



	@Override
	public double calcularAlquiler(int descuento) {
		// TODO Auto-generated method stub
		int cien = 100;
		
		
		return (super.getPrecioBase()-(super.getPrecioBase() * descuento) / 100)+ gastoServiciosHabitaciones;
	
	}
	
	
	
	
	
}
