package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, tam=10, descuento;
		String nombreHuesped;
		
		Habitacion [] lista = new Habitacion [tam];
		GestionHabitaciones g = new GestionHabitaciones(lista);
		
		lista[0] = new Habitacion(900, false, "Marisa", 10, 2);
		lista[1] = new Habitacion(800, true, "Andres", 9, 4);
		lista[2] = new Suite(700, true, "Fran", 10, 6, 25.0,30.0);
		lista[3] = new Suite(600, false, "Candi", 10, 7,50.0,40.0);
		lista[4] = new Apartamento(500, false, "Sebas", 8, 0,50.0);
		lista[5] = new Apartamento(400, true, "Rosa", 5, 4,25.0);
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("-----------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para alquiler la habitacion");
			System.out.println("Pulse 2 para mostrar lista habitaciones no ocupadas");
			System.out.println("Pulse 3 para calcular el total de las habitaciones ocupadas");
			System.out.println("-----------------------------------------------");
			opcion=Leer.datoInt();
			
			
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo del programa...");
				break;	
			
				case 1:
					
					System.out.println("Introduzca el nombre del huspede para coobrar el alquiler de la habitacion");
					nombreHuesped=Leer.dato();
					
					System.out.println("Introduzca el descuento aplicado");
					descuento=Leer.datoInt();
					
					System.out.println(g.calcularUnaHabitacion(g.buscarHabitacion(nombreHuesped), descuento));
					
					break;
			
					
				case 2:
					
					g.mostrarHabNoOcupadas();
					
		
					break;
		
				case 3: 
					
					System.out.println(g.calcularTotalHabOcupadas());
					
					break;
					
					
			}
			
			
			
			
			
			
			
			
		} while (opcion!=0);
		
		
		
		
		
		
		
		
	}

}
