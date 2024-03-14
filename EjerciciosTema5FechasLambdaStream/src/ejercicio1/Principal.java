package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		List <Alumno> lista = new ArrayList <>();
		
		Alumno a1 = new Alumno ("Fran", "Alcantarilla", "2ºDAM",6.75,35);
		Alumno a2 = new Alumno ("Candi", "Alcantarilla", "1ºDAM",8.75,22);
		Alumno a3 = new Alumno ("Marisa", "Ortega", "2ºDAM",9.75,20);
		Alumno a4 = new Alumno ("Fran", "Gamero", "1ºDAM",7.75,18);
		Alumno a5 = new Alumno ("Carlos", "Roman", "1ºComercio",5.75,19);
		
	
		
		
		Secretaria s = new Secretaria (lista);
		
		s.addAlumno(a1);
		s.addAlumno(a2);
		s.addAlumno(a3);
		s.addAlumno(a4);
		s.addAlumno(a5);
		
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("--------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para obtener todos los alumnos");
			opcion=Leer.datoInt();
			
			
			
			switch(opcion) {
			
				default:
					System.out.println("Opción no valida, vuelva a introducir de nuevo la opción");
					break;
			
				case 0:
					System.out.println("Saliendo del programa...");
					break;
					
				case 1:
					
					s.todosAlumnosv2(s.todosAlumnosMenor30());
					
					break;
			
				case 2:
					
					s.todosAlumnos();
					
					break;
			
			}
			
			
		} while (opcion!=0);
		
	}

}
