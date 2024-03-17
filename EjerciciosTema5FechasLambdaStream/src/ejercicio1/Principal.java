package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, limit;
		String letra, curso;
		List <Alumno> lista = new ArrayList <>();
		
		Alumno a1 = new Alumno ("Fran", "Alcantarilla", "1DAM",9.75,35);
		Alumno a2 = new Alumno ("Candi", "Alcantarilla", "1DAM",9.75,22);
		Alumno a3 = new Alumno ("Marisa", "Ortega", "1DAM",9.75,20);
		Alumno a4 = new Alumno ("Fran", "Gamero", "1DAM",7.75,18);
		Alumno a5 = new Alumno ("Carlos", "Roman", "1Comercio",5.75,18);
		Alumno a6 = new Alumno ("Rosa", "Ortega", "2Comercio",5.75,19);
		
	
		
		
		Secretaria s = new Secretaria (lista);
		
		s.addAlumno(a1);
		s.addAlumno(a2);
		s.addAlumno(a3);
		s.addAlumno(a4);
		s.addAlumno(a5);
		s.addAlumno(a6);
		
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("--------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para obtener todos los alumnos qye tienen menos de 30 años");
			System.out.println("Pulse 2 para ver toda la lista");
			System.out.println("Pulse 3 para todos los alumnos que empiecen por una letra que desee");
			System.out.println("Pulse 4 para contar la lista con alumnos de menos de 30");
			System.out.println("Pulse 5 para obtener los alumnos con nota media mayor de 9 en el curso 1DAM.");
			System.out.println("Pulse 6 para obtner los 3 primeros alumnos");
			System.out.println("Pulse 7 para obtener el alumno de menor edad");
			System.out.println("Pulse 8 para obtener el primer alumno");
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
					
				case 3:
					System.out.println("Introduce la letra por la que quieres filtrar");
					letra=Leer.dato();
				
					System.out.println(s.filtrarPorLetra(letra));
					
					
					break;
					
					
				case 4:
					System.out.println(s.contarLista());
			
					break;
					
				case 5:
						System.out.println("Introduzca el nombre del curso");
						curso=Leer.dato();
						
						s.todosAlumnosv2(s.buscarPorCurso(curso));
					
					
					break;
					
					
				case 6:
					System.out.println("Introduzca el nombre del curso");
					curso=Leer.dato();
					
					System.out.println("Introduzca el 3 para limitarlo a los 3 primeros");
					limit=Leer.datoInt();
					
					s.todosAlumnosv2(s.primerosAlumnos(curso, limit));
					
					break;
					
				case 7:
					
					System.out.println("Introduzca el 1 para sacar el que menos edad tiene");
					limit=Leer.datoInt();
					
					s.todosAlumnosv2(s.buscarPorEdad());
					
					break;
					
				case 8:
					
					System.out.println(s.primerAlumno());
					
					break;
					
				case 9:
			}
			
			
		} while (opcion!=0);
		
	}

}
