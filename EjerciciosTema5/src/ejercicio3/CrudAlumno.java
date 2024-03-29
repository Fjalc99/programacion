package ejercicio3;


import java.util.Set;

public class CrudAlumno {

	private Set <Alumno> lista;
	
	

	
	public CrudAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}


	

	public Set<Alumno> getLista() {
		return lista;
	}




	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	



	@Override
	public String toString() {
		return "CrudAlumno [lista=" + lista + "]";
	}




	public void agregarAlumno (Alumno a) {
		lista.add(a);
		
	}
	
	
	
	public void mostrarAlumnos() {
		for (Alumno a : lista) {
			System.out.println(a);
		}
	}
	
	
	
	public Alumno buscarAlumno (int id) {
		
		for (Alumno a : lista) {
			if(a.getId()==id) {
				return a;
			}
		}
		return null;
		
		
	}
	
	
	public void borrarAlumno (int id) {
		
		lista.remove(buscarAlumno(id));
	}
	
	public void modificarAlumno (double nota, Alumno a) {
		
		a.setNota(nota);
		
	}
}
