package ejercicioExamenA;

public class Piso {

	private String direccion;
	private int numM2;
	private int estado;
	private double precioVenta;
	private int id;
	
	
	
	public Piso() {
		super();
	}


	public Piso(String direccion, int numM2, int estado, double precioVenta, int id) {
		super();
		this.direccion = direccion;
		this.numM2 = numM2;
		this.estado = estado;
		this.precioVenta = precioVenta;
		this.id = id;
	}
 

	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumM2() {
		return numM2;
	}


	public void setNumM2(int numM2) {
		this.numM2 = numM2;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", numM2=" + numM2 + ", estado=" + estado + ", precioVenta="
				+ precioVenta + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
}
