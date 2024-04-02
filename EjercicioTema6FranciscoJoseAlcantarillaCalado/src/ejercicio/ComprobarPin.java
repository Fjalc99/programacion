package ejercicio;

public class ComprobarPin extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ComprobarPin () {
		
		super();
	}
	
	
	public ComprobarPin (String texto) {
		
		super(texto);
	}
	
	
}
