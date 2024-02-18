package ejercicio4;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Contacto, String> lista = new HashMap <>();
		Contacto c = new Contacto ("Fran");
		CrudAgenda ca = new CrudAgenda(lista, "682474147");
		
		int opcion;
		String nombre, numero;
		
	
		
		do {
			System.out.println("###########################");
			System.out.println("Bienvenido al programa");
			System.out.println("###########################");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para añadir contacto");
			opcion=Leer.datoInt();
			
			switch(opcion) {
				case 0:
					
					System.out.println("Saliendo del programa...");
					break;
			
				case 1:
					System.out.println("Introduzca el nombre del contacto");
					nombre=Leer.dato();
					
					System.out.println("Introduzca el número de telefono");
					numero=Leer.dato();
					
					ca.agregarContacto(new Contacto(nombre),  new CrudAgenda(lista, numero));
					
					System.out.println(lista);
					
					break;
					
					
			
			
			}
			
			
			
		} while (opcion != 0);
		
		
	}

}
