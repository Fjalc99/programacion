package ejercicio4;

public class Cilindro {

	public double calculaVolumen ( double altura, double radio) {
		
		double volumen=0;
		int dos=2;
		volumen = Math.PI * Math.pow(radio,dos) * altura;
		return volumen;
	}
	
	public void mostrarVolumen () {
		
		calculaVolumen(0, 0);
		
	}
	
}
