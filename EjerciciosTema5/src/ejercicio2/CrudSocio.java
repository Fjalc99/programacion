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
	
	
	public void agregarSocio (Socio s) {
		
		lista.add(s);
	}
	
	public void mostrarSocios () {
		
		for (Socio s : lista) {
			System.out.println(s);
		}
	}
	
	public Socio buscarDni (String dni) {
		
		int i=0;
		boolean encontrado = false;
		
		while (i> lista.size() && !encontrado) {
			Socio s = lista.get(i);
			if(s.getDni()==dni) {
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
	
	public void borrarSocio (String dni) {	
		if(!lista.isEmpty()) {
			lista.remove(dni);
		}
		
	}
	
	public void modificarSocio (String dni) {
		
		
	}
}
