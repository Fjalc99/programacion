package ejercicio3;

public class ComprobarAyB extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ComprobarAyB () {
		super();
	}
	
	public ComprobarAyB (String texto) {
		super(texto);
	}
}
