package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
		bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
		es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.*/
		
		double dineroCuenta=0.0, dineroQuitar=0.0;
		
		System.out.println(".......................");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println(".......................");
		
		System.out.println("Indique la cantidad que tiene en su cuenta");
		dineroCuenta=Leer.datoDouble();
		System.out.println("Indique el dinero que quiere retirar");
		dineroQuitar=Leer.datoDouble();
		
		if(dineroCuenta<dineroQuitar) {
			System.out.println("No tiene saldo suficiente");
		}else {
			
			dineroCuenta -= dineroQuitar;
			System.out.printf("El saldo es de: %.2f€\n", dineroCuenta);
			
		}
		System.out.println("............................");
		System.out.println("Gracias por usar el programa");
		System.out.println("............................");
		
		
	}

}
