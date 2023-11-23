package crud;

import java.util.Arrays;

import model.Producto;

public class CrudProducto {

	private Producto [] lista;
	
	/*Constructor para crear un objeto de esta clase pasando como parámetro 
	 * una lista que ya puede tener tamaño dado por el usuario en el main */
	
	public CrudProducto  (Producto [] lista) {	
		this.lista=lista;
	}
	
	public Producto[] getLista() {
		return lista;
	}
	
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	//CRUD
	
	/*Pasamos un producto y una posicion y se añade dicho producto en dicha 
	 * ojo, porque no se comprueba nada, se pierde lo que habia.*/
	  
	/*No es buena idea pedir la posicion porque se machaca la que estaba*/
	
	public void add (Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	
	public void editPrecio(String codigo, double precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
		} 
	}	
	
	public void delete (Producto p) {
		int index = findProduct(p);
		if (index >= 0)
			lista[index].setActivo(false);
	}
	
	
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista [i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) //equalsIgnoreCase sirve para comparar cadenas 
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return lista[i]; //Devolvemos el producto buscado
		else
			return null;
	}
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista [i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) 
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i; 
		else
			return -1;
	}
	
	//Buscar todos los productos, devuelve la lista completa
		//Es un getLista pero se suele tener un buscar todos independiente
		
		public Producto [] findAll() {
			return lista;
		}
	
		/*Busca un producto completo y devuelve el índice donde se encuentra
		 * Utiliza compareTo para ver si dos productos son iguales, se estudiará más adelante */
		
		
		public int findProduct(Producto p) {
			int i = 0;
			boolean encontrado = false;

			while (i < lista.length && !encontrado) {
				Producto deLista = lista[i];
				if (p.compareTo(deLista) == 0)
					encontrado = true;
				else
					i++;
			}

			if (encontrado)
				return i;
			else
				return -1;
		}

		
	//Mostrar todos los productos de la lista 
	public void imprimirTodosLosProductos () {
		for (int i=0; i<lista.length;i++) {
			System.out.println((i+1)+"."+lista[i]);
		}
	}
	
	//Mostrar solo los productos cuyo atributo activo es true, es decir, estan a la venta
	
	public void imprimirSoloActivos () {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
		if (lista[i].isActivo()) {
			System.out.println((i+1)+". "+lista[i]);
			
			}	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
