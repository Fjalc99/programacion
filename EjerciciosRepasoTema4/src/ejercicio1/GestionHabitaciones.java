package ejercicio1;

import java.util.Arrays;
import java.util.Iterator;


public class GestionHabitaciones {

	private Habitacion [] lista;

	public GestionHabitaciones(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public Habitacion buscarHabitacion (String nombre) {
		int i=0;
		boolean encontrado = false;
		
		while(i < lista.length && !encontrado) {
			if(lista[i].getNombreCliente().equalsIgnoreCase(nombre)) {
				encontrado=true;
			}else {
				i++;
			}
			
			
		}
		if (encontrado) {
			return lista[i];
		}else {
			return null;
		}
	
	}
	
	public double calcularUnaHabitacion (Habitacion h, int descuento) {
		
		
		return h.calcularAlquiler(descuento);
	}
	
	public double calcularTotalHabOcupadas() {
		
		double total = 0;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && lista[i].isOcupada()) {
				total += lista[i].calcularAlquiler(0);
			}
		}
		return total;
		
		
	}
	
	
	public void mostrarLista() {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				System.out.println(lista[i]);
			}
		}
	}
	
	public void mostrarHabNoOcupadas() {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && !lista[i].isOcupada()) {
				System.out.println(lista[i]);
			}
		}
		
	}
	
	
	
	
	
}
