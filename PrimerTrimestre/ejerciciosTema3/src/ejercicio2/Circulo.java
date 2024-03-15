package ejercicio2;

public class Circulo {

	//Atributo
	
	private double radio;
	
	//constructor
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public double calcularArea() {
		double area;
		int dos=2;
		area=Math.pow(radio, dos)* Math.PI;
		return area;
	}
	
	public double pasarAMCuadrados () {
	double conversion = 10000;
	return calcularArea()/conversion;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
