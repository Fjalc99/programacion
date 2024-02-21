package ejemplo;

import java.util.Iterator;
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

	// Este metodo lo que hace es añadir un movil por indice
	// si quisieramos indicar en que posicion lo quieres añadir
	public void añadirMovil(Movil v) {

		lista.add(0, v);
	}

	// Este metodo lo que hace es añadir un movil en el ultimo lugar de la lista
	// esta coleccion tambien tiene lo mismo pero para añadir en el primer lugar
	// pero la coleccion linkedlist por defecto siempre añade primero
	public void añadirMovilV2(Movil v) {
		lista.addLast(v);

	}

	// Este metodo lo que haces es buscar por la marca que indique el usuario
	public Movil buscarMovil(String marca) {

		int i = 0;
		boolean encontrado = false;

		while (i < lista.size() && !encontrado) {
			Movil m = lista.get(i);
			if (m.getMarca().equalsIgnoreCase(marca))
				encontrado = true;
			else
				i++;

		}
		if (encontrado)
			return lista.get(i);
		else
			return null;
	}

	// Este metodo lo que hace es buscar el primero de la lista y devolverlo
	// este metodo tiene el inverso para poder buscar el ultimo de la lista y
	// devolverlo
	public Movil buscarMovilV2() {

		return lista.getFirst();

	}

	// Este metodo lo que hace es borrar por el indice que el usuario indique
	public void borrarMovil(int indice) {
		int uno = 1;

		lista.remove(indice - uno);

	}

	// Este metodo lo que hace es borrar el ultimo de lista,
	// tambien se puede borrar el primero porque esta coleccion
	// dispone del metodo de borrar el primero
	public void borrarMovilV2() {

		lista.removeLast();
	}
	

	// Este metodo lo que nos hace es mostrar pero no eliminar el ultimo y
	// si esta la lista vacia muestra null tambien se puede hacer lo mismo
	// pero con el primero
	public Movil mostrarPeeak() {

		return lista.peekLast();
	}

	// Este metodo lo que nos hace es mostrar y eliminar el primero y
	// si esta la lista vacia muestra null tambien se puede hacer lo mismo
	// pero con el ultimo
	public Movil mostrarYeliminar() {

		return lista.pollFirst();

	}
	
	//Este metodo es el que usamos para mostrar toda la lista 
	//y usamos un bucle for each porque solo vamos a recorrer la lista
	public void mostrarLista() {
		
		for (Movil m : lista) {
			System.out.println(m);
		}
	}
	
	//Este metodo es el que usamos para modificar el precio de los moviles
	public void modificarMovil (Movil m, double precio) {
		
		m.setPrecio(precio);
		
	}
}
	


