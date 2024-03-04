package ejercicioTipoExamen2;

public class Trastero implements Comparable <Trastero> {

	private double capacidadM2;
	private String direccion;
	private int numTrastero;
	private double precio;
	private boolean ocupado;
	

	public Trastero() {
		super();
	}
	
	
	public Trastero(double capacidadM2, String direccion, int numTrastero, double precio, boolean ocupado) {
		super();
		this.capacidadM2 = capacidadM2;
		this.direccion = direccion;
		this.numTrastero = numTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}


	public double getCapacidadM2() {
		return capacidadM2;
	}


	public void setCapacidadM2(double capacidadM2) {
		this.capacidadM2 = capacidadM2;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumTrastero() {
		return numTrastero;
	}


	public void setNumTrastero(int numTrastero) {
		this.numTrastero = numTrastero;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isOcupado() {
		return ocupado;
	}


	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}


	@Override
	public String toString() {
		return "Trastero [capacidadM2=" + capacidadM2 + ", direccion=" + direccion + ", numTrastero=" + numTrastero
				+ ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}
	
	
	public int compareTo (Trastero t) {
		
		if (this.numTrastero > t.numTrastero) {
			return -1;
		}else {
			if(this.numTrastero < t.numTrastero) {
				return 1;
			}
		}
		return 0;
	}


}
