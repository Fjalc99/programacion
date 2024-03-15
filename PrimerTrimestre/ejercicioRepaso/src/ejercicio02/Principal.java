package ejercicio02;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Implementar un programa que rellene automáticamente un array de enteros con 10 posiciones,
		cada elemento debe contener el valor del doble de su índice. Mostrar el resultado por pantalla.*/

		Random num= new Random(System.nanoTime());
		
		int hasta, desde, tam, cero=0, opcion;
		int[] numerosAleatorios;
		
		System.out.println("------------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA ");
		System.out.println("------------------------");
		
		do {
			
			System.out.println("Vamos a generar números aleatorios");
			System.out.println("----------------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Generar números");
			System.out.println("----------------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
				case 1: 
					System.out.println("¿Cuántos números quieres meter?");
					tam=Leer.datoInt();
					numerosAleatorios= new int [tam];
					
					System.out.println("¿Desde donde quieres empezar?");
					desde=Leer.datoInt();
					System.out.println("¿Hasta que número deseas llegar?");
					hasta=Leer.datoInt();
					
					for (int i = 0; i < numerosAleatorios.length; i++) {
						
					
						numerosAleatorios[i]=num.nextInt(hasta-desde+1)+desde;
				
					}
					
					for (int i = 0; i < numerosAleatorios.length; i++) {
						
						System.out.println("El " + (i+1) + "º aleatorios es: " + numerosAleatorios[i]);
						
					}
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
