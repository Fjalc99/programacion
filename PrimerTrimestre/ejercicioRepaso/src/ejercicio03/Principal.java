package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
		
		/* Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con números leídos por
		teclado y mostrar la media de todos los elementos y la cantidad de números “cero” introducidos*/
		
		
		int numeros[];
		int tam=8, cero=0, media=0, contadorCero=0, opcion, suma=0;
		numeros=new int [tam];
		
		System.out.println("-----------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-----------------------");
		
		do {
			System.out.println("Vamos a calular la media y contar cuántos ceros hay");
			System.out.println("---------------------------------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Calcular datos");
			System.out.println("---------------------------------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
				
				case 1:
					for (int i = 0; i < numeros.length; i++) {
						
						System.out.println("Indique el " + (i+1) + "º número: "  );
						numeros[i]=Leer.datoInt();
						
					}
					
					for (int i = 0; i < numeros.length; i++) {
						
						suma+=numeros[i];
						
						if(numeros[i]==cero) {
							
							contadorCero++;
						}
						
						
					}
					
					media = suma / numeros.length;
					System.out.println("La media es: " + media);
					media=cero;
					
					System.out.println("La cantidad de ceros son: " + contadorCero);
					contadorCero=cero;
					
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
		System.out.println("GRACIAS POR USAR EL PORGRAMA");
		System.out.println("----------------------------");
		
		
		
		
	}

}
