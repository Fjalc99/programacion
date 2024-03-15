package ejercicioExamen;

public class Gasto {

	private String concepto;
	private double cantGastada;
	private int id;
	
	
	public Gasto(String concepto, double cantGastada, int id) {
		super();
		this.concepto = concepto;
		this.cantGastada = cantGastada;
		this.id = id;
	}


	public String getConcepto() {
		return concepto;
	}


	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	public double getCantGastada() {
		return cantGastada;
	}


	public void setCantGastada(double cantGastada) {
		this.cantGastada = cantGastada;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Gasto [concepto=" + concepto + ", cantGastada=" + cantGastada + ", id=" + id + "]";
	}
	
	
	
	
}
