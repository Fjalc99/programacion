package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de
		un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra
		por ventas se calculará mediante el 20 % de lo vendido en total al mes.*/
		
		double salarioMen=0.0, cien=100.0, porcentaje=0.0, salarioDescuen=0.0, porcentajeLlevado=0.0;
		int opcion, cero=0;
	
		System.out.println("-----------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-----------------------");
		
		do {
			System.out.println("Vamos a calcular el sueldo mensual de un trabajador"
					+ "con comisiones");
			System.out.println("--------------------");
			System.out.println(" 0 -  Salir");
			System.out.println(" 1 - Calcular sueldo");
			System.out.println("--------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1:
					System.out.println("¿Cuánto gana al mes?");
					salarioMen=Leer.datoDouble();
					System.out.println("¿Cuánto ha vendido por extra?");
					salarioDescuen=Leer.datoDouble();
					System.out.println("¿Qué porcentaje se lleva usted?");
					porcentaje=Leer.datoDouble();
					
					porcentajeLlevado= porcentaje * salarioDescuen / cien;
					
					salarioMen+=porcentajeLlevado;
					
					System.out.printf("Su salario con las comisiones es de: %.2f€\n", salarioMen);
					System.out.println("");
					break;
					
				case 0:
					System.out.println("Saliendo...");
					System.out.println("");
					break;
					
					default:
						System.out.println("Opción no válida");
						System.out.println("");
						break;
	
			}
			
			
		}while(opcion!=cero);
		
		System.out.println("----------------------------");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("----------------------------");
		
	}

}
