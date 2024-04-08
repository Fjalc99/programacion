package ejerciciosExamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10, opcion;
		String matricula;
		
		Vehiculo  [] lista = new Vehiculo [tam];
		
		lista[0] = new Batmovil ("12588F",65,2024,40);
		lista[1] = new PatinetesVoladores ("12587F",65,2024,400.5);		
		lista[2] = new Batmovil("14578A", 10.0, 2024, 6);
		lista[3] = new PatinetesVoladores("16547L", 20.0, 2024, 600);
		
		Alquiler a = new Alquiler (lista);
		
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("-----------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para calcular el alquiler del vehículo");
			System.out.println("Pulse 2 para mostrar la lista");
			System.out.println("Pulse 3 para ver total recaudado");
			System.out.println("Pulse 4 para ver total solo de batmoviles");
			
			
			System.out.println("-----------------------------------------------");
			
			
			
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
				case 0: 
					System.out.println("Saliendo del programa...");
				break;
				
				case 1:
					System.out.println("Introduzca la matricula del vehiculo que quieres calcular el precio de alquiler");
					matricula=Leer.dato();
					
					System.out.println(a.calcularAlquilerUnVehiculo(a.buscarPorMatricula(matricula)));
					
					break;
					
				case 2:
					
					a.mostrarLista();
					
					break;
					
				case 3:
					
					System.out.println(a.totalRecaudado());	
					
					
					break;
			
					
				case 4:
						System.out.println(a.totalRecaudadoBatmovil());
					
					break;
					
				default:
					
					System.out.println("Opción no valida introduzca el número de nuevo");
					break;
			}
			
			
			
			
			
		} while (opcion !=0);
	}

}
