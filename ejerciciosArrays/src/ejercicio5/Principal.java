package ejercicio5;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5. Crear un programa que realice lo siguiente: 
		 * • Solicitar al usuario que introduzca por teclado el tamaño del array. 
		 * • Declarar y definir el array de enteros. 
		 * • Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario. 
		 * • Mostrar por pantalla la suma de todos los elementos. 
		 * • Mostrar el mayor y el menor guardados en el array. 
		 * • Modificar un valor elegido por el usuario. */

		int tam = 0;
		int hasta = 0, desde = 0, suma = 0, numMayor = 0, numMenor=0;
		int numeros[];

		Random r = new Random(System.nanoTime());

		System.out.println("Indique el tamaño");
		tam = Leer.datoInt();

		numeros = new int[tam];

		System.out.println("Diga el número para empezar");
		desde = Leer.datoInt();

		System.out.println("Diga el número hasta que llega ");
		hasta = Leer.datoInt();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(hasta - desde + 1) + desde;
		}

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numMayor) {
				numMayor = numeros[i];
			}

		}
		
		numMenor = numeros [0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < numMenor) {
				numMenor = numeros[i];
			}
			
		}
		
		
		System.out.println("La suma de los números es de " + suma);
		System.out.println("El número mayor es " + numMayor);
		System.out.println("El número menor es "+numMenor);
	}

}
