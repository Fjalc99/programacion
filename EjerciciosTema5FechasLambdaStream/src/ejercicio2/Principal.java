package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion;
		String texto;

		List <Cadena> lista = new ArrayList <>();
		GestionCadenas g = new GestionCadenas(lista);
		
		Cadena c = new Cadena ("Hola Mundo");
		Cadena c1 = new Cadena ("Viva el betis");
		Cadena c2 = new Cadena ("Sevilla");
		Cadena c3 = new Cadena ("Cordoba");
		Cadena c4 = new Cadena ("Avíla");
		
		
		g.addCadena(c);
		g.addCadena(c1);
		g.addCadena(c2);
		g.addCadena(c3);
		g.addCadena(c4);
		
		
		do {
			
			System.out.println("Bienvenido al programa");
			System.out.println("--------------------------------------------");
			System.out.println("Pulse 0 para salir");
			System.out.println("Pulse 1 para ordenar alfabeticamente");
			System.out.println("Pulse 2 para buscar cadena de texto");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo del programa...");
					
					
				break;
				
				
				case 1: 
					
					g.mostrarLista(g.ordenarAlfabeticamente());
					
					break;
			
				case 2:
					System.out.println("Introduzca el texto que deseas buscar");
					texto=Leer.dato();
					
					
					g.mostrarLista(g.buscarCadena(texto));
					
					break;
					
				case 3:
					
					
					
					break;
					
			
			}
			
			
			
			
			
			
		} while (opcion!=0);
		
		
		
		
		
		
	}

}
