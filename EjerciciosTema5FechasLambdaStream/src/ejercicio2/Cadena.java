package ejercicio2;

public class Cadena {
	
	
	private String texto;

	public Cadena(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Cadena [texto=" + texto + "]";
	}
	
	
	
	
	
}
