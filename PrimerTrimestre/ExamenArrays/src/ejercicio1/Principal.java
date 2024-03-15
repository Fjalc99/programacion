package ejercicio1;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, hasta, desde, dia = 0, cero = 0, contador = 0, suma = 0;
		int cantLluvia[];
		int opcion;
		double media = 0;

		Random r = new Random(System.nanoTime());

		System.out.println("Bienvenidos al programa");
		System.out.println("########################################################");
		System.out.println("Introduzca la cantidad de días");
		tam = Leer.datoInt();

		cantLluvia = new int[tam];

		do {
			System.out.println("########################################################");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para rellenar los datos");
			System.out.println("Pulse 2 para ver los datos de lluvia por días");
			System.out.println("Pulse 3 para mostrar litros en un día");
			System.out.println("Pulse 4 para ver la cantidad de dia que ha llovido algo");
			System.out.println("Pulse 5 para ver la suma de litros y la media");
			System.out.println("########################################################");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				System.out.println("Saliendo del programa...");
				break;

			case 1:
				System.out.println("Introduzca cantidad mínima ");
				desde = Leer.datoInt();

				System.out.println("Introduzca cantidad máxima ");
				hasta = Leer.datoInt();

				for (int i = 0; i < cantLluvia.length; i++) {
					cantLluvia[i] = r.nextInt(hasta - desde + 1) + desde;
				}

				break;

			case 2:
				for (int i = 0; i < cantLluvia.length; i++) {
					System.out.println("\tDía\t" + (i + 1) + "\tCantidad de Lluvia\t" + cantLluvia[i]);
					System.out.println("-----------------------------------------------------------");
				}

				break;

			case 3:
				System.out.println("Introduzca el día que desea ver su datos");
				dia = Leer.datoInt();
				
				
				System.out.println("El dia que has elegido es " + dia );
				
				
				
				break;
			case 4:
				for (int i = 0; i < cantLluvia.length; i++) {
					if (cantLluvia[i] > cero) {
						contador++;
					}
				}
				System.out.println("La cantidad de días que ha llovido algo es de " + contador);
				break;

			case 5:
				for (int i = 0; i < cantLluvia.length; i++) {
					suma += cantLluvia[i];
				}

				for (int i = 0; i < cantLluvia.length; i++) {
					media = suma / tam;
				}
				System.out.println("El total de lluvia es de " + suma);
				System.out.println("La media de la lluvia es de " + media);
				break;
			}

		} while (opcion != 0);
		System.out.println("########################################################");
		System.out.println("Has salido gracias por usar el programa");
	}

}