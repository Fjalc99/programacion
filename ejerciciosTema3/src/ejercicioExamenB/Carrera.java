package ejercicioExamenB;

import java.util.Arrays;

public class Carrera {

	private Corredor[] lista;
	private int kilometros;
	private int numCorredores;

	public Carrera(Corredor[] lista, int kilometros, int numCorredores) {
		super();
		this.lista = lista;
		this.kilometros = kilometros;
		this.numCorredores = numCorredores;
	}

	public int getNumCorredores() {
		return numCorredores;
	}

	public void setNumCorredores(int numCorredores) {
		this.numCorredores = numCorredores;
	}

	public Corredor[] getLista() {
		return lista;
	}

	public void setLista(Corredor[] lista) {
		this.lista = lista;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Carrera [lista=" + Arrays.toString(lista) + ", kilometros=" + kilometros + ", numCorredores="
				+ numCorredores + "]";
	}

	public void addCorredores(Corredor c) {

		lista[numCorredores] = c;
		numCorredores++;
	}

	public Corredor buscarPorDorsal(int dorsal) {

		int i = 0;
		boolean encontrado = false; 

		while (i < numCorredores && !encontrado) {
			if (lista[i].getDorsal() == dorsal) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}

	} 
	
public void mostrarCorredores() {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				System.out.println(lista[i]);
			}
		}
	}
	
	public void mostrarVeteranos() {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null && lista[i].getCategoria() == 3) {
				System.out.println(lista[i]);
			}
		}
	}
	
	/*public Corredor[] buscarPorCategoria(int categoria) {
		
		Corredor [] listaAux = new Corredor [numCorredores];
	
		for (int i = 0; i < numCorredores; i++) {
			if (lista[i].getCategoria()==categoria) {
				listaAux[i]=lista[i];
			}
		}
		return listaAux;
	}*/
	
	public Corredor[] buscarPorCategoria(int categoria) {
		
		Corredor [] listaAux = new Corredor [lista.length];
	
		for (int i = 0; i < numCorredores; i++) {
			if (lista[i] !=null && lista[i].getCategoria()==categoria) {
				listaAux[i]=lista[i];
				
			}
			i++;
		}
		return listaAux;
	}
	
	public void modificarTiempo(Corredor c, double tiempoEnMin) {
		
		c.setTiempoEnMin(tiempoEnMin);
	}
	
	public double pasarSegundos(int dorsal, int segundos) {
		
		Corredor c;
		c=buscarPorDorsal(dorsal);
		
		return c.getTiempoEnMin() * segundos;
		
		
	}

}
