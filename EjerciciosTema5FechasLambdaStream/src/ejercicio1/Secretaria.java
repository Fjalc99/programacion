package ejercicio1;

import java.util.Comparator;
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
		
		return lista.stream()
				.filter(Alumno-> Alumno.getEdad()<=30).toList();
		
	}
	
	public void todosAlumnos(){
		
		 lista.stream()
		 .forEach((System.out::println)) ;
	}
	
	public void todosAlumnosv2(List <Alumno> lista){
		
		 lista.stream()
		 .forEach((System.out::println)) ;
	}
	
	
	public List <Alumno> filtrarPorLetra(String letra){
		
		return lista.stream()
				.filter(Alumno -> Alumno.getNombre().startsWith(letra))
				.toList();
	}
	
	
	public List <Alumno> buscarEdad(String nombre){
		
		return lista.stream()
				.filter(Alumno -> Alumno.getNombre().equalsIgnoreCase(nombre))
				.toList();
	}
	
	public List <Alumno> buscarPorCurso(String nombreCurso){
		
		return buscarPorNota()
				.stream()
				.filter(Alumno -> Alumno.getNombreCurso().equalsIgnoreCase(nombreCurso))
				.toList();
				
	}
	
	
public List <Alumno> buscarPorCursoV2(String nombreCurso){
		
		return 	lista
				.stream()
				.filter(Alumno -> Alumno.getNombreCurso().equalsIgnoreCase(nombreCurso))
				.toList();
				
	}
	
	
	public List <Alumno> buscarPorNota (){
		
		return lista.stream()
				.filter(Alumno -> Alumno.getNotaMedia()>9)
				.toList();
		
	}
	
	public long contarLista() {
		
		return todosAlumnosMenor30().stream().count();
	}
	
	public List <Alumno> buscarPorEdad (){
		
		Comparator<Alumno> compararEdad = Comparator.comparingInt(Alumno::getEdad)
				.thenComparing(Comparator.comparing(Alumno::getNombre));
		
		
		return lista.stream()
				.sorted(compararEdad)
				.toList();
				 
	}
	
	public Optional<Alumno> primerAlumno(){
		
		return lista.stream()
				.findFirst();
	}
	
	public List <Alumno> longitudNombre(){
		
		return lista;
		
	}
	
	/*public List <Alumno>  contarNombre(String nombre) {
		
		return lista.stream().toList();
	}*/
	
	public List <Alumno> primerosAlumnos (String nombreCurso, int limit){
		
		return lista
				.stream()
				.filter(Alumno -> Alumno.getNombreCurso().equalsIgnoreCase(nombreCurso))
				.limit(limit)
				.toList();
	}
}
