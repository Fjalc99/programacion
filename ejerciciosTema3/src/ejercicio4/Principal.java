package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio, altura;
		
		Cilindro c ;
		
		System.out.println("Diga el radio ");
		radio=Leer.datoDouble();
		
		System.out.println("Diga la altura");
		altura=Leer.datoDouble();
		
		c = new Cilindro (radio, altura); 
		
		c.mostrarVolumen();
		
		
	}

}
