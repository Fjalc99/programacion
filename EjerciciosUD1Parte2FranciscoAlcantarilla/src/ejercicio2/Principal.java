package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 2. Realizar un programa que lea un valor entero por teclado y muestre por pantalla su doble, su triple y su mitad*/
		
		
		int num1, resultDoble=0, resultTriple=0, resultMitad=0 ,dos=2;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("#######################################################");	
		
		System.out.println("Vamos a mostar el doble de su numero, indique su numero");
		num1=Leer.datoInt();	
		resultDoble= num1 * num1;
		
		System.out.println("#######################################################");
		
		System.out.println("El resultado de su doble es de "+resultDoble);
		
		System.out.println("#######################################################");
		
		System.out.println("Vamos a mostrar el triple de su numero, indique su numero");
		num1=Leer.datoInt();
		
		resultTriple= num1 * num1 * num1;
		System.out.println("El resultado de su triple es de " +resultTriple);
		
		System.out.println("#######################################################");
		
		System.out.println("Vamos a mostrar la mitad de su numero");
		num1=Leer.datoInt();
		
		resultMitad= num1 / dos;
		System.out.println("#######################################################");
		System.out.println("El resultado de su mitad es "+resultMitad);
		System.out.println("#######################################################");
		
		System.out.println("Adios y muchas gracias por usar el programa");
		
		
		
		
		
		
		
		
	}

}
