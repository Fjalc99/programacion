package repaso;

import java.util.Arrays;


//En las clases que no sea la principal solo van metodos y atributos 
//y siempre llevan el private 

public class Tienda {

	private Producto [] listado;
	private int numProductos;
	private int numTrabajadores;
	
	
	public Tienda(Producto[] listado, int numProductos, int numTrabajadores) {

		this.listado = listado;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}


	public Producto[] getListado() {
		return listado;
	}


	public void setListado(Producto[] listado) {
		this.listado = listado;
	}


	public int getNumProductos() {
		return numProductos;
	}


	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}


	public int getNumTrabajadores() {
		return numTrabajadores;
	}


	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}


	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	//TODOS LOS METODOS SON PUBLICOS
	//NOMBRE VERBOS EN INFINITIVO, SIN Ñ NI TILDES, QUE INDIQUE QUE HACE EL METODO, 
	//LA SEGUNDA EMPIEZA EN MAYUSCULAS Y LA PRIMERA EN MINUSUCULAS, SIEMPRE, EN SERIO SIEMRPE, QUERIDO YO DEL FUTURO SIEMRPE
	public void agregar (Producto p) {
		listado [numProductos] = p;
		numProductos ++;
		
	}
	
	public void mostrarProductos() {
		for (int i = 0; i < numProductos; i++) {
			System.out.println(listado[i]);
		}
	}
		
		public void mostrarProductosActivos() {
			for (int i = 0; i < numProductos; i++) {
				if(listado[i].isEnVenta()) {
					System.out.println(listado[i]);
				}
			}
	}
	public void mostrarLista(Producto [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				System.out.println(lista[i]);
			}
		}
	}
		
		
	 public Producto [] buscarBySeccion (int seccion) {
		 
		 int i = 0;
		 Producto [] listaEncontrados=new Producto [numProductos];
		 
		while(i<numProductos) {
			if(listado[i].getSeccion()==seccion) {
				listaEncontrados[i]=listado[i];
			}
			i++;
		}
		return listaEncontrados;
	 }
	 
	
	public int buscarById (int id) {
		boolean encontrado = false;
		int i=0;
		
		while (i<numProductos && !encontrado) {
			if(listado[i].getId()==id) {
				encontrado = true;
			}else {
				
				i++;
			}
		}
		if(encontrado) {
			return i;
			
		}else {
			return -1;
		}
		
	}
	 
	public Producto buscarByIdV2 (int id) {
		boolean encontrado = false;
		int i=0;
		
		while (i<numProductos && !encontrado) {
			if(listado[i].getId()==id) {
				encontrado = true;
			}else {
				
				i++;
			}
		}
		if(encontrado) {
			return listado [i];
			
		}else {
			return null;
		}
		
	}
	
	public double calcularPreciofinal (double ganancia, int id) {
		double cien = 100.0;
		Producto p; 
		p=buscarByIdV2(id);

		
		return p.getPrecioFabrica() + p.getPrecioFabrica() * ganancia/cien;
	}
	
	public void modificarPrecioSeccion (double nuevoPrecio, int seccion) {
		//buscarBySeccion(seccion);
		for (int i = 0; i < numProductos; i++) {
			if(listado [i].getSeccion()==seccion) {
				listado[i].setPrecioFabrica(i);
			}
			
		}
		
	}
	
	public double hacerDescuento (double descuento, double ganancia, int id) {
		double cien = 100.0;
		//double resul=0.0;
		return calcularPreciofinal(ganancia, id) - calcularPreciofinal(ganancia, id) * descuento/cien;
		
	
		
	}
	//Devuelve el numero de elementos "eliminados" de la lista 
	public int eliminarSeccion (int seccion) {
		int contador=0;
		for (int i = 0; i < numProductos; i++) {
			if(listado [i].getSeccion()==seccion) {
				listado[i].setEnVenta(false);
				contador++;
			}
		}return contador;
	
}
	
	
	
	
	
	
	
}
