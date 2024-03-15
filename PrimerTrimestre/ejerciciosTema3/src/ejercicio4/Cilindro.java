package ejercicio4;

public class Cilindro {
	
	private double altura, radio;
	

	public Cilindro(double altura, double radio) {

		this.altura = altura;
		this.radio = radio;
	}

	public double calculaVolumen () {
		
		double volumen=0;
		int dos=2;
		volumen = Math.PI * Math.pow(radio,dos) * altura;
		return volumen;
	}
	
	public void mostrarVolumen () {
		
		System.out.println("El volumen es "+calculaVolumen());
		
		
	}
	
}
