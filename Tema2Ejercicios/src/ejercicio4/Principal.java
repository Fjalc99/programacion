package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*4. Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar*/
		
		double total=0.0, retirDinero=0.0, cartera=0.0 ;
		
		System.out.println("Bienvenidos al programa para retirar dinero de sue cuenta bancaria");
		System.out.println("##################################################################");
		
		System.out.println("Introduzca el dinero que tiene en su cartera");
		cartera=Leer.datoDouble();
		System.out.println("##################################################################");
		System.out.println("Introduzca el dinero a retirar de su cartera");
		retirDinero=Leer.datoDouble();
		System.out.println("##################################################################");
		
		if(retirDinero > cartera) {
			System.out.println("No es posible realizar la operación");
			
		}else {
			total= cartera - retirDinero;
			System.out.printf("El dinero total despues de retirar el dinero es de %.2f",total);
			
		}
		
	}

}
