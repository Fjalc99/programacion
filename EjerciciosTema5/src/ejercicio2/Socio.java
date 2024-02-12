package ejercicio2;

public class Socio {

	private String nombre;
	private int edad;
	private String dni;
	private double cuota;
	
	
	
	public Socio(String nombre, int edad, String dni, double cuota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.cuota = cuota;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public double getCuota() {
		return cuota;
	}



	public void setCuota(double cuota) {
		this.cuota = cuota;
	}



	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", cuota=" + cuota + "]";
	}
	
	
	
	
	
	
	
}
