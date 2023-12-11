package ejercicio2;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int carasDado, numCara = 0, tope = 10, contador = 0, comprobarCara, tirada = 0;
		
		Random r = new Random (System.nanoTime());
		
		r.nextInt(hasta-desde+1)+desde
		do {
			System.out.println("Bienvenidos al programa");
			
			System.out.println("Elija en el numero de caras tiene el dado");
			carasDado=Leer.datoInt();
			
			System.out.println("Elija que cara que quiere comprobar");
			comprobarCara=Leer.datoInt();
			
			for (int i = 0; i < tope; i++) {
				System.out.println(numCara + i);
				
				if(comprobarCara == numCara) {
					contador++;
				}
			}
					
					
			}while(carasDado !=0);
			
			}
	
	}


