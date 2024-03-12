package ejercicioExamenA;

import java.util.Arrays;
import java.util.Iterator;

public class Inmobiliaria {

	private Piso[] listado;
	private int numVendedores;
	private int numPisos;

	public Inmobiliaria(Piso[] listado, int numVendedores, int numPisos) {
		super();
		this.listado = listado;
		this.numVendedores = numVendedores;
		this.numPisos = numPisos;
	}

	public Piso[] getListado() {
		return listado; 
	}

	public void setListado(Piso[] listado) {
		this.listado = listado;
	}

	public int getNumVendedores() {
		return numVendedores; 
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	@Override
	public String toString() {
		return "Inmobiliaria [listado=" + Arrays.toString(listado) + ", numVendedores=" + numVendedores + ", numPisos="
				+ numPisos + "]";
	}

	public void agregarPisos(Piso p) {

		listado[numPisos] = p;
		numPisos++;
	}

	public void mostrarPisos(Piso[] lista) {

		for (int i = 0; i < lista.length; i++) {
			
				System.out.println(lista[i]);
			

		}
	}

	public void mostrarPisosNuevos(Piso[] lista) {


		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
	}

	public Piso[] buscarPisoNuevos(int estado) {

		Piso[] listaAux = new Piso[listado.length];
	
		int i = 0;

		while (i < numPisos) {
			if (listado[i].getEstado() == estado) {
				listaAux[i]=listado[i];
				
				
			}
			i++;
		}
		return listaAux;
	}

	public Piso buscarPiso(int id) {

		int i = 0;
		boolean encontrado = false;

		while (i < numPisos && !encontrado) {
			if (listado[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return listado[i];
		} else {
			return null;
		}

	}

	public void modificarPrecioPiso(Piso p, double precio) {

		p.setPrecioVenta(precio);
	}

	public double calcularPrecioFinal(double porcentaje, int id) {

	
		int cien = 100;
		Piso p;
		p = buscarPiso(id);

		return  p.getPrecioVenta() + p.getPrecioVenta() * porcentaje / cien;
	}

	public double calcularPrecioM2(int id, double porcentaje) {

		
		Piso p;
		p = buscarPiso(id);

		return  calcularPrecioFinal(porcentaje, id)/ p.getNumM2() ;
	}
	
	
	public double calcularTotalPisosSeminuevos (int estado) {
		
	double suma = 0;	
	//Piso [] aux;
	//aux = buscarPisoNuevos(estado);
	
	for (int i = 0; i < numPisos; i++) {
		if (estado==2) {
			//suma+= aux[i].getPrecioVenta();
			suma+=listado[i].getPrecioVenta();
		}
		
	}

	return suma;
					
	}

}
