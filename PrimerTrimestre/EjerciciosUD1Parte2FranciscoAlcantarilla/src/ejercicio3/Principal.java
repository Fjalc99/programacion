package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 3. Realizar un programa que lea por teclado un valor correspondiente a una distancia en millas marinas
(con decimales) y las escriba expresadas en metros. Sabiendo que 1 milla marina equivale a 1852
metros.*/
		
		double metros = 1852.00, millas = 0.0, conversion = 0.0;
		
		System.out.println("Bienvenido al programa para hacer la conversion de millas a metros");
		System.out.println("##################################################################");
		
		System.out.println("Introduzca el numero de millas");
		millas=Leer.datoDouble();
		
		conversion= millas * metros;
		System.out.println("##################################################################");
		System.out.println("La conversion de millas a metro es de "+conversion);
		
		
		
		
		
		
		
		
		
		
		
	}

}
