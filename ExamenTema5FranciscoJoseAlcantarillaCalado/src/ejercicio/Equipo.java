package ejercicio;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private List <Jugador> lista;
	private String nombreEquipo;
	
	
	public Equipo(List<Jugador> lista, String nombreEquipo) {
		super();
		this.lista = lista;
		this.nombreEquipo = nombreEquipo;
	}


	public List<Jugador> getLista() {
		return lista;
	}


	public void setLista(List<Jugador> lista) {
		this.lista = lista;
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	@Override
	public String toString() {
		return "Equipo [lista=" + lista + ", nombreEquipo=" + nombreEquipo + "]";
	}
	
	
	public void añadirJugador (Jugador j) {
		
		lista.add(j);
	}
	
	public void mostrarJugSinGoles () {
		
		int cero=0;
		Iterator <Jugador> it = lista.iterator();
		
		for (Jugador j : lista) {
			if (it.hasNext() && j.getGolesAnotados() == cero ) {
				System.out.println(j);
			}
		}
		
	}
	
	public void mostrarLista() {
		
		Iterator <Jugador> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Jugador buscarPorDorsal(int dorsal) {
		
		for (Jugador j : lista) {
			if (j.getDorsal()==dorsal) {
				return j;
			}
		}
		return null;
	}
	

	
	public void modificarPosicion (Jugador j, String posicion ) {
		
		j.setPosicion(posicion);
	}
	
	
	public void ordenarPorPosicion() {
		Collections.sort(lista);
	}
	
	
	public void ordenarPorCantidadGoles() {
		
		Collections.sort(lista, new OrdenarPorCantGoles());
	}
}
