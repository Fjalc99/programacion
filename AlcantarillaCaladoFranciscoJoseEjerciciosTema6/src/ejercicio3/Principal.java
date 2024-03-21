package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) throws ComprobarDiscriminante, ComprobarAyB {
		// TODO Auto-generated method stub

		double a, b, c;
		boolean salida =false;
		CEcuacion2Grado c2 = new CEcuacion2Grado();
		
		
		
		try {
			
			
			System.out.println("Introduzca el valor de a");
			a=Leer.datoInt();
				
				
			System.out.println("Introduzca el valor de b");
			b=Leer.datoInt();
			
			System.out.println("Introduzca el valor de c");
			c=Leer.datoInt();
			
			System.out.println(c2.calcularEcuacion2Grado(a, b, c));
			
			
			
			
			
			
			
			}catch(ComprobarDiscriminante e) {
			System.out.println(e.getMessage());
		}catch(ComprobarAyB e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Introduzca un numero");
		}catch(RuntimeException e) {
			System.out.println("Error inesperado");
		}
	
	
	}
}
