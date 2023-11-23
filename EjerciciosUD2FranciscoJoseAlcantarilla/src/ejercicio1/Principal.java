package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la
posibilidad de que sean iguales.*/
		
		int num1 = 9, num2=1;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("#######################");
		System.out.println("Introduzca el primer numero");
		num1=Leer.datoInt();
		System.out.println("Introduzca el segundo numero");
		num2=Leer.datoInt();
		if(num1 > num2){
			System.out.println("El numero mayor es "+num1);
		}else {
			System.out.println("El numero mayor es "+num2);
		}	
		System.out.println("##############################");
		if(num1 == num2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros no son iguales");
		} 
	}
}
