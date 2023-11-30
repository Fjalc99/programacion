package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.
		
		int opcion, tope=10, cero=0 ;
		double num1, resultSum=0.0, resultMult=1.0;
		
		
	
	
		
		System.out.println("-----------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-----------------------");
		
		do {
			System.out.println("Vamos a sumar y multiplicar números y nos dira cuanto es el total");
			System.out.println("------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Obtener resultado");
			System.out.println("------------------");
			System.out.println("Indique que desea hacer");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1: 
					
					for (int i=0; i<tope; i++) {
					
						System.out.println("Indique el " + (+ i+1) + "º número");
						num1=Leer.datoInt();
						
						resultSum+=num1;
						resultMult*=num1;
	
					} 
					System.out.printf("El resultado de la suma es: %.0f\n", resultSum);
					System.out.printf("El resultado de la multiplicación es: %.2f\n", resultMult);
					 
					break;
				
			
				case 0:
					System.out.println("Saliendo...");
					break;
					
				default:
					System.out.println("Opción no válida");
					
			}
		
			System.out.println("");
			
		}while(opcion!=cero);
		
		System.out.println("----------------------------");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("----------------------------");
	
		

	}

}
