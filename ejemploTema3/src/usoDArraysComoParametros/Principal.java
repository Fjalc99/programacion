package usoDArraysComoParametros;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde, hasta, tam ;
		int [] lista1;
		
		System.out.println("Tamaño de la lista");
		tam=Leer.datoInt();
		
		
		Listas listado=new Listas ();
		
		
		 lista1 = new int[tam];
		System.out.println("Diga desde");
		desde=Leer.datoInt();
		System.out.println("Diga hasta");
		hasta=Leer.datoInt();
		
		
		
		listado.rellenarAle(desde, hasta, lista1);
	
		listado.mostrarLista(lista1);
		
		listado.trucarlista(lista1);
		
		listado.mostrarLista(listado.trucarlista(lista1));
	
	}

}
