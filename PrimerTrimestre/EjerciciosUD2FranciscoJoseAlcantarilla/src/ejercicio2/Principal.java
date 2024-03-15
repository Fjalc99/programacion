package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*2. Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un
mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de
la división con dos decimales si no lo es*/
		
		double num1 = 0, num2 = 0, cero= 0, resultado= 0 ;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("########################");
		
		System.out.println("Introduzca el primer número ");
		num1=Leer.datoDouble();
		
		System.out.println("Introduzca el segundo número ");
		num2=Leer.datoDouble();
		
		
		if(num2 == cero) {
			System.out.println("No se puede hacer la division");
		}else { 
			resultado= num1 / num2;
			System.out.printf("El resultado de la division es de %.2f",resultado);
				
			
		}
	}

}
