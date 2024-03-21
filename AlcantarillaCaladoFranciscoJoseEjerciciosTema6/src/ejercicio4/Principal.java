package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		boolean salida =false;
		SumaVariables s = new SumaVariables();
		
		
		try {
			
			do {
				
				
				System.out.println("Introduzca el valor de a");
				a=Leer.datoInt();
				
				System.out.println("Introduzca el valor de b");
				b=Leer.datoInt();
				
				
				System.out.println("El resultado es "+s.suma(a, b));
				salida=true;
				
				
				
			} while (salida);
			
			
			
			
			
		}catch(totalMayor10 e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Introduzca un número");
		}catch(RuntimeException e) {
			System.out.println("Error inesperado");
		}
	}

}
