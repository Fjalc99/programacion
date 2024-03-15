package ejercicio3;

import utilidades.Leer;

public class Operaciones {

	// Metodos

	public boolean parImpar( int numero) {


		int dos = 2;
		boolean resultado = true; 
		

		if (numero % dos == 0) {
			resultado = true;

		} else {

			resultado = false;
		}

		return resultado;
	}

	public void mostraPar (int numero) {
	
		if(parImpar(numero)) {
			System.out.printf("El número %d es par \n", numero);
		}else {
			System.out.printf("El número %d es impar \n", numero);
		}
	}
	
	public boolean numNegativoNumPositivo(int numero) {
		
	
		int cero = 0;
		 boolean resulPos = true;
		
		
		
		if(numero > cero) {
			
			resulPos = true;
		}else {
			resulPos=false;		
			}
		
		return resulPos;
		
	}
	
	public void mostraNumNegativo(int numero) {
		
		if(numNegativoNumPositivo(numero)) {
			System.out.printf("El número %d es positivo", numero);
		}else {
			System.out.printf("El número %d es negativo", numero);
		}
	}
	
}
