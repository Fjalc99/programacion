package ejercicio4;


import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion = 0;
		int tam = 10;
		int desde = 1;
		int hasta = 99;
		double media = 0, suma = 0;
		
		Random r = new Random(System.nanoTime());
		//lista[i] = r.nextInt(hasta-desde+1)+desde;
		
		int numeros [] = new int [tam];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(hasta-desde+1)+desde;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		
		
		
		
		media = suma/tam;
		System.out.println("La suma de los numeros es de "+suma);
		System.out.println("La media es de "+media);
		
		System.out.println("Diga la posición para ver el número que desea ver ");
		posicion=Leer.datoInt();
		if(posicion >= 1 && posicion <= 10) {
			System.out.println("El numero seleccionado es de "+numeros[posicion-1]);
		}
		
	}

}
