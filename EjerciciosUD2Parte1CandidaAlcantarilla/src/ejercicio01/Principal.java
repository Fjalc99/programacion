package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la
	posibilidad de que sean iguales.*/

		double num1=0, num2=0;
		
		System.out.println("-------------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-------------------------");
		System.out.println("Vamos a comparar dos número para ver cual es mayor o igual");
		System.out.println("");
		System.out.println("Indique el primer número");
		num1=Leer.datoDouble();
		System.out.println("Indique el segundo número");
		num2=Leer.datoDouble();
		
		
		if (num1==num2) {
			 
			System.out.println("Los números son iguales");
			
		}
		else if(num1>num2) {
			
			System.out.println("El mayor es el primer número");
			
		} else {
			
			System.out.println("El mayor es el segundo número "  );
		} 
		System.out.println("----------------------------");
		System.out.println("Gracias por usar el programa");
		System.out.println("----------------------------");

	}
}
