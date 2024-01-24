package ejercicio1Interfces;

public class Revista extends Publicaciones {

	private int edicion;

	public Revista(String titulo, String autor, String editorial, int anyoPublcacion, int numPaginas, boolean prestado,
			int edicion) {
		super(titulo, autor, editorial, anyoPublcacion, numPaginas, prestado);
		this.edicion = edicion;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	@Override
	public String toString() {
		return "Revista [edicion=" + edicion + "]";
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
