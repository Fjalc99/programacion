package ejemplo2;

public class Alumno {

	private String nombre;
	private double notaPro;
	private double notaBD;
	
	public Alumno (String nombre, double notaPro, double notaBD) {
		
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
		
	}
	
	public double calcularMedia () {
		double suma, media;
		double dos=2;
		suma=notaPro+notaBD;
		media=suma/dos;
		return media;	
	}
	
	public void mostrarMedia (double media) {
		System.out.println("La nota media de "+nombre+" es:"+media);		
	}
}
