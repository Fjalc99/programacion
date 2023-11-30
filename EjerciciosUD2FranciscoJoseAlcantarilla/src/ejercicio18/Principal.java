package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*18. Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,
	retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos
	necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al
	saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.*/		
		
		int opcion = 0;
		double saldo = 2500.0, retirDiner, ingrDiner, entradas, cantEntradas;
		
		do {
			System.out.println("Bienvenido al cajero");
			System.out.println("Pulse 1 para ver saldo");
			System.out.println("Pulse 2 para retirar el dinero");
			System.out.println("Pulse 3 para comprar entradas");
			System.out.println("Pulse 4 para ingresar dínero");
			System.out.println("Pulse 0 para salir");
			opcion=Leer.datoInt();
				
			switch(opcion){
				
							case 1:
								System.out.println("Su saldo es de "+saldo +"€");
								break;
								
							case 2:
								System.out.println("Diga cuanto desea retirar");
								retirDiner=Leer.datoDouble();
								saldo = saldo - retirDiner;
								System.out.println("Su nuevo saldo es de "+saldo + "€");
								break;
							
							case 3:
								System.out.println("Cuantas entradas deseas");
								cantEntradas=Leer.datoDouble();
								System.out.println("Diga el precio de las entradas");
								entradas=Leer.datoDouble();
								saldo = saldo - (entradas * cantEntradas);
								System.out.println("Su saldo con las entradas es de "+saldo + "€");
								break;
				
							case 4: 
								System.out.println("Indique cuanto dínero quieres ingresar");
								ingrDiner=Leer.datoDouble();
								
								saldo +=ingrDiner;
								
								System.out.println("Su saldo es de "+saldo + "€");
								break;
								
								
							case 0:
								System.out.println("Saliendo del programa");
								break;
								
							default:
								System.out.println("Opcion no valida");
								break;
			
			}
				
				}while (opcion != 0);
			
		}
		
}
