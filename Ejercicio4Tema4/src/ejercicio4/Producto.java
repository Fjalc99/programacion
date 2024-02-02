package ejercicio4;

public abstract class Producto {

	//Atributos
	
	private String nombre;
	int	precioUnitario;
	private double codIdentificacion;
	
	
	//Constructor
	public Producto(String nombre, int precioUnitario, double codIdentificacion) {
		super();
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.codIdentificacion = codIdentificacion;
	}


	//Getters and Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public double getCodIdentificacion() {
		return codIdentificacion;
	}


	public void setCodIdentificacion(double codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", codIdentificacion="
				+ codIdentificacion + "]";
	}
	
	//Metodos
	
	
	public abstract double calcularPrecioUnitario ();
}
