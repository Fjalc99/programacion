package ejercicio4;

import java.util.Map;
import java.util.Set;


public class CrudAgenda {

	private Map<Contacto, String> lista;
	private Set<Contacto> listaContactos;


	public CrudAgenda(Map<Contacto, String> lista, Set<Contacto> listaContactos) {
		super();
		this.lista = lista;
		this.listaContactos = listaContactos;
	}

		
	

	public Map<Contacto, String> getLista() {
		return lista;
	}




	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}




	public Set<Contacto> getListaContactos() {
		return listaContactos;
	}




	public void setListaContactos(Set<Contacto> listaContactos) {
		this.listaContactos = listaContactos;
	}


	

	@Override
	public String toString() {
		return "CrudAgenda [lista=" + lista + ", listaContactos=" + listaContactos + "]";
	}




	public void agregarContacto (Contacto c, String numero) {
		
		lista.put(c,  numero);
		
	}
	
	public Contacto buscarContacto (String nombre) {
		
		for (Contacto c : listaContactos) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}
		}
		
		return null;
		}
	
	public void borrarContacto (String nombre) {
		lista.remove(buscarContacto(nombre));
	}
	
	public void mostrarLista() {
	
		for (Contacto c : listaContactos) {
			System.out.println(c);
		}
	}
	
	
	public void modificarContacto (Contacto c, String nombre) {
		
		c.setNombre(nombre);
	}
	
}

	
	

