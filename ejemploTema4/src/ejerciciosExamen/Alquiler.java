package ejerciciosExamen;

import java.util.Arrays;
import java.util.Iterator;

public class Alquiler {
	
	private Vehiculo [] lista;

	public Alquiler(Vehiculo[] lista) {
		super();
		this.lista = lista;
	}

	public Vehiculo[] getLista() {
		return lista;
	}

	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Alquiler [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public Vehiculo buscarPorMatricula (String matricula) {
		
		int i=0;
		boolean encontrado =false;
		
		while(i < lista.length && !encontrado) {
			if(lista[i].getMatricula().equalsIgnoreCase(matricula)) {
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
	 
	
	public double calcularAlquilerUnVehiculo (Vehiculo v) {
		
		
		
		return v.calcularPrecio();
	}
	
	
	public void mostrarLista () {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i]!=null) {
				System.out.println(lista[i]);
			}
			if(lista[i] instanceof PatinetesVoladores) {
				((PatinetesVoladores)lista[i]).avisarPatinete();
			}
		}
	}
	
	
	
}


