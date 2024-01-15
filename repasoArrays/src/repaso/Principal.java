package repaso;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, hasta, desde, opcion;
		
		int monedas [];
		Random r = new Random(System.nanoTime());
		
		
		do {
			
			System.out.println("Pulse 1 para rellenar el array de random");
			System.out.println("Pulse 2 para ver cantidad de monedas por semana");
			System.out.println("Pulse 3 Para ver el total de euros ahorrados");
			System.out.println("Pulse 4 para ver semana se a ahorrado más y cuanto ha sido");
			System.out.println("Pulsa 5 para modificar la cantidad ahorrada de una semana");
			System.out.println("Pulsa 6 para ver cuantas veces hemos superado la media de españa semanalmente");
			System.out.println("Pulsa 7 para calcular el porcentaje de ahorro en un semana que elijas");
			opcion=Leer.datoInt();
			
			
			switch (opcion) {
			
				case 1:
				System.out.println("Diga el núemro de semanas");
				tam=Leer.datoInt();
				
				monedas = new int [tam];
				
				System.out.println("Diga desde que semana empieza");
				desde=Leer.datoInt();
				
				System.out.println("Diga en que semana termina de ahorrar");
				hasta=Leer.datoInt();
				
				for (int i = 0; i < monedas.length; i++) {
					monedas[i] = r.nextInt(hasta-desde + 1) + desde;
				}
				break;
				
				case 2:
					
					System.out.println("Semana \t\t Monedas"+ monedas[tam]);
					
				
				case 3:
					
					
				case 0:
					System.out.println("Saliendo del programa...");
					break;
			}
			
		}while(opcion != 0);
	
	
	
	
	
		
	
	}

}
