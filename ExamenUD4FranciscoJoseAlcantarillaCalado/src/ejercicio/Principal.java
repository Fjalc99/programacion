package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, tam=20, idLeido;
		double porcentaje=0, extraPorMisil=10.0;
		
		Avion [] lista = new Avion [tam];
		
		
	
		Avion a = new NavesEspaciales(1, 200.0, 6000.0, 3);
		Avion a1 = new NavesEspaciales(2, 400.0, 25000.0, 9);
		Avion a2 = new NavesEspaciales(3, 500.0, 10000.0, 7);
		Avion a3 = new CazasMilitares(4, 600.0, 22000.0, 5);
		Avion a4 = new CazasMilitares(5, 800.0, 15000.0, 9);
		Avion a5 = new CazasMilitares(6, 300.0, 9000.0, 8);
		Avion a6 = new Avion(7, 1200.0, 24000.0);
		Avion a7 = new Avion(8, 1000.0, 30000.0);
		Avion a8 = new Avion(9, 1800.0, 7000.0);
		
		lista[0] = a;
		lista[1] = a1;
		lista[2] = a2;
		lista[3] = a3;
		lista[4] = a4;
		lista[5] = a5;
		lista[6] = a6;
		lista[7] = a7;
		lista[8] = a8;
		
		
		AeroPuerto ap = new AeroPuerto ("San Pablo",lista);
		
		
		do {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para calcular el aterriaje de un avion");
			System.out.println("Pulse 2 para mostrar todos los aterrizajes con aviso de naves espaciales");
			System.out.println("Pulse 3 para ver el total recaudado");
			System.out.println("Pulse 4 para ver el total recaudado en los cazas");
			System.out.println("----------------------------------------------------------------------------");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo del programa...");
					break;
					
				case 1:
					System.out.println("Introduzca la id del avion que quieres calcular su aterrizaje");
					idLeido=Leer.datoInt();
					
					System.out.println("Introduzca el porcentaje de ganancia si tiene mas de 4 motores");
					porcentaje=Leer.datoDouble();
					
					System.out.printf("El aterrizaje de un avion es en total: %.2f€ \n",ap.calcularAterrizajeUnAvion(ap.buscarPorId(idLeido), porcentaje, extraPorMisil));
					
					
					break;
			
					
				case 2:
					ap.mostrarLista();
					break;
			
					
				case 3:
					System.out.printf("El total recaudado en todos los aviones es: %.2f€\n",ap.calcularTotalRecaudado(porcentaje, extraPorMisil));
					break;
					
					
				case 4:
					System.out.printf("El total recaudado en todos los cazas es de: %.2f\n",ap.calcularTotalRecaudadoCazas(porcentaje, extraPorMisil));
					break;
					
				default:
					System.out.println("Opción no valida, introduzca de nuevo la opción");
					break;
			}

		} while (opcion!=0);
		
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Has salido, gracias por usar el programa");
	}

}
