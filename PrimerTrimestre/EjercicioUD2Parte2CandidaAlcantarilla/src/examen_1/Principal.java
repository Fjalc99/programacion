package examen_1;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
		Random rnd= new Random (System.nanoTime());
		
		int dineroSemana[];
		int opcion, tam, desde, hasta, cero=0, suma=0, semanMayor=0, semana=0, cincuenta=50, valorSupe=0, uno=1;
		double media=0;
		String sema="Semana", dinero="Monedas";
		
		
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-----------------------");
		System.out.println("¿Cuántas semanas has ahorrado?");
		tam=Leer.datoInt();
		
		dineroSemana=new int [tam];
		do {
			System.out.println("----------------------------------");
			System.out.println("0 - Salir");
			System.out.println("1 - Mostar datos");
			System.out.println("2 - Mostar el total ahorrado");
			System.out.println("3 - Semana que más he ahorrado");
			System.out.println("4 - Mostrar media");
			System.out.println("5 - Comparación");
			System.out.println("6 - Modificar dato");
			System.out.println("----------------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			
			
			switch(opcion) {
			
			case 1:
				
			
				System.out.println("¿Cuál es el mínimo que has introducido en la hucha?");
				desde=Leer.datoInt();
				System.out.println("¿Y el máximo?");
				hasta=Leer.datoInt();
				
				for (int i = 0; i < dineroSemana.length; i++) {
		
					dineroSemana[i]=rnd.nextInt(hasta-desde+1)+desde;
					
				}
				
				
				for (int i = 0; i < dineroSemana.length; i++) {
					
					System.out.printf("%s\t\t %s\n", sema, dinero);
					System.out.println("" + (i+1) + "  \t\t" +dineroSemana[i] + "€");
					System.out.println(" ");
					
				}
				
				break;
				
			case 2:
				 
				for (int i = 0; i < dineroSemana.length; i++) {
					
					suma+=dineroSemana[i];
				}
				
				System.out.println("La suma total es: " + suma + "€");
				System.out.println("");
				
				break;
				
			case 3:
				
				for (int i = 0; i < dineroSemana.length; i++) {
					
					if(semanMayor<dineroSemana[i]) {
						
						semanMayor=dineroSemana[i];
						
						semana=i;
						
					}
	
				}
				
				System.out.println("La semana mas ahorrada fue: " + (semana+1)  );
				System.out.println("Cantidad ahorrado: " + semanMayor );
				
				break;
				
			case 4:
				
				media = (double) suma / dineroSemana.length;
				System.out.println("La media es: " + media);
				break;
				
			case 5:
				
				for (int i = 0; i < dineroSemana.length; i++) {
					
					if(dineroSemana[i]>cincuenta) {
						
						valorSupe++;

						
					}

				}
				
				System.out.println("Ha superado la media en: " +  valorSupe + " semanas");
				break;
				
				
			case 6:
			
				semana=uno;
				while(semana!=cero) {
					System.out.println("Indique la semana que desea modificar:");
					System.out.println("Pulse 0 para volver al menú");
					semana=Leer.datoInt();
					if(semana<=dineroSemana.length && semana!=cero) {
						System.out.println("¿Cuánto ha ahorrado esa semana?");
						dineroSemana[semana-uno]=Leer.datoInt();
					}else if(semana!=cero) {
						System.out.println("No se puede introducir una semana mayor a las semanas ya introducidas en el array");
					}else {
						System.out.println("Volviendo al menú...");
					}
					
					
					
					
					
				}
				
				
				
			
			
			}
			
			
		}while(opcion!=cero);
		
		
		

	}

}


