package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde = 00001, hasta = 99999;
		int opcion;
		int numLoteria;
		Sorteo s = new Sorteo();

		do {

			System.out.println("Bienvenido al programa");
			System.out.println("##############################################################");
			System.out.println("Pulse 1 para elegir los números de su número de la lotería");
			System.out.println("Pulse 2 para que la maquina elija su número");
			System.out.println("Pulse 3 para ver el resultado del sorteo");
			System.out.println("Pulse 4 para comprobar si su número es el premiado");
			System.out.println("Pulse 5 para ver si has ganado o has perdido");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("##############################################################");

			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			case 1:
				System.out.println("Introduzca el numero que desea escoger");
				
				numLoteria = Leer.datoInt();
				if (numLoteria >= desde && numLoteria <= hasta) {
					System.out.println("Su número de la loteria es " + numLoteria);
					System.out.println("##############################################################");
				} else {
					System.out.println("Numero no valido");
					System.out.println("##############################################################");
				}
				break;

			case 2:
				System.out.println("El número elegido por la maquina es " + s.numeroMaquina(desde, hasta));
				System.out.println("##############################################################");
				break;

			case 3:
				System.out.println("El numero del sorteo es " + s.numSorteo(desde, hasta));
				System.out.println("##############################################################");
				break;

			case 4:
				System.out.println(s.comprobarNumero(hasta, desde));
				System.out.println("##############################################################");
				break;

			case 5:
				s.mostrarGanador(hasta, desde);
				System.out.println("##############################################################");
				break;

			default:
				System.out.println("Opción no valida");
				System.out.println("##############################################################");
				break;

			}

		} while (opcion != 0);
		
		System.out.println("Has salido del programa, gracias por usarlo");
		System.out.println("##############################################################");
	}

}
