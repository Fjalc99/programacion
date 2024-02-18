package ejercicio4;

import java.util.Map;

public class CrudAgenda {

	private Map<Contacto, String> lista;
	private String numero;


	
	
	
	public CrudAgenda(Map<Contacto, String> lista, String numero) {
		super();
		this.lista = lista;
		this.numero = numero;
	}





	public Map<Contacto, String> getLista() {
		return lista;
	}





	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}





	public String getNumero() {
		return numero;
	}





	public void setNumero(String numero) {
		this.numero = numero;
	}





	@Override
	public String toString() {
		return "CrudAgenda [lista=" + lista + ", numero=" + numero + "]";
	}





	public void agregarContacto (Contacto c, CrudAgenda crudAgenda) {
		
		lista.put(c,  numero);
		
	}

	
	
}