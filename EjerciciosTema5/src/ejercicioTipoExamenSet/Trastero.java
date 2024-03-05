package ejercicioTipoExamenSet;

import java.util.Objects;

public class Trastero {

	private double capMetros2;
	private String direccion;
	private int numTrastero;
	private double precio;
	private boolean ocupado;
	
	
	
	public Trastero() {
		super();
	}



	public Trastero(double capMetros2, String direccion, int numTrastero, double precio, boolean ocupado) {
		super();
		this.capMetros2 = capMetros2;
		this.direccion = direccion;
		this.numTrastero = numTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}



	public double getCapMetros2() {
		return capMetros2;
	}



	public void setCapMetros2(double capMetros2) {
		this.capMetros2 = capMetros2;
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
		return "Trastero [capMetros2=" + capMetros2 + ", direccion=" + direccion + ", numTrastero=" + numTrastero
				+ ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(capMetros2, direccion, numTrastero, ocupado, precio);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trastero other = (Trastero) obj;
		return Double.doubleToLongBits(capMetros2) == Double.doubleToLongBits(other.capMetros2)
				&& Objects.equals(direccion, other.direccion) && numTrastero == other.numTrastero
				&& ocupado == other.ocupado && Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	
	
}
