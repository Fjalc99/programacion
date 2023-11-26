package usoDArraysComoParametros;


import java.util.Random;

public class Listas {

	
	public void rellenarAle (int desde, int hasta, int [] lista1 ) {
		Random r=new Random(System.nanoTime());
		for (int i = 0; i < lista1.length; i++) {
			lista1 [i]=r.nextInt(hasta-desde+1)+desde;
		}	
	}
	
	
	public void mostrarLista ( int [] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("  "+lista[i]);
		}
		
	}
	
	//Podría haber dos versiones
	//1. Pasando la lista como parametro
	//2. Instanciando la lista dentro del metdodo
		public int [] trucarlista (int []lista) {
			int diez=10;
			for (int i = 0; i < lista.length; i++) {
				lista[i]=diez;
			}
			return lista;
		}
	
}
