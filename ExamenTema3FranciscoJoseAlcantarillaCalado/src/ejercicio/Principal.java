package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, opcion, id=4, numMagdalenas=4, idLeido;
		String nombrePasteleria = "Pasteleria Triana", sabor;
		double precio, extra, pvp;
		
		Magdalena [] lista;
		
		System.out.println("Introduzca el tamaño de la lista");
		tam=Leer.datoInt();
		
		lista = new Magdalena [tam];
		
		lista[0] = new Magdalena(1,"Fresa",20.0, true);
		lista[1] = new Magdalena(2,"Fresa",30.0, true);
		lista[2] = new Magdalena(3,"Chocolate",40.0, false);
		lista[3] = new Magdalena(4,"Chocolate",50.0, false);
		
		Pasteleria p = new Pasteleria (lista, nombrePasteleria, numMagdalenas);
		
		
		do {
				System.out.println("------------------------------------------------");
				System.out.println("Bienvenido al programa");
				System.out.println("------------------------------------------------");
				System.out.println("Pulse 0 para salir del programa");
				System.out.println("Pulse 1 para calcular precio total de una magdalena");
				System.out.println("Pulse 2 para aplicar extra para las Cupcakes");
				System.out.println("Pulse 3 para aplicar el porcentaje de PVP");
				System.out.println("Pulse 4 para buscar por sabor");
				System.out.println("Pulse 5 para calcular el precio total de coste");
				
				System.out.println("------------------------------------------------");
				
				opcion=Leer.datoInt();
				
				switch(opcion) {
				
					default:
						System.out.println("------------------------------------------------");
						System.out.println("Opción no valida, vuelva a introducir de nuevo");
						break;
				
					case 0:
						System.out.println("------------------------------------------------");
						System.out.println("Saliendo del programa...");
						break;
						
						
					case 1:
						System.out.println("Introduzca el id de la magdalena que desea saber el precio de coste");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el precio para saber el precio de coste");
						precio=Leer.datoDouble();
						
						System.out.printf("El precio de coste es de %.2f€ \n", p.calcularPrecioCoste(precio, p.buscarPorId(id)));
						
						
						break;
						
					case 2:
						
						System.out.println("Introduzca el id para sumar extra si le hace falta");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el precio del Capcake");
						precio=Leer.datoDouble();
						
						System.out.println("Introduzca el porcentaje extra");
						extra=Leer.datoDouble();
						
						System.out.printf("El precio total con el extra es de %.2f€\n",p.calcularExtra(extra, p.buscarPorId(idLeido), precio));
						
						
						break;
						
					case 3:
						System.out.println("Introduzca el id para saber el precio de PVP");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el precio de la magdalena");
						precio=Leer.datoDouble();
						
						System.out.println("Introduzca el porcentaje de PVP");
						pvp=Leer.datoDouble();
						
						System.out.println(p.calcularPvp(p.buscarPorId(idLeido), pvp, precio));
						
				
				
					case 4:
							System.out.println("Introduzca el sabor/es que desea buscar");
							sabor=Leer.dato();
							
							p.mostrarSabores(p.buscarPorSabor(sabor));
						
						break;
					
					case 5:
						
						System.out.println("Introduce el precio del centímetro cúbico");
						precio=Leer.datoDouble();
						
						
						System.out.printf( "El precio total de coste de todas es de %.2f€ \n",p.calcularPrecioCosteTotal(precio, lista));
						
						
						break;
				}

		} while (opcion!=0);
		System.out.println("------------------------------------------------");
		System.out.println("Has salido, gracias por usar el programa ");
	}

}
