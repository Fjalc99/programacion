package ejercicio;

public class Magdalena {
	
	private int id;
	private String sabor;
	private double volumenMasa;
	private boolean normal;
	
	public Magdalena(int id, String sabor, double volumenMasa, boolean normal) {
		super();
		this.id = id;
		this.sabor = sabor;
		this.volumenMasa = volumenMasa;
		this.normal = normal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getVolumenMasa() {
		return volumenMasa;
	}

	public void setVolumenMasa(double volumenMasa) {
		this.volumenMasa = volumenMasa;
	}

	public boolean isNormal() {
		return normal;
	}

	public void setNormal(boolean normal) {
		this.normal = normal;
	}

	@Override
	public String toString() {
		return "Magdalena [id=" + id + ", sabor=" + sabor + ", volumenMasa=" + volumenMasa + ", normal=" + normal + "]";
	}
	
	
	
	
	
	
	
}
