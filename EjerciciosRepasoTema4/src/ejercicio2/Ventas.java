package ejercicio2;

import java.util.Arrays;



public class Ventas {

	private Producto [] lista;

	public Ventas(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public int cantTotalProductos () {
		
		int cantTotal = 0;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				cantTotal += lista[i].getCantUnidades();
			}
		}
		
		return cantTotal;
	}
	
	
	public double calcularTotalVentas (double porcentaje, double extraDoblesEspada) {
		
		double totalVentas=0;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				totalVentas += lista[i].calcularPVP(porcentaje, extraDoblesEspada);
			}	
		}
		
		return totalVentas;
	}
	
	public double calcularUnProducto (double porcentaje, double extraDoblesEspada, int id) {
		
		
		Producto p = buscarPorId(id);
		
	return p.calcularPVP(porcentaje, extraDoblesEspada);	
	}
	
	public double devolverCambio (double porcentaje, double extraDoblesEspada, int id, double pagar) {
		
		
		return pagar - calcularUnProducto(porcentaje,extraDoblesEspada, id);
		
		
	}
	
	public Producto buscarPorId(int id) {
		
		int i=0;
		boolean encontrado = false;
		
		while( i < lista.length && !encontrado) {
			if (lista[i].getId()==id) {
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
	
	
	public void mostrar () {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] !=null) {
				System.out.println(lista[i]);
			}
			
			if (lista[i] instanceof EspadaLaser) {
				((EspadaLaser)lista[i]).avisarSableLaser();
			
			}
		}
		
	}
	
}
