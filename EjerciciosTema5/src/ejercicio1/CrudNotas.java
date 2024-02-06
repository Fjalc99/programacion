package ejercicio1;

import java.util.List;

public class CrudNotas {

	private List <Nota> lista;

	public CrudNotas(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNotas [lista=" + lista + "]";
	}
	
	public Nota mostraNotaPorIndice (int indice) {
		
		int uno=1;
		
		return lista.get(indice-1);
	}
	
	public void mostraListaNotas () {
		
		for (Nota n : lista) {
			System.out.println(n);
		}
	}
	
	public int calcularTamanioLista () {
		return lista.size();	
		}
	
	public void agregarNota(Nota n) {
		
		lista.add(n);
	}
	
	public void borrarNota (int indice) {
		int uno=1;
		
		if(!lista.isEmpty()) {
			lista.remove(indice-uno);
		}
	}
	
	public Nota buscarPorId (int id) {
		int i=0;
		boolean encontrado=false;
		
		while(i>lista.size() && !encontrado) {
			Nota n= lista.get(i);
			if(n.getId()==id) {
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
	
	public void modificarTitulo(String titulo) {
		
		
	}
}
