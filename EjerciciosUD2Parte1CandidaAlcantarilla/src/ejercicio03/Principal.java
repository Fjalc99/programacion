package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer un número y mostrar por la salida estándar si dicho número es o no par.

		int dos=2, num1=0, result=0, cero=0;
		
		
		System.out.println(".......................");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println(".......................");
		System.out.println("Vamos a ver si un número es par o impar");
		System.out.println("");
		
		System.out.println("Indique el número");
		num1=Leer.datoInt();
		
		result=num1%dos;
		
		if (result==cero) {
			
			System.out.println("El número es par ");
			
		}else {
			
			System.out.println("El número es impar");
		}
		
		System.out.println(".............................");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println(".............................");


	}

}
