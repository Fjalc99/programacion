package ejercicioTipoExamen2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, numeroTrastero, nuevaOpcion;
		String direccion;
		double precio, capMetrosM2, nuevoPrecio;
		boolean ocupado;
		
		
		
		List <Trastero> lista = new ArrayList <>();
		Oficina of = new Oficina (lista);
		
		
		of.añadirTrastero(new Trastero(22.00, "Avenida Ámerica", 3,600.0,false));
		of.añadirTrastero(new Trastero(220.00, "Avenida Aljarafe", 23,700.0,false));
		of.añadirTrastero(new Trastero(122.00, "Avenida Palmera", 26,2600.0,true));
		of.añadirTrastero(new Trastero(232.00, "Avenida Argentina", 13,800.0,false));
		of.añadirTrastero(new Trastero(262.00, "Avenida Francia", 18,800.0,false));
		
		do {
			System.out.println("-----------------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("-----------------------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para añadir un trastero");
			System.out.println("Pulse 2 para buscar por precio");
			System.out.println("Pulse 3 para buscar por número de trastero");
			System.out.println("Pulse 4 para buscar el trastero de mayor precio");
			System.out.println("Pulse 5 para eliminar un trastero");
			System.out.println("Pulse 6 para modificar el precio de un trastero");
			System.out.println("Pulse 7 para mostrar los pisos que no estan ocupados");
			System.out.println("Pulse 8 para ordernar por número de forma ascedente");
			System.out.println("Pulse 9 para ordernar por precio de forma ascedente");
			System.out.println("-----------------------------------------------------------");
			opcion=Leer.datoInt();
			System.out.println("");
			
			switch(opcion) {
			
				case 0: 
					System.out.println("Saliendo del programa...");
					break;
			
				case 1:
						
					System.out.println("Introduzca los metros cuadrados del trastero");
					capMetrosM2=Leer.datoDouble();
					
					System.out.println("Introduzca la direccion del trastero");
					direccion=Leer.dato();
					
					System.out.println("Introduzca el número del trastero");
					numeroTrastero=Leer.datoInt();
					
					System.out.println("Introduzca el precio del trastero");
					precio=Leer.datoDouble();
					
					System.out.println("Introduzca 1 para que el trastero este ocupado y cualquier otro numero para que no este ocupado");
					nuevaOpcion=Leer.datoInt();
					
					if(nuevaOpcion==1) {
						ocupado=true;
					}else {
						ocupado=false;
					}
					
					of.añadirTrastero(new Trastero(capMetrosM2,direccion,numeroTrastero,precio,ocupado));
					
					break;
			
					
				case 2:
						
					System.out.println("Introduzca el precio para buscar");
					precio=Leer.datoDouble();
					
					System.out.println(of.buscarPrecio(precio));
					
					break;
					
					
				case 3:
						
						System.out.println("Introduzca el número de piso que deseas buscar");
						numeroTrastero=Leer.datoInt();
						
						System.out.println(of.buscarNumero(numeroTrastero));
					
					break;
					
					
					
				case 4:
					
					System.out.println(of.mostrarMayorPrecio());
					
						
					break;
					
					
				case 5:
					System.out.println("Introduzca el número del trastero que quieres eliminar");
					numeroTrastero=Leer.datoInt();
					
					of.borrarTrastero(numeroTrastero);
					
					break;
					
				case 6:
					
					System.out.println("Introduzca el número del trastero que quieres modificar");
					numeroTrastero=Leer.datoInt();
					
				
					System.out.println("Introduzca el nuevo precio");
					nuevoPrecio=Leer.datoDouble();
					
					
					of.modificarPrecio(of.buscarNumero(numeroTrastero), nuevoPrecio);
					
				case 7:
					
					of.mostrarTrasterosNoOcupados();
					break;
					
				case 8:
					
					Collections.sort(lista);
					for (Trastero t : lista) {
						System.out.println(t);
					}
					
					break;
					
				case 9:
					
					Collections.sort(lista, new OrdenarPorPrecio());
					for (Trastero t : lista) {
						System.out.println(t);
					}
					break;
					
				default:
					System.out.println("-----------------------------------------------------------");
					System.out.println("Opcion no valida vuelva a introducir de nuevo la opción");
					 break;
			}
			
			
		} while (opcion !=0);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Has salido, gracias por usar el programa");
		
	}

}
