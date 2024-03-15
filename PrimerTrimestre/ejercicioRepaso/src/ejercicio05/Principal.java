package ejercicio05;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*Crear un programa que realice lo siguiente:
			• Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.
			• Modificar un valor elegido por el usuario. */
		
			Random rdn=new Random (System.nanoTime());
			
			int desde, hasta, tam, opcion, cero=0, suma=0, numMayor=0, numMin=0;
			int numeros[];
			
			System.out.println("***********************");
			System.out.println("BIENVENIDOS AL PROGRAMA");
			System.out.println("***********************");
			
			do {
				System.out.println("Vamos a declarar números");
				System.out.println("------------------------");
				System.out.println(" 0 - Salir");
				System.out.println(" 1 - Resultados");
				System.out.println("------------------------");
				System.out.println("¿Qué desea hacer?");
				opcion=Leer.datoInt();
				
				switch(opcion) {
				
				case 1:
					System.out.println("¿Cuántos números quieres introducir?");
					tam=Leer.datoInt();
					numeros= new int[tam];
					System.out.println("¿Desde que número quieres empezar?");
					desde=Leer.datoInt();
					System.out.println("¿Hasta que número quieres llegar?");
					hasta=Leer.datoInt();
					
					for (int i = 0; i < numeros.length; i++) {
					
						numeros[i]=rdn.nextInt(hasta-desde+1)+desde;
					}
					
					for (int i = 0; i < numeros.length; i++) {
						
						suma+=numeros[i];
							
					}
					
					System.out.println("La suma es: " + suma);
					System.out.println("");
					
					for (int i = 0; i < numeros.length; i++) {
						if(numMayor<numeros[i]) {
							
							numMayor=numeros[i];
						}
						
					}
			
					System.out.println("El número mayor es: " + numMayor);
					System.out.println("");
					
					numMin= numeros [0];
					
					for (int i = 0; i < numeros.length; i++) {
						
						
						if(numeros[i]<numMin) {
							
							numMin=numeros[i];
						}
					
						
					}
					System.out.println("El menor número es: " + numMin);
					System.out.println("");
					
				
				}
				
	
				
			}while(opcion!=cero);
			
			System.out.println("****************************");
			System.out.println("GRACIAS POR USAR EL PROGRAMA");
			System.out.println("****************************");
		
		
	}

}
