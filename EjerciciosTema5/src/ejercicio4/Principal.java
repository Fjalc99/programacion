package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Contacto, String> lista = new HashMap<>();
		Set<Contacto> listaContactos = lista.keySet();

		CrudAgenda ca = new CrudAgenda(lista, listaContactos);

		int opcion;
		String nombre, numero;
		String nuevoNombre;

		do {
			System.out.println("##########################################");
			System.out.println("Bienvenido al programa");
			System.out.println("##########################################");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para añadir contacto");
			System.out.println("Pulse 2 para buscar contacto");
			System.out.println("Pulse 3 para borrar contacto");
			System.out.println("Pulse 4 para mostrar la lista entera");
			System.out.println("Pulse 5 para modificar el contacto");
			System.out.println("##########################################");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:

				System.out.println("Saliendo del programa...");
				break;

			case 1:
				System.out.println("Introduzca el nombre del contacto");
				nombre = Leer.dato();

				System.out.println("Introduzca el número de telefono");
				numero = Leer.dato();

				ca.agregarContacto(new Contacto(nombre), numero);

				break;

			case 2:
				System.out.println("Introduzca el contacto que deseas buscar");
				nombre = Leer.dato();

				System.out.println(ca.buscarContacto(nombre));

				break;

			case 3:

				System.out.println("Introduzca el contacto que deseas borrar");
				nombre = Leer.dato();

				ca.borrarContacto(nombre);
				break;

			case 4:
				ca.mostrarLista();
				break;

			case 5:
				System.out.println("Introduzca el nombre que desea modificar");
				nombre = Leer.dato();

				System.out.println("Introduzca el nuevo nombre");
				nuevoNombre = Leer.dato();

				ca.modificarContacto(ca.buscarContacto(nombre), nuevoNombre);

				ca.mostrarLista();
				break;

			default:

				System.out.println("Opción no valida vuelva a elegir");
				break;

			}

		} while (opcion != 0);
		System.out.println("##########################################");
		System.out.println("Has salido del programa gracias por usarlo");
	}

}
