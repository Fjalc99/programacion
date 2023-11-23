package tema2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion, opcionD;
		System.out.println("Pulse 1 para buenos días");
		System.out.println("Pulse 2 para buenas tardes");
		System.out.println("Pulse 3 para buenas noches");
		opcion=Leer.datoInt();
			
		switch (opcion) {
		
			case 1:
				System.out.println("Pulse 1 para cumpleaños");
				System.out.println("Pulse 2 para santo");
				opcionD=Leer.datoInt();
				switch (opcionD) {
				case 1:
				
				
				
				}
				System.out.println("Buenos días");
				break;
				
			case 2:
				System.out.println("Buenas tardes");
				break;
			
			case 3: 
				System.out.println("Buenas noches");
				break;
				
			default:
				System.out.println("Opción no valida");
				
				
		}
		System.out.println("Gracias por usar el programa");
		
	}

}
