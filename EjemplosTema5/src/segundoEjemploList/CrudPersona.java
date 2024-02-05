package segundoEjemploList;

import java.util.Iterator;
import java.util.List;

public class CrudPersona {
	
	private List <Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	
	public void  agregarPersona (Persona p) {
		
		lista.add(p);
	}
	
	public boolean agregarPersonaV2 (Persona p) {
		
		return lista.add(p);
	}
	
	public Persona findByDni (String dni) {
		
		int i=0;
		boolean encontrado = false;
		
		while(i< lista.size()&& !encontrado) {
			
			Persona deLista = lista.get(i);
		if(deLista.getDni().equalsIgnoreCase(dni))
			encontrado=true;
		else
			i++;
		}
		if(encontrado)
			return lista.get(i);
		else
			return null;

	}
	
	public void imprimirLista () {
		for (Persona p : lista) {
			System.out.println(p);
		}
	}
	
	public void borrarPorDni (String dni) {
		
		if(findByDni(dni) !=null) {
			lista.remove(findByDni(dni));
		}
		
			
		
	
	}
	
	}


