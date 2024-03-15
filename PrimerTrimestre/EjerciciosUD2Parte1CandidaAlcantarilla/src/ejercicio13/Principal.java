package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//Leer un número entero y mostrar su tabla de multiplicar.
		
		
		int  numMult=0, tope=10, opcion, cero=0, result;
		
		System.out.println("**********************");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("**********************");
		
	
		do {
			System.out.println("Vamos a calcular la tabla de multiplicar");
			System.out.println("----------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Multiplicar un número");
			System.out.println("----------------------------");
			
			System.out.println("Indique que desea hacer");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1:
					System.out.println("Indique de que número desea hacerla");
					numMult=Leer.datoInt();
					
					for (int i=0; i<=tope; i++) {
						
						result=numMult*i;
						
						System.out.println(numMult + "x" + i + "=" + result );
					}
					break;
					
				case 0: 
					System.out.println("Saliendo...");
					break;
					
				default: 
					System.out.println("Opción no válida");
					break;	
			
			}
			
			System.out.println("");
			
		}while(opcion!=cero);
		
		System.out.println("****************************");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("****************************");
			
		
		
		
			
	
			
			
			
	
		
		

	}

}
