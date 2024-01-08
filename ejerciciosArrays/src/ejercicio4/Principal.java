package ejercicio4;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posicion = 0;
		double media = 0;
		int tam = 10;
		int hasta = 99, desde = 1;
		Random r = new Random(System.nanoTime());
		//lista[i] = r.nextInt(hasta-desde+1)+desde;
		
		int numeros [] = new int [tam];
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = r.nextInt(hasta-desde+1)+desde;
			
			media += numeros[i];
			
		}
		
		System.out.println("La suma total de los numeros es de "+(int)media);
		media = media / tam;
		
		System.out.println("La media es de "+media);
		
		System.out.println("Diga un número del 1 al 10");
		posicion=Leer.datoInt();
		if(posicion >= 1 && posicion <= 10 ) {
			System.out.println("El numero en la posicion que es ha elegido es "+numeros[posicion-1]);
		}
	
	}

}
