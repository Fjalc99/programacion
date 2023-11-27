package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*5. Realiza un programa que calcule la potencia de un número, dado este y su exponente.
Pueden ocurrir tres casos:
* El exponente sea positivo, imprime resultado en pantalla.
* El exponente sea 0, el resultado es 1.
* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo*/
		
		double num1 = 0.0, exp = 0.0, total= 0.0, cero=0.0;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("#######################");
		
		System.out.println("Introduzca el numero");
		num1=Leer.datoDouble();
		
		System.out.println("Introduzca el exponente");
		exp=Leer.datoDouble();
		
		
		if (exp > cero ) {
			
			total= Math.pow(num1, exp);
			System.out.printf("El total es %.2f",total);
			
		}else{
			if (exp == cero) {
				
				total= Math.pow(num1, cero);
				System.out.printf("El total es %.2f",total);
				
			}else{
				total= 1/Math.pow(num1, -exp);
				System.out.printf("El total es %.2f",total);
			}
		}
				
	}

}
