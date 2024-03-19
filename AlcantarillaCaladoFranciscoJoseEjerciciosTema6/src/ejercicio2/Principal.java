package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) throws LimiteGrados {
		// TODO Auto-generated method stub

		double grado;
		boolean salida = false;

		Convertidor c = new Convertidor();

		try {
			
			
			do {
				
				System.out.println("Introduzca el grado celsius que quieres pasar a fahrenheit");
				grado = Leer.datoDouble();

				System.out.println(c.convertirCelsius(grado));
				
				salida=true;
				
				
			} while (!salida);
			
			
			
		} catch (LimiteGrados e) {

			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Introduce un numero");
		}catch(Exception e) {
			System.out.println("Error inesperado");
		}

	}

}
