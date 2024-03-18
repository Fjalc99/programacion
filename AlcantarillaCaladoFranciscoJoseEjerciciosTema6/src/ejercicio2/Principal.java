package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double grado;
		
		
		Convertidor c = new Convertidor();
		
		
		
		try {
			System.out.println("Introduzca el grado celsius que quieres pasar a fahrenheit");
			grado=Leer.datoDouble();
			
			System.out.println(c.convertirCelsius(grado));
			
		}catch(LimiteGrados l) {
			System.out.println("Los grados son negativos");
		}
		
		
	}

}
