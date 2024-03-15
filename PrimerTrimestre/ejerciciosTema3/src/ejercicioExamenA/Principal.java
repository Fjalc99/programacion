package ejercicioExamenA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroM2, estado, id = 0, idLeido, uno=1, dos=2;
		String direccion;
		double precioVenta;
		int tam=0, tam2=10 ;
		double porcentaje, nuevoPrecio, precioFinal = 0;
		
		
		
		
		int opcion;
		Piso p;
		Piso [] lista = new Piso [tam2];
		lista[0] =  new Piso("a",10,1,1000,1);
		lista[1] =  new Piso("b",20,1,1100,2);
		lista[2] =  new Piso("c",30,2,1500,3); 
		lista[3] =  new Piso("d",40,2,1400,4);
		lista[4] =  new Piso("e",50,3,1800,5);
		lista[5] =  new Piso("f",60,3,1600,6);
		Inmobiliaria t = new Inmobiliaria(lista, tam2, 6 );
		
		
			do {
				System.out.println("-------------------------------------------------");
				System.out.println("Bienvenido al programa");
				System.out.println("-------------------------------------------------");
				System.out.println("Pulse 0 para salir del programa");
				System.out.println("Pulse 1 para agregar un piso ");
				System.out.println("Pulse 2 para mostrar pisos");
				System.out.println("Pulse 3 para calcular el precio del piso");
				System.out.println("Pulse 4 para ver todos los pisos nuevos");
				System.out.println("Pulse 5 para modificar el precio del piso");
				System.out.println("Pulse 6 para calcular el precio al m2 cuadrado");
				System.out.println("-------------------------------------------------");
				opcion=Leer.datoInt();
				
				
				switch(opcion) {
				
					case 0:
						System.out.println("-------------------------------------------------");
						System.out.println("Saliendo del programa...");
						break;
						
					case 1:
						
						System.out.println("Introduzca la dirección del piso");
						direccion=Leer.dato();
						
						System.out.println("Introduzca el número de m2 que tiene el piso");
						numeroM2=Leer.datoInt();
						
						System.out.println("Introduzca el estado del piso, 1 nuevo, 2 seminuevo, 3 reformar");
						estado=Leer.datoInt();
						
						System.out.println("Introduzca el precio de venta del piso");
						precioVenta=Leer.datoDouble();
						
						//System.out.println("Introduzca la id del piso");
						//id=Leer.datoInt();
						
						id++;
						
						p = new Piso(direccion, numeroM2, estado, precioVenta, id);
						
						t.agregarPisos(p);
						
						break;
					
				
					case 2:
						
						t.mostrarPisos(lista);
						
						break;
						
					case 3:
						
						System.out.println("Introduzca el id del piso que quieres calcular");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el porcentaje que quiere de ganancia");
						porcentaje=Leer.datoDouble();
						
						System.out.println(t.calcularPrecioFinal(porcentaje, idLeido));
						
						break;
				
					case 4:
						
						System.out.println("Introduzca el 1 para ver todos los nuevos");
						estado=Leer.datoInt();
						
						if (estado==uno) {
							t.mostrarPisosNuevos(t.buscarPisoNuevos(estado));
						}
						
						
						
						
						break;
						
						
						
					case 5:
						
						System.out.println("Introduzca el id del piso que desea modificar el precio");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el nuevo precio para el piso");
						nuevoPrecio=Leer.datoDouble();
						
						t.modificarPrecioPiso(t.buscarPiso(idLeido), nuevoPrecio);
						
						break;
						
						
					case 6:
						
						System.out.println("Introduzca el id del piso que quieres calcular");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el porcentaje de ganancia");
						porcentaje=Leer.datoDouble();
						
						
						System.out.println("Introduzca el numero de m^2");
						numeroM2=Leer.datoInt();
						
						
						System.out.println(t.calcularPrecioM2(idLeido, porcentaje));
						
					
						break;
						
						
					case 7:
						
						System.out.println("Introduzca el 2 para sacar los pisos seminuevos");
						estado=Leer.datoInt();
						
						
						
						System.out.println(t.calcularTotalPisosSeminuevos(estado));
						
						
						break;
						
						
						
					default:
						
						System.out.println("-------------------------------------------------");
						System.out.println("Opción no valida, vuelva a introducir de nuevo");
						break;
				}
				
				
			} while (opcion!=0);
		
			System.out.println("-------------------------------------------------");
			System.out.println("Has salido, gracias por usar el programa");
	}

}
