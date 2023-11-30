package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String primeraPeli="El silencio de los corderos", segundPeli="Del reves", terceraPeli="Avatar", cuartaPeli="Megalodón";
		int opcion, numEntradas=0;
		double precio=0.0, resultEntradas=0.0;
		
		System.out.println("..........................");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("..........................");
		System.out.println("");
	
		System.out.println("¿Cúantas entradas deseas?");
		numEntradas=Leer.datoInt();
		
		System.out.println("Peliculas");
		System.out.println("----------------------------");
		System.out.println("1- Sala Vip -  " + primeraPeli  );
		System.out.println("2- Sala normal - " + terceraPeli);
		System.out.println("3- Sala 3D - "+ cuartaPeli );
		System.out.println("4- Sala niños - " + segundPeli);
		System.out.println("----------------------------"); 
		
		System.out.println("Indique que pelicula quiere ver");
		opcion=Leer.datoInt();
		
	
		switch(opcion) {
		
			case 1: 
				System.out.println("Indica el precio de la sala vip");
				precio=Leer.datoDouble();
				resultEntradas= precio * numEntradas;
				System.out.printf("El precio de las entradas de la sala vip es de: %.2f€\n", resultEntradas);
				break;
				
			case 2: 
				System.out.println("Indica el precio de la sala normal");
				precio=Leer.datoDouble();
				resultEntradas= precio * numEntradas;
				System.out.printf("El precio de las entradas de la sala normal es de: %.2f€\n", resultEntradas);
				break;
			
			case 3: 
				System.out.println("Indica el precio de la sala 3D");
				precio=Leer.datoDouble();
				resultEntradas= precio * numEntradas;
				System.out.printf("El precio de las entradas de la sala 3D es de: %.2f€\n", resultEntradas);
				break;
				
			case 4:
				System.out.println("Indica el precio de la sala niños");
				precio=Leer.datoDouble();
				resultEntradas= precio * numEntradas;
				System.out.printf("El precio de las entradas de la sala niños es de: %.2f€\n", resultEntradas);
				break;
			
			default:
				System.out.println("No hay ninguna sala");
			
		}
		System.out.println("............................");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("............................");
		
				
				
		
	
		
		
		
		
		
	}

}
