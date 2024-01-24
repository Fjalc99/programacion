package ejercicio1Interfces;

public class Libro extends Publicaciones {

	private String isbn;

	public Libro(String titulo, String autor, String editorial, int anyoPublcacion, int numPaginas, boolean prestado,
			String isbn) {
		super(titulo, autor, editorial, anyoPublcacion, numPaginas, prestado);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + "]";
	}

	@Override
	public int cuentaPrestados(Publicaciones[] lista) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int publicacionesAnterioresA(Publicaciones[] lista, int anyo) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
