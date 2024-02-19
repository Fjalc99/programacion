package ejercicio3;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Alumno> lista = new HashSet <> ();

		int opcion;
		int id;
		double nuevanota;
		
		CrudAlumno cs = new CrudAlumno(lista);
		Alumno a = new Alumno(5,"Manuel",4.67);
		/*Si no tenemos en la clase secretaria  ahi hay que tener que el atributo sea el crudAlumno*/
		
		cs.agregarAlumno(new Alumno(1,"Fran",4.45));
		cs.agregarAlumno(new Alumno(2,"Pepe",7.45));
		cs.agregarAlumno(new Alumno(3,"Mario",6.45));
		cs.agregarAlumno(new Alumno(4,"Carlos",5.45));
		
		
		do {
			System.out.println("#############################");
			System.out.println("Bienvenido al programa");
			System.out.println("#############################");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para mostrar el alumno que desea buscar");
			System.out.println("Pulse 2 para borrar el alumno que desea");
			System.out.println("Pulse 3 para modificar la nota del alumno que desea");
			
			opcion=Leer.datoInt();
			
			switch(opcion) {
				case 0: 
				System.out.println("Saliendo del programa...");
				break;
				
				case 1:
					System.out.println("Introduzca el id del alumno que quieres buscar");
					id=Leer.datoInt();
					
					System.out.println(cs.buscarAlumno(id));
					break;
					
					
				case 2:
					
					System.out.println("Introduzca el id del alumno que desea borrar");
					id=Leer.datoInt();
					
					cs.borrarAlumno(id);
					break;
					
				case 3:
					
					System.out.println("Introduzca el id del alummno a modificar");
					id=Leer.datoInt();
					
					
					System.out.println("Introduzca la nueva nota a modificar");
					nuevanota=Leer.datoDouble();
					
					cs.modificarAlumno(nuevanota, cs.buscarAlumno(id));
					
					break;
					
				default:
					System.out.println("Opción no valida introduzca la opción de nuevo");
					break;
				
			}
			
			
		} while (opcion !=0);
		
	}

}
