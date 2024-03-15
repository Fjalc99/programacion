package ejemplo3;

public class Vehiculo {
	
	//Atributos
	private String nombre;
	private int numeroRuedas;
	private double precio;
	
	//Constructor
	
	public Vehiculo (String nombre, int numeroRuedas, double precio) {
		this.nombre=nombre;
		this.numeroRuedas=numeroRuedas;
		this.precio=precio;
	}
	
	//Metodos
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
		
	}
	
	public int getNumeroRuedas () {
		return numeroRuedas;
	}
	
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas=numeroRuedas;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}

}
