package EjercicioTipoExamenv3;

public class Cancion implements Comparable <Cancion> {

	
	private int id;
	private String titulo;
	private String interprete;
	private int numVecesEscuchada;
	private boolean precio;
	private double duracion;
	
	
	public Cancion(int id, String titulo, String interprete, int numVecesEscuchada, boolean precio, double duracion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.numVecesEscuchada = numVecesEscuchada;
		this.precio = precio;
		this.duracion = duracion;
	}

	

	public Cancion() {
		super();
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getInterprete() {
		return interprete;
	}


	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}


	public int getNumVecesEscuchada() {
		return numVecesEscuchada;
	}


	public void setNumVecesEscuchada(int numVecesEscuchada) {
		this.numVecesEscuchada = numVecesEscuchada;
	}


	public boolean isPrecio() {
		return precio;
	}


	public void setPrecio(boolean precio) {
		this.precio = precio;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", numVecesEscuchada="
				+ numVecesEscuchada + ", precio=" + precio + ", duracion=" + duracion + "]";
	}
	
	
	

	@Override
	public int compareTo(Cancion c) {
		// TODO Auto-generated method stub
		return c.getInterprete().toLowerCase().compareTo(this.interprete.toLowerCase());
	}



	
	
}
