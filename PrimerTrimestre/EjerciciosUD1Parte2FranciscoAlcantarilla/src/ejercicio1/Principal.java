package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Hacer un programa donde se declaren varias variables de distinto tipo, se lee por teclado un valor dado
por el usuario y mostrar por la pantalla el valor con el formato adecuado (usando printf) */ 
		
		int num;
		double precio;
		String nombre;
		
		System.out.println("Introduzca el numero que desee usted");
		num=Leer.datoInt();
		System.out.println("El numero es "+num);
		
		System.out.println("Introduzca el precio que desea");
		precio=Leer.datoDouble();
		System.out.println("El precio que desea es de "+precio);
		
		System.out.println("Introduzca su nombre");
		nombre=Leer.dato();
		System.out.println("Su nombre es "+nombre);
				
		
		
	}

}
