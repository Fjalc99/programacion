package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y
		mostrar el número guardado en un lugar que indique el usuario por teclado. También se debe
		mostrar la suma de todos y la media.  */
		
		int desde=1, hasta=99, tam=10, cero=0, opcion, pos=0, suma=0;
		double media=0.0;
		int numerosAleatorios[];
		
		numerosAleatorios= new int[tam];
		
		Random rdn= new Random(System.nanoTime());
		
		
		System.out.println("***********************");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("***********************");
		
		do {
			System.out.println("Vamos a calcular la media y la suma de números aleatorios");
			System.out.println("---------------------------------------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Calcular suma y media");
			System.out.println("---------------------------------------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1: 
					
					for (int i = 0; i < numerosAleatorios.length; i++) {
						
						numerosAleatorios[i] = rdn.nextInt(hasta-desde+1)+desde;
						
					}
					
					for (int i = 0; i < numerosAleatorios.length; i++) {
						
						suma+=numerosAleatorios[i];
						
						media=suma / numerosAleatorios.length;
						
						
					}
					
					System.out.println("La suma es: " + suma);
					System.out.printf("La media es: %.2f", media);
					
					System.out.println("");
					System.out.println("¿Qué posición quieres ver?");
					pos=Leer.datoInt()-1;
					
					System.out.println("El número de la posición elegida es: " + numerosAleatorios[pos]);
					System.out.println("");
					
					suma=cero;
					media=cero;
					
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

		System.out.println("-----------------------------");
		System.out.println("GRACAIAS POR USAR EL PROGRAMA");
		System.out.println("-----------------------------");
		
		
	}

}
