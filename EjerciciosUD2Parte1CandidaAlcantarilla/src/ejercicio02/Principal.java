package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un
		mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de
		la división con dos decimales si no lo es.*/
		
		
		double num1=0.0, num2=0.0, cero=0.0, division=0.0;
	
		
		
		
		System.out.println(".......................");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println(".......................");
		
		System.out.println("Vamos a dividir dos números");
		System.out.println("Indique el primer número");
		num1=Leer.datoDouble();
		System.out.println("Indique el segundo número");
		num2=Leer.datoDouble();
		
		
		division=num1/num2;
		
		if(num2==cero) {
			System.out.println("No se puede hacer la operación");
		}else {
			
			System.out.printf("El resultado es %.2f", division );
		}
		System.out.println("............................");
		System.out.println("Gracias por usar el programa");
		System.out.println("............................");

	}

}
