package ejemploPolimorfismo;

public abstract class Figura {

	private String nombre;
	private String color;

	public Figura() {

	}

	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public void metodoSoloDeFigura() {
		System.out.println("Solo estoy en la clase Figura, sin sobrescribir en las hijas");
	}
}
