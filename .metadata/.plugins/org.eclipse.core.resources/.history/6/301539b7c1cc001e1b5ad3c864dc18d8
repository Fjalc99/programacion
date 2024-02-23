package ejercicio3;

import java.util.Iterator;
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
	
	public Alumno buscarAlumno (int id){
		
		boolean encontrado=false;
		Iterator<Alumno> it=lista.iterator();
		Alumno a=null;
		while (it.hasNext()&& !encontrado) {
			a=it.next();
			if(a.getId()==id) {
				encontrado=true;
			}else {
				return null;
			}
			
		}
		return a;
		
		
		
	}
	
	public void borrarAlumno () {
		
		
	}
}
