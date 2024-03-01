package ejercicioTipoExamen;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List<Palabra> lista;

	public Diccionario(List<Palabra> lista) {
		super();
		this.lista = lista;
	}

	public List<Palabra> getLista() {
		return lista;
	}

	public void setLista(List<Palabra> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Diccionario [lista=" + lista + "]";
	}

	public void añadirPalabra(Palabra p) {

		lista.add(p);
	}

	public void mostrarLista() {

		Iterator <Palabra> it =  lista.iterator ();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
	}

	public Palabra buscarPalabra(String nombre) {

		int i = 0;
		boolean encontrado = false;

		while (i < lista.size() && !encontrado) {
			Palabra p = lista.get(i);
			if (p.getNombre().equalsIgnoreCase(nombre))
				encontrado = true;
			else
				i++;

		}
		if (encontrado) {
			return lista.get(i);
		} else {
			return null;
		}
	}
	
	
	public void borrarPalabra (Palabra p ) {
		
		lista.remove(p);
	}
	
	public void modificarSignificado (Palabra p, String significado) {
		
		p.setSignificado(significado);
	}

}
