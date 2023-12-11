package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,
		retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos
		necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al
		saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.  */
		
		
		double  verSaldo=0.0, retirarDinero=0.0, precioEntradas=5.5, ingresarDinero=0.0, result;
		int opcion, cero=0, cantEntradas=0;
		
		
		System.out.println("***********************");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("***********************");
		System.out.println("Vamos a realizar diferentes operaciones en un cajero");
		System.out.println("-------------------------");
		System.out.println("¿Cuál es tu saldo actual?");
		verSaldo=Leer.datoDouble();
		do {
			
			
			System.out.println("-----------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Consultar saldo");
			System.out.println(" 2 - Ingresar dinero");
			System.out.println(" 3 - Retirar dinero");
			System.out.println(" 4 - Comprar entradas");
			System.out.println("------------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1: 
					
					System.out.printf("Su saldo es de: %.2f€\n", verSaldo);
					break;
					
				case 2: 
					System.out.println("¿Cuánto desea ingresar?");
					ingresarDinero=Leer.datoDouble();
					verSaldo+=ingresarDinero;
					System.out.printf("Su cuenta actual sería de: %.2f€\n", verSaldo);
					break;
					
				case 3:
					System.out.println("¿Cuánto desea retirar?");
					retirarDinero=Leer.datoDouble();
					verSaldo-=retirarDinero;
					System.out.printf("Su cuenta actual sería de: %.2f€\n", verSaldo);
					break;
					
				case 4:
					
					System.out.println("¿Cuántas entradas quieres?");
					cantEntradas=Leer.datoInt();
					result=cantEntradas * precioEntradas;
					
						if(result<verSaldo) {
							verSaldo-=result;
							System.out.printf("El saldo actual sería de: %.2f€\n", verSaldo);
						
						}else {
							System.out.println("No tiene saldo suficiente");
						}
					break;
					
					
				case 0: 
					System.out.println("Saliendo...");
					System.out.println("");
					break;
					
				default:
					System.out.println("Opción no válida");
					break;
						
			
			}
			
		}while(opcion!=cero);
		
		System.out.println("****************************");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("****************************");
		
	}

}
