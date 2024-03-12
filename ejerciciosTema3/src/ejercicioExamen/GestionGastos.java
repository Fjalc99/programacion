package ejercicioExamen;

import java.util.Arrays;


public class GestionGastos {

	private Gasto[] listado;
	private double cantTotalGastada;
	private int numGastos;

	public GestionGastos(Gasto[] listado, double cantTotalGastada, int numGastos) {
		super();
		this.listado = listado;
		this.cantTotalGastada = cantTotalGastada;
		this.numGastos = numGastos;
	}

	public Gasto[] getListado() {
		return listado;
	}

	public void setListado(Gasto[] listado) {
		this.listado = listado;
	}

	public double getCantTotalGastada() {
		return cantTotalGastada;
	}

	public void setCantTotalGastada(double cantTotalGastada) {
		this.cantTotalGastada = cantTotalGastada;
	}

	public int getNumGastos() {
		return numGastos;
	}

	public void setNumGastos(int numGastos) {
		this.numGastos = numGastos;
	}

	@Override
	public String toString() {
		return "GestionGastos [listado=" + Arrays.toString(listado) + ", cantTotalGastada=" + cantTotalGastada
				+ ", numGastos=" + numGastos + "]";
	}

	public void addGasto(Gasto g) {

		listado[numGastos] = g;
		numGastos++;

	}
	
	public void mostrarLista() {
		
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] !=null) {
				System.out.println(listado[i]);
			}
		}	
	}

	public void mostrarCantidad() {
		
		int id = 0;
		id++;
		for (int i = 0; i < numGastos; i++) {
			System.out.println("Gasto\t" + id++ + "\t" + listado[i].getCantGastada());
		}	
	}
	
	public void mostrarListaV2(Gasto [] listado) {
		
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] !=null) {
				System.out.println(listado[i]);
			};
		}
	}

	  public double calcularTotalGastos() {
	  
		  double suma=0;
		  
		  for (int i = 0; i < numGastos; i++) {
			suma += listado[i].getCantGastada();
		}
		  return suma;
	  }
	 
	  
	  public void modificarCantidad(Gasto g, double cantGastada) {
		  
		g.setCantGastada(cantGastada);
	  }

	public Gasto[] buscarConcepto(String concepto) {

		Gasto[] listaAux = new Gasto[listado.length];

		for (int i = 0; i < numGastos; i++) {
			if (listado[i].getConcepto().equalsIgnoreCase(concepto)) {
				listaAux[i] = listado[i];
		 }
	  }
		return listaAux;
	}
	

	public Gasto buscarPorId(int id) {
		
		for (int i = 0; i < listado.length; i++) {
			if (listado[i].getId()==id) {
				
				return listado[i];
			}
		}
		return null;
	}
}
