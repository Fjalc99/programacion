package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dinRet, dinIng, saldo=0, dolarAmericano=1.09;
		int opcion;

		CuentaCorriente c = new CuentaCorriente( "Marisa", saldo);

		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("#########################################");
			System.out.println("Pulse 1 para ingresar dinero");
			System.out.println("Pulse 2 para retirar dinero");
			System.out.println("Pulse 3 para cambiar el saldo a dolares");
			System.out.println("Pulse 4 para ver el saldo acutal");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("#########################################");

			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				System.out.println("#########################################");
				System.out.println("Introduce el dinero que desea ingresar");
				dinIng = Leer.datoDouble();

				c.ingresarDinero(dinIng);

				break;

			case 2:
				System.out.println("#########################################");
				System.out.println("Introduce el dinero que desea retirar");
				dinRet = Leer.datoDouble();

				if (c.getSaldo() >= dinRet) {
					c.retirarDinero(dinRet);
				} else {
					System.out.println("La cantidad que desea retirar no es posible");
				}
				break;

			case 3:
				System.out.println("#########################################");
				System.out.printf("El cambio del saldo a dolares americanos es de %.2f\n",c.cambioADolar(dolarAmericano));
				break;
				
				
			case 4:
				System.out.println("#########################################");
				c.mostrarSaldo();
				break;
				
				
			default:
				System.out.println("Opción no valida");
				break;
				
			case 0: 
				System.out.println("Saliendo del programa...");
				break;
			}
			
			
			
				

		} while (opcion != 0);
		
		System.out.println("Has salido del programa y gracias por usarlo");
	}

}
