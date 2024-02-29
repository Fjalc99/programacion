package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Trabajador> lista = new ArrayList<>();
		int opcion;

		lista.add(new Trabajador("Fran","69745121R", 40,2000.0));
		lista.add(new Trabajador("Fran", "26587413F", 40, 1700.0));
		lista.add(new Trabajador("Marisa", "29887413F", 26, 500.0));
		lista.add(new Trabajador("Candi", "26127413F", 33, 1300.0));
		lista.add(new Trabajador("Carlos", "23487413F", 50, 1400.0));

		do {
			System.out.println("----------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("----------------------------------------------------");
			System.out.println("Pulse 1 para mostrar la lista sin ordenar");
			System.out.println("Pulse 2 para ordenar por horas de mayor a menor");
			System.out.println("Pulse 3 para ordenar por sueldo de menor a mayor");
			System.out.println("Pulse 4 para ordenar por horas de menor a mayor");
			System.out.println("Pulse 5 para ordenar por sueldo de mayor a menor");
			System.out.println("Pulse 6 para ordenar el mismo nombre y sueldo");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("----------------------------------------------------");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			case 1:
				for (Trabajador t : lista) {
					System.out.println(t);
				}

				break;

			case 2:

				Collections.sort(lista);
				for (Trabajador t : lista) {
					System.out.println(t);
				}

				break;

			case 3:

				Collections.sort(lista, new OrdenarSueldoFinal());
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				break;

			case 4:
				Collections.sort(lista, Collections.reverseOrder());
				for (Trabajador t : lista) {
					System.out.println(t);
				}

				break;
			case 5:

				Collections.sort(lista, Collections.reverseOrder(new OrdenarSueldoFinal()));
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				break;
				
			case 6:
				
				Collections.sort(lista, new OrdenarPorNombreYPorSueldo());
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				
				break;
				

			default:
				System.out.println("----------------------------------------------------");
				System.out.println("Opción no valida pruebe de nuevo");
				break;
			}

		} while (opcion != 0);
		System.out.println("----------------------------------------------------");
		System.out.println("Has salido gracias por usar el programa");
	}

}
