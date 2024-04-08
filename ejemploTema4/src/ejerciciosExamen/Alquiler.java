package ejerciciosExamen;

import java.util.Arrays;
import java.util.Iterator;

public class Alquiler {
	
	private Vehiculo [] listado;

	public Alquiler(Vehiculo[] listado) {
		super();
		this.listado = listado;
	}

	public Vehiculo[] getLista() {
		return listado;
	}

	public void setLista(Vehiculo[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Alquiler [lista=" + Arrays.toString(listado) + "]";
	}
	
	
	public Vehiculo buscarPorMatricula (String matricula) {
		
		int i=0;
		boolean encontrado =false;
		
		while(i < listado.length && !encontrado) {
			if(listado[i].getMatricula().equalsIgnoreCase(matricula)) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if (encontrado) {
			return listado[i];
		}else {
			return null;
		}
	}
	 
	
	public double calcularAlquilerUnVehiculo (Vehiculo v) {
		
		
		
		return v.calcularPrecio();
	}
	
	
	public void mostrarLista () {
		
		for (int i = 0; i < listado.length; i++) {
			if (listado[i]!=null) {
				System.out.println(listado[i]);
			}
			if(listado[i] instanceof PatinetesVoladores) {
				((PatinetesVoladores)listado[i]).avisarPatinete();
			}
		}
	}
	
	
	public double totalRecaudado() {
		
		double suma = 0;
		
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] !=null) {
				suma += listado[i].calcularPrecio();
			}
			
		}
		
		return suma;
	}
	
	
	public double totalRecaudadoBatmovil() {
		
		double suma = 0; 
		
		for (int i = 0; i < listado.length; i++) {
			
			if(listado[i] instanceof Batmovil) {
				suma += ((Batmovil)listado[i]).calcularPrecio();
			}
				
		}
		
		return suma;
	}
	
	
}


