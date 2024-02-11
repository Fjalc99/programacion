package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double precio, paga;
		int numPersonas, opcion;
		String destino;
		Maquina m = null;
		Ticket t ;
		
		do {
				System.out.println("Pulse 1 para comprar billete");
				System.out.println("Pulse 2 para obtner el cambio");
				opcion=Leer.datoInt();
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo del programa...");
					break;
			
				case 1:
					
					System.out.printf("Introduzca el precio del billete\n");
					precio=Leer.datoDouble();
					
					
					System.out.printf("Introduzca el número de personas del billete\n");
					numPersonas=Leer.datoInt();
					
					
					System.out.println("Introduzca a donde va usted");
					destino=Leer.dato();
					
					t= new Ticket(precio,numPersonas,destino);
					m = new Maquina (t);
					System.out.printf("El precio del billete es de %.2f€\n",m.calcularPrecioBillete(t));
					
				
					
					break;
					
				case 2:
					System.out.printf("Introduzca el dinero para pagar el billete\n");
					paga=Leer.datoDouble();
							
					System.out.printf("Su cambio es %.2f€\n", m.calcularVuelta(paga));
					
			
			}
			
			
		} while (opcion !=0);
		
	}

}
