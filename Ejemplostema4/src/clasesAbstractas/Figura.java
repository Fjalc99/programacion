package clasesAbstractas;

public abstract class Figura {

	// Puntos para graficar
	private double x;
	private double y;

	// El constructor no lo usamos para instanciar sino para definirla en la
	// subclase

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract double calcularArea();

}
