package ejercicio2;

public abstract class Producto {

	private int id;
	private double precioBase;
	private int cantUnidades;
	private String nombre;
	
	
	
	public Producto(int id, double precioBase, int cantUnidades, String nombre) {
		super();
		this.id = id;
		this.precioBase = precioBase;
		this.cantUnidades = cantUnidades;
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getPrecioBase() {
		return precioBase;
	}



	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}



	public int getCantUnidades() {
		return cantUnidades;
	}



	public void setCantUnidades(int cantUnidades) {
		this.cantUnidades = cantUnidades;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Producto [id=" + id + ", precioBase=" + precioBase + ", cantUnidades=" + cantUnidades + ", nombre="
				+ nombre + "]";
	}
	
	
	public abstract double calcularPVP(double porcentaje, double ExtraEspadaDoble);
		
		
	
	
	
}
