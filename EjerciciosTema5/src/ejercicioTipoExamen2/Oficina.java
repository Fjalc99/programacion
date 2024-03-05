package ejercicioTipoExamen2;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	private List<Trastero> lista;

	public Oficina(List<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}

	public void añadirTrastero(Trastero t) {

		lista.add(t);

	}

	public List <Trastero> buscarPrecio(double precio) {

	List <Trastero> listaAux = new ArrayList <>();
		
		for (Trastero t : lista) {
			if(t.getPrecio()==precio) {
				listaAux.add(t);
			}
		}
		
		return listaAux;

	}
	
	public Trastero mostrarMayorPrecio() {
		
		Trastero t = new Trastero();
		
		
		for (Trastero trast : lista) {
			if (trast.getPrecio() > t.getPrecio())
				t = trast;
			
		}
			return t;
	}
	
	public Trastero buscarNumero(int numero) {

	int i=0;
	boolean encontrado=false;
	
	while(i < lista.size()&& !encontrado) {
		Trastero t= lista.get(i);
		if(t.getNumTrastero()==numero) {
			encontrado=true;
		}else {
			i++;
		}
	}
		if(encontrado) {
			return lista.get(i);
		}else {
			return null;
		}

	}
	
	/*public void borrarTrastero(Trastero t) {
		
		lista.remove(t);
	}*/
	
	
	public void borrarTrastero(int numero) {
		
		lista.remove(buscarNumero(numero));
	}
	
	
	public void modificarPrecio (Trastero t, double precio) {
		
		t.setPrecio(precio);
		
	}
	
	
	public void mostrarTrasterosNoOcupados () {
		
		for (Trastero t : lista) {
			if(!t.isOcupado()) {
				System.out.println(t);
			}
		}

	}

	


	
	
}
