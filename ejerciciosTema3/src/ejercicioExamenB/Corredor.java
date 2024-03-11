package ejercicioExamenB;

public class Corredor {

	
	private String nombre;
	private String apellidos;
	private int dorsal;
	private int categoria;
	private double tiempoEnMin;
	
	public Corredor(String nombre, String apellidos, int dorsal, int categoria, double tiempoEnMin) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dorsal = dorsal;
		this.categoria = categoria;
		this.tiempoEnMin = tiempoEnMin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
 
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getTiempoEnMin() {
		return tiempoEnMin;
	}

	public void setTiempoEnMin(double tiempoEnMin) {
		this.tiempoEnMin = tiempoEnMin;
	}

	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellidos=" + apellidos + ", dorsal=" + dorsal + ", categoria="
				+ categoria + ", tiempoEnMin=" + tiempoEnMin + "]";
	}  
	
	
	
}
