package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//14. Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.
		
		int opcion = 0, tope = 10;
		double num, suma = 0.00, producto=1;
		
		do {
			System.out.println("Bienvenidos al programa");
			System.out.println("Pulse 1 para ver sumar la secuencia y el producto");
			System.out.println("Pulse 0 para salir");
			opcion=Leer.datoInt();
			
			
			switch (opcion){
			
			case 1:
				
				for (int i = 0; i < tope; i++) {	
					System.out.println("Introduzca el numero");	
					num=Leer.datoDouble();	
					suma = num + suma;
					
					producto = num * producto;
				}
			
			System.out.println("La suma es igual a "+suma);
			System.out.println("El producto es igual a "+producto);
			}
			
	
			
		}while(opcion !=0);
		
		
			
	}

}
