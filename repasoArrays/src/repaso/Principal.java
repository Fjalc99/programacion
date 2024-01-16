package repaso;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, hasta, desde, opcion, cantidadMonedas = 0, semanaMayor = 0, semana = 0, uno = 1, cero = 0, cincuenta=50, valorSuperado=0;
		int cien=100, porcentaje=0;
		int monedas[];
		double media = 0;

		Random r = new Random(System.nanoTime());
		
		System.out.println("Bienvenido al programa");
		System.out.println("################################");

		System.out.println("Diga el número de semanas");
		tam = Leer.datoInt();

		monedas = new int[tam];

		do {
			System.out.println("###################################################################################");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para rellenar el array de random");
			System.out.println("Pulse 2 para ver cantidad de monedas por semana");
			System.out.println("Pulse 3 Para ver el total de euros ahorrados");
			System.out.println("Pulse 4 para ver semana se a ahorrado más y cuanto ha sido");
			System.out.println("Pulse 5 para ver la media ahorrada");
			System.out.println("Pulsa 6 para modificar la cantidad ahorrada de una semana");
			System.out.println("Pulsa 7 para ver cuantas veces hemos superado la media de españa semanalmente");
			System.out.println("Pulsa 8 para calcular el porcentaje de ahorro en un semana que elijas");
			System.out.println("###################################################################################");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:

				System.out.println("Diga la cantidad mínima");
				desde = Leer.datoInt();

				System.out.println("Diga la cantidad máxima");
				hasta = Leer.datoInt();

				for (int i = 0; i < monedas.length; i++) {
					monedas[i] = r.nextInt(hasta - desde + 1) + desde;
				}
				break;

			case 2:
				for (int i = 0; i < monedas.length; i++) {
					System.out.println("\tSemana\t " + (i + uno) + "\tMonedas\t\t" + monedas[i]);
				}

				break;

			case 3:
				for (int i = 0; i < monedas.length; i++) {
					cantidadMonedas += monedas[i];
				}

				System.out.println("La cantidad de monedas ahorradas es de " + cantidadMonedas);
				break;

			case 4:
				for (int i = 0; i < monedas.length; i++) {
					if (monedas[i] > semanaMayor) {
						semanaMayor = monedas[i];

						semana = (i + uno);

					}
				}
				System.out.printf("La semana que mas has ahorrado es %d y la cantidad de esa semana es de %d €\n",semana, semanaMayor);
				break;

			case 5:
				//media = (double) cantidadMonedas / monedas.length;
				media = cantidadMonedas / tam;
				System.out.println("La media  es de " + media);
				break;

			case 6:
				semana = uno;
				while (semana != 0) {
					System.out.println("Diga que semana desea cambiar cantidad");
					System.out.println("Pulse 0 para volver al menu");
					semana = Leer.datoInt();
					if (semana <= monedas.length && semana != cero) {
						System.out.println("¿Cuánto ha ahorrado esa semana?");
						monedas[semana - uno] = Leer.datoInt();
					} else if (semana != 0) {
						System.out.println("No se puede introducir un numero mayor de las semanas que hay en el array");
					} else {
						System.out.println("Saliendo al menu...");
					}

				}
				
				break;
			case 7:
				for (int i = 0; i < monedas.length; i++) {
					if(monedas[i] > cincuenta) {
						valorSuperado ++;
					}
				}
			System.out.println("Ha superado la media en "+valorSuperado + "semanas" );
				break;
				
				
			case 8:
				semana=uno;
				System.out.println("Elija la semana de la que quieras saber la media");
				semana=Leer.datoInt();
				
				porcentaje = monedas [semana] + (monedas[semana]/cien) ;
				
				System.out.println("El porcentaje de la semana elegida es de "+porcentaje);
				
				
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			}

		} while (opcion != 0);

	}

}
