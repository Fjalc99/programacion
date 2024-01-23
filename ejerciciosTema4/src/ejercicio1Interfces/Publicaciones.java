package ejercicio1Interfces;

public class Publicaciones {

	private int cantPublicaciones;

	public Publicaciones(int cantPublicaciones) {
		
		this.cantPublicaciones = cantPublicaciones;
	}

	public int getCantPublicaciones() {
		return cantPublicaciones;
	}

	public void setCantPublicaciones(int cantPublicaciones) {
		this.cantPublicaciones = cantPublicaciones;
	}

	@Override
	public String toString() {
		return "Publicaciones [cantPublicaciones=" + cantPublicaciones + "]";
	}
	
	
}
