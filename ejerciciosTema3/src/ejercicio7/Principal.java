package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde=1, hasta=2, opcion, submenu ;
		int cara=1 , cruz=2;
		
		CaraCruz c = new CaraCruz ();
		
		
		System.out.println("Bienvenido al programa");
		do {
			System.out.println("Pulsa 1 para elegir cara o cruz");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Pulsa 2 para cara");
				System.out.println("Pulsa 3 para cruz");
				submenu=Leer.datoInt();
				switch(submenu) {
				case 2:
					if(c.generarCaraCruz(desde, hasta) == cara) {
						System.out.println("¡¡¡¡Has ganado felicidades!!!!");
					}else {
						
						System.out.println("Has perdido buena suerte la próxima");
					}
					break;
					
				case 3:
					if (c.generarCaraCruz(desde, hasta) == cruz) {
						System.out.println("¡¡¡¡Has ganado felicidades!!!!");
					}else{
						System.out.println("Has perdido buena suerte la próxima");
					}
					break;
				}
				
				break;
			}
			
		} while (opcion !=0);
	}

}
