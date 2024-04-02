package ejerciciosExamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10, opcion;
		String matricula;
		Vehiculo v;
		Vehiculo  [] lista = new Vehiculo [tam];
		lista[0] = new Vehiculo("1245F",25.5,50);
		lista[1] = new Batmovil ("12588F",65,55,40);
		lista[2] = new PatinetesVoladores ("12587F",65,20,400.5);		
		
		
		Alquiler a = new Alquiler (lista);
		
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("-----------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para calcular el alquiler del vehículo");
			System.out.println("Pulse 2 para mostrar la lista");
			
			
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
			
			}
			
			
			
		} while (opcion !=0);
	}

}
