package EjercicioTipoExamenv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MiMusica {

	private List<Cancion> lista;

	public MiMusica(List<Cancion> lista) {
		super();
		this.lista = lista;
	}

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "MiMusica [lista=" + lista + "]";
	}

	public void añadirCancion(Cancion c) {

		lista.add(c);
	}

	public void buscarCancionesGratis() {

		Iterator<Cancion> it = lista.iterator();

		for (Cancion c : lista) {
			if (it.hasNext() && !c.isPrecio()) {
				System.out.println(c);
			}
		}

	}

	public Cancion buscarCancMayorDurac() {

		Cancion c = new Cancion();

		for (Cancion can : lista) {
			if (can.getDuracion() > c.getDuracion())
				c = can;

		}
		return c;
	}

	public List<Cancion> buscarPorInterprete(String interprete) {

		List<Cancion> listaAux = new ArrayList<>();

		for (Cancion c : lista) {
			if (c.getInterprete().equalsIgnoreCase(interprete)) {
				listaAux.add(c);
			}
		}

		return listaAux;
	}

	public Cancion buscarCanMasEscuchadas() {

		Cancion c = new Cancion();

		for (Cancion can : lista) {
			if (can.getNumVecesEscuchada() > c.getNumVecesEscuchada())
				c = can;

		}
		return c;
	}

	public void modificarPrecio(Cancion c, boolean precio) {
		
		c.setPrecio(precio);

	}

	public void ordenarAlfabeticamente() {

		Collections.sort(lista);

	}

	public void ordenarDuracionMayor() {

		Collections.sort(lista, new OrdenarPorDuracion());
	}

	public void mostrarLista() {
		
		Iterator <Cancion> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	public Cancion buscarPorId (int id) {
		
		for (Cancion c : lista) {
			if (c.getId()==id) {
				return c;
			}
		}
		return null;
	}
	
}
