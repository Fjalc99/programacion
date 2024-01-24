package ejercicio1Interfces;

public abstract class Publicaciones implements IPublicaciones {

	
	private String titulo;
	private String autor;
	private String editorial;
	private int anyoPublcacion;
	private int numPaginas;
	private boolean prestado;
	
	
	public Publicaciones(String titulo, String autor, String editorial, int anyoPublcacion, int numPaginas,
			boolean prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.anyoPublcacion = anyoPublcacion;
		this.numPaginas = numPaginas;
		this.prestado = prestado;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getAnyoPublcacion() {
		return anyoPublcacion;
	}


	public void setAnyoPublcacion(int anyoPublcacion) {
		this.anyoPublcacion = anyoPublcacion;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	@Override
	public String toString() {
		return "Publicaciones [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", anyoPublcacion="
				+ anyoPublcacion + ", numPaginas=" + numPaginas + ", prestado=" + prestado + "]";
	}


	
	@Override
	public abstract int cuentaPrestados(Publicaciones[] lista);


	@Override
	public abstract int publicacionesAnterioresA(Publicaciones[] lista, int anyo) ;

	
	

	

	
	
	
}
