package ejemplo;

import java.util.LinkedList;

public class CrudMovil {

	private LinkedList<Movil> lista;

	public CrudMovil(LinkedList<Movil> lista) {
		super();
		this.lista = lista;
	}

	public LinkedList<Movil> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Movil> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudMovil [lista=" + lista + "]";
	}
	
	
	public void añadirMovil (Movil v) {
		
		lista.add(0, v);
	}


	public void añadirMovilV2(Movil v) {
		 lista.addLast(v);
		
	}
	
	public Movil buscarMovil(String marca) {
		
		int i=0;
		boolean encontrado=false;
		
		while(i<lista.size()&& !encontrado) {
			Movil m = lista.get(i);
			if(m.getMarca().equalsIgnoreCase(marca)) 
				encontrado=true;
				else
					i++;
				
		}
		if(encontrado) 
			return lista.get(i);
		else
			return null;
	}
	
	
	
	public Movil buscarMovilV2 (String marca) {
		
		return lista.getFirst();		
	
	}
	
	
	public void  borrarMovil (int indice) {
		
		lista.remove(indice);
		
	}
	
public void  borrarMovilV2 () {
		
		lista.removeLast();
	}
}

