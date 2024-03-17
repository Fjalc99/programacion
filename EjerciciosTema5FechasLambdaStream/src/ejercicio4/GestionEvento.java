package ejercicio4;

import java.util.List;

public class GestionEvento {

	private List <Musical> listado;

	public GestionEvento(List<Musical> listado) {
		super();
		this.listado = listado;
	}

	public List<Musical> getListado() {
		return listado;
	}

	public void setListado(List<Musical> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "GestionEvento [listado=" + listado + "]";
	}
	
	public void addMusical (Musical m) {
		
		listado.add(m);
	}
	
	
	
	
}
