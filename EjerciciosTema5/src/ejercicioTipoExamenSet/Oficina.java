package ejercicioTipoExamenSet;

import java.util.HashSet;
import java.util.Set;

public class Oficina {

	private Set <Trastero> lista;

	public Oficina(Set<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public Set<Trastero> getLista() {
		return lista;
	}

	public void setLista(Set<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	
	
	public void añadirTrastero(Trastero t) {
		
		lista.add(t);
	}
	
	
	public Set <Trastero> buscarPorPrecio(double precio) {
		
		Set<Trastero> listaAux =new HashSet <>();
		
		for (Trastero t : listaAux) {
			if (t.getPrecio()==precio) {
				listaAux.add(t);
			}
		}
		
			return listaAux;
	}
	
	
	public Trastero buscarPrecioMayor() {
		
		Trastero t = new Trastero ();
		
		for (Trastero trast : lista) {
			if (trast.getPrecio()>t.getPrecio()) 
				t=trast;
			
		}
			return t;
		
	}
	
	public Trastero buscarPorNumero(int numero) {
		
		for (Trastero t : lista) {
			if (t.getNumTrastero()==numero) {
				return t;
			}
		}
		return null;
	}
	
	
	public void eliminarTrastero(int numero) {
		 
		lista.remove(buscarPorNumero(numero));
		
	}
	
	
	public void modificarPrecio (Trastero t, double precio) {
		
		t.setPrecio(precio);
	}
	
	
	public void mostrarNoOcupados () {
		
		for (Trastero t : lista) {
			if (!t.isOcupado()) {
				System.out.println(t);
			}
		}
	}
	
}
