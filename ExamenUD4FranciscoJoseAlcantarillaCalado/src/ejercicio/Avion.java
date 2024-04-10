package ejercicio;

public class Avion implements IAterrizaje {

	private int id;
	private double longitud;
	private double litrosCombustible;
	
	
	public Avion(int id, double longitud, double litrosCombustible) {
		super();
		this.id = id;
		this.longitud = longitud;
		this.litrosCombustible = litrosCombustible;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}


	public double getLitrosCombustible() {
		return litrosCombustible;
	}


	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}


	@Override
	public String toString() {
		return "Avion [id=" + id + ", longitud=" + longitud + ", litrosCombustible=" + litrosCombustible + "]";
	}


	@Override
	public double calcularPrecioAterrizaje(double porcentaje, double ExtraPorMisil) {
		// TODO Auto-generated method stub
		int dos=2, cien=100;
		
		
		
		if (litrosCombustible > 20000.0) {
			return longitud * dos + cien; 
		}else {
			return longitud * dos;
		}
		
	}
		
}
