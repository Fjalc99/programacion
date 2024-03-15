package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear un programa que reciba por teclado 3 notas, calcule la media y diga si la media sale
		aprobada o no */
		
		double nota1=0.0, nota2=0.0, nota3=0.0, result=0.0;
		int tres=3, cinco=5;
		
		System.out.println(".......................");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println(".......................");
		
		System.out.println("Vamos a cacular la nota media para comprobar si estas aprobado o no");
		System.out.println("Indique la primera nota");
		nota1=Leer.datoDouble();
		System.out.println("Indique la segunda nota");
		nota2=Leer.datoDouble();
		System.out.println("Indique la tercer nota");
		nota3=Leer.datoDouble();
		
		result= (nota1 + nota2 + nota3) / tres;
		
		if(result>=cinco) {
			System.out.println("Estas aprobada");
			
		}else {
			System.out.println("No has aprobado");
		}
		
		System.out.println(".................................");
		System.out.println("GRACIAS POR USAR NUESTRO PROGRAMA");
		System.out.println(".................................");
		
		
		
	}

}
