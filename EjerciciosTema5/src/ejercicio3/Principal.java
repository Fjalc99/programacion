package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Alumno> lista = new HashSet <> ();

		
		Alumno a = new Alumno (1,"Paco",7.5);
		CrudAlumno cs = new CrudAlumno(lista);
		
		cs.agregarAlumno(new Alumno(2,"Fran",4.45));
		cs.agregarAlumno(new Alumno(3,"Pepe",7.45));
		cs.agregarAlumno(new Alumno(4,"Mario",6.45));
		cs.agregarAlumno(new Alumno(5,"Carlos",5.45));
		
		cs.mostrarAlumnos();
		
		System.out.println(cs.buscarAlumno(2));
	}

}
