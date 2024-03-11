package ejercicioExamenB;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10, opcion, kilometros = 0, numCorredores=6;
		String nombre, apellido;
		int dorsal, categoria, segundos=60;
		double tiempoEnMin, nuevoTiempo;
		 
		Corredor c;
		Corredor [] lista = new Corredor [tam];
		lista[0] = new Corredor("Francisco","Alcantarilla", 26, 2, 10.0);
		lista[1] = new Corredor("Marisa","Ortega", 17, 2, 26.0);
		lista[2] = new Corredor("Candi","Alcantarilla", 11, 1, 20.0);
		lista[3] = new Corredor("Fran","Gamero", 26, 1, 30.0);
		lista[4] = new Corredor("Carlos","Roman", 25, 3, 11.0);
		lista[5] = new Corredor("Rosa","Ortega", 26, 3, 18.0);
		Carrera ca = new Carrera (lista, kilometros, numCorredores);
		
		do {
			System.out.println("------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para añadir un corredor");
			System.out.println("Pulse 2 para calcular el cambio a segundos");
			System.out.println("Pulse 3 para buscar todos los veterano");
			System.out.println("Pulse 4 para mostrar lista");
			System.out.println("Pulse 5 para modificar el tiempo de un corredor");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo del programa...");
					break;
					
				case 1:
					System.out.println("Introduzca el nombre del corredor");	
					nombre=Leer.dato();
					
					System.out.println("Introduzca el apellido del corredor");
					apellido=Leer.dato();
					
					System.out.println("Introduzca el dorsal del corredor");
					dorsal=Leer.datoInt();
					
					System.out.println("Introduzca la categoría del corredor, 1 para juevenil, 2 para senior o 3 para veterano");
					categoria=Leer.datoInt();
					
					System.out.println("Introduzca el tiempo del corredor");
					tiempoEnMin=Leer.datoDouble();
					
					c = new Corredor (nombre, apellido, dorsal, categoria, tiempoEnMin );
					
					ca.addCorredores(c);
					break;
					
				case 2:
					
					System.out.println("Introduzca el dorsal al que quieres pasar su tiempo a segundos");
					dorsal=Leer.datoInt();
					
					System.out.println(ca.pasarSegundos(dorsal, segundos));
					break;
					
				case 3: 
					
				
					
					System.out.println("Introduzca el número 3 para buscar los veteranos");
					categoria=Leer.datoInt();
				
					ca.mostrarVeteranos(ca.buscarPorCategoria(categoria));
					break;
						
				case 4:
					
					ca.mostrarVeteranos(lista);
					break;
					
				case 5:
					
					System.out.println("Introduzca el dorsal al que quiere modificar el tiempo");
					dorsal=Leer.datoInt();
					
					System.out.println("Introduzca el nuevo tiempo");
					nuevoTiempo=Leer.datoDouble();
					
					ca.modificarTiempo(ca.buscarPorDorsal(dorsal), nuevoTiempo);
					
					
					break;
					
			}
			
		} while (opcion!=0);
		
		
	}

}
