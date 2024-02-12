package ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class CrudSocio {

	private List <Socio> lista = new ArrayList <Socio> ();

	public CrudSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudSocio [lista=" + lista + "]";
	}
	
	
	
	
}
