package ejercicio1;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Secretaria {

	
	private List <Alumno> lista;

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	public void addAlumno (Alumno a) {
		
		lista.add(a);
	}
	
	public List <Alumno> todosAlumnosMenor30 (){
		
		return lista.stream().filter(Alumno-> Alumno.getEdad()<=30).toList();
		
	}
	
	public void todosAlumnos(){
		
		 lista.stream().forEach((Consumer <? super Alumno>)System.out::println) ;
	}
	
	public void todosAlumnosv2(List <Alumno> lista){
		
		 lista.stream().forEach((Consumer <? super Alumno>)System.out::println) ;
	}
	
	
}
