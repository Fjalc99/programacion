package ejemplotienda;

public class Producto {
	
	//Atributos
	private String codigo;
	private String nombre;
	private double precioUnitario;
	private boolean activo;
	
	
	//Construtores
	
	public Producto(String codigo, String nombre, double precioUnitario, boolean activo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.activo = activo;
	}

	//get and setters

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
}
