package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket t ;
		
		double precio;
		int numPersonas, opcion;
		String destino;
		
		
		do {
				System.out.println("Pulse 1 para comprar billete");
				opcion=Leer.datoInt();
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo del programa...");
					break;
			
				case 1:
					
					System.out.println("Introduzca el precio del billete");
					precio=Leer.datoDouble();
					
					
					System.out.println("Introduzca el número de personas del billete");
					numPersonas=Leer.datoInt();
					
					
					System.out.println("Introduzca a donde va usted");
					destino=Leer.dato();
					
					t= new Ticket(precio,numPersonas,destino);
					
					System.out.println();
					
					break;
					
				case 2:
					
			
			}
			
			
		} while (opcion !=0);
		
	}

}
