package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, id;
		String nombre, significado, nuevoSignificado;

		List<Palabra> lista = new ArrayList<>();
		Diccionario d = new Diccionario(lista);

		d.añadirPalabra(new Palabra(1, "Cook", "Cocinar"));
		d.añadirPalabra(new Palabra(2, "Look", "Mirar"));
		d.añadirPalabra(new Palabra(3, "Cut", "Cortar"));

		do {
			System.out.println("--------------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("--------------------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para mostrar toda lista");
			System.out.println("Pulse 2 para buscar la palabra");
			System.out.println("Pulse 3 para añadir una palabra nueva");
			System.out.println("Pulse 4 para modificar significado");
			System.out.println("Pulse 5 para ordenar las palabras de forma descendente");
			System.out.println("--------------------------------------------------------");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("--------------------------------------------------------");
				System.out.println("Saliendo del programa...");
				break;

			case 1:
				d.mostrarLista();

				break;

			case 2:
				System.out.println("Introduzca la palabra que quieres buscar");
				nombre = Leer.dato();

				System.out.println(d.buscarPalabra(nombre));

				break;

			case 3:
				System.out.println("Introduzca el id de la palabra");
				id = Leer.datoInt();

				System.out.println("Introduzca el nombre de la nueva palabra");
				nombre = Leer.dato();

				System.out.println("Introduzca el significado de la nueva palabra");
				significado = Leer.dato();

				d.añadirPalabra(new Palabra(id, nombre, significado));

				break;

			case 4:
				System.out.println("Introduzca el significado de la palabra que quiere modificar");
				nombre = Leer.dato();

				System.out.println("Introduzca el nuevo significado");
				nuevoSignificado = Leer.dato();

				d.modificarSignificado(d.buscarPalabra(nombre), nuevoSignificado);
				break;

			case 5:

				Collections.sort(lista, Collections.reverseOrder(new OrdenarPorNombre()));
				for (Palabra p : lista) {
					System.out.println(p);
				}

				break;

			case 6:
				System.out.println("Introduzca el nombre que desea borrar");
				nombre = Leer.dato();

				d.borrarPalabra(d.buscarPalabra(nombre));

				break;

			default:
				System.out.println("--------------------------------------------------------");
				System.out.println("Opción valida introduzca la opción de nuevo");
			}

		} while (opcion != 0);
		System.out.println("--------------------------------------------------------");
		System.out.println("Has salido gracias por usar el programa");
	}

}
