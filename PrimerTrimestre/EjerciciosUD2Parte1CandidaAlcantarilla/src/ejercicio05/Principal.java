package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la potencia de un número, dado este y su exponente.
		Pueden ocurrir tres casos:
		 * El exponente sea positivo, imprime resultado en pantalla.
		 * El exponente sea 0, el resultado es 1.
		 * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.*/
		
		double num1=0.0, result=0.0;
		int exp=0, cero=0, uno=1;
		
		
		
		System.out.println("***********************");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("***********************");
		
		System.out.println("Vamos a clacular la potencia de un número");
		System.out.println("Indique el número");
		num1=Leer.datoDouble();
		System.out.println("Indique el exponente");
		exp=Leer.datoInt();
		
		
		
		if(exp>cero) {
			result= Math.pow(num1, exp);
			System.out.printf("El resultado es: %.2f\n", result);
			
		} else if (exp==cero) {
			result=uno;
			System.out.printf("El resultado es: %.0f\n", result);
			
		}else {
			result= uno/Math.pow(num1, -exp);
			System.out.printf("El resultado es: %.8f\n", result);
		}
		
		System.out.println("****************************");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("****************************");	
		
	}

}
