package examentipoA;

import java.util.Arrays;

public class Inmobiliaria {

	private int numVendedores;
	private Piso [] listado;
	private int numPisos;
	
	
	public Inmobiliaria(int numVendedores, Piso[] listado, int numPisos) {
	
		this.numVendedores = numVendedores;
		this.listado = listado;
		this.numPisos = numPisos;
	}

	

	public int getNumPisos() {
		return numPisos;
	}



	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}



	public int getNumVendedores() {
		return numVendedores;
	}


	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}


	public Piso[] getListado() {
		return listado;
	}


	public void setListado(Piso[] listado) {
		this.listado = listado;
	}


	
	
	
	@Override
	public String toString() {
		return "Inmobiliaria [numVendedores=" + numVendedores + ", listado=" + Arrays.toString(listado) + ", numPisos="
				+ numPisos + "]";
	}



	public void agregarPisos(Piso p) {
		listado [numPisos] = p;
		numPisos++;
	}
	
	
	
	
	
}
	


