package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 8, contador = 0;
		double media = 0;
		int numeros [] = new int [tam] ; 
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Diga el número");
			numeros[i]= Leer.datoInt();
			media += numeros[i];
			
			if(numeros[i] == 0) {
				contador++;
			}
		}
		
		media = media / tam;
		System.out.println("La media es "+media);
		System.out.println("La cantidad de cero es de "+contador);
		
	}

}
