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
	
	public void mostrarPisos(Piso [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				System.out.println(lista[i]);
			}
		}
	}
		
 public Piso [] buscarByEstado (int estado) {
		 
		 int i = 0;
		 Piso [] listaEncontrados=new Piso [numPisos];	 
		while(i>numPisos) {
			if(listado[i].getEstado()==estado) {
				listaEncontrados[i]=listado[i];
			}
			i++;
		}
		return listaEncontrados;
	 }
	 
	
	public int buscarById (int id) {
		boolean encontrado = false;
		int i=0;
		
		while (i<numPisos && !encontrado) {
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
	public Piso buscarByIdV2 (int id) {
		boolean encontrado = false;
		int i=0;
		
		while (i<numPisos && !encontrado) {
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
	
	public double calcularMetrosCuadrados (double ganancia, int id) {
		double cien =100;
		Piso p ;
		p=buscarByIdV2(id);
		return p.getPrecioVenta() + p.getPrecioVenta() * ganancia/cien;
		
	}
	
	
}	


