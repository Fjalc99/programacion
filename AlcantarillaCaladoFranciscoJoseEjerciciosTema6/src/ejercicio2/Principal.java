package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) throws LimiteGrados {
		// TODO Auto-generated method stub

		double grado;
		
		
		Convertidor c = new Convertidor();
		
		
		
		try {
			System.out.println("Introduzca el grado celsius que quieres pasar a fahrenheit");
			grado=Leer.datoDouble();
			
			System.out.println(c.convertirCelsius(grado));
			
		}catch(LimiteGrados e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
