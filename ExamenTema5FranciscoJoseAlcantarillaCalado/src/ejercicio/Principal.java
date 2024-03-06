package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion, dorsal, golesMarcados, nuevaOpcion, uno=1, dos=2;
		String nuevaPoscion, nombreJugador, posicion;
		boolean titular;
		
		List <Jugador> lista = new ArrayList <>();
		Equipo e = new Equipo (lista, "Betis");

		
		e.añadirJugador(new Jugador("Fran","Delantero",26,26,true));
		e.añadirJugador(new Jugador("Carlos","Defensa",10,30,true));
		e.añadirJugador(new Jugador("Candi","Portero",1,0,true));
		e.añadirJugador(new Jugador("Manuel","Centrocampista",5,60,false));
		e.añadirJugador(new Jugador("Pablo","Portero",7,0,false));
		
		
		do {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pulse 0 paras salir");
			System.out.println("Pulse 1 para añadir un jugador");
			System.out.println("Pulse 2 para mostrar toda lista");
			System.out.println("Pulse 3 para buscar todos los jugadores que no han marcado");
			System.out.println("Pulse 4 para buscar por dorsal");
			System.out.println("Pulse 5 para modificar la posición");
			System.out.println("Pulse 6 para ordenar por posición");
			System.out.println("Pulse 7 para ordenar por cantidad de goles");
			System.out.println("---------------------------------------------------------------");
			opcion=Leer.datoInt();
			
			
			switch(opcion){
			
				case 0:
					System.out.println("---------------------------------------------------------------");
					System.out.println("Saliendo del programa...");
					break;
					
				case 1:
					
					System.out.println("Introduzca el nombre del jugador");
					nombreJugador=Leer.dato();
					
					System.out.println("Introduzca la posición del jugador");
					posicion=Leer.dato();
					
					System.out.println("Introduzca el dorsal del jugador");
					dorsal=Leer.datoInt();
					
					System.out.println("Introduzca los marcados por el jugador");
					golesMarcados=Leer.datoInt();
					
					System.out.println("Introduzca si es titular o no, pulse 1 para titular o 2 para suplente");
					nuevaOpcion=Leer.datoInt();
					
					if (nuevaOpcion==uno) {
						titular=true;
					}else {
					
							titular=false;	
					}
					
					e.añadirJugador(new Jugador(nombreJugador,posicion, dorsal, golesMarcados,titular));
					
					
					break;
					
				case 2:	
					e.mostrarLista();
					break;
					
				case 3:
					
					e.mostrarJugSinGoles();
					break;
			
				case 4:
					
					System.out.println("Introduzca el dorsal que deseas buscar");
					dorsal=Leer.datoInt();
					
					System.out.println(e.buscarPorDorsal(dorsal));
					
	
					break;
					
				case 5:
					
					System.out.println("Introduzca el dorsal al que quieres cambiar la posición");
					dorsal=Leer.datoInt();
					
				
					System.out.println("Introduzca la nueva posición");
					nuevaPoscion=Leer.dato();
					
					e.modificarPosicion(e.buscarPorDorsal(dorsal), nuevaPoscion);
					
					break;
					
				case 6:
					e.ordenarPorPosicion();
					
					e.mostrarLista();
					break;
					
				case 7:
					
					e.ordenarPorCantidadGoles();
					e.mostrarLista();
					break;
					
					
				default:
					System.out.println("Opción no valida, vuelva a introducir de nuevo una opción");
					break;
			}
			
			
		} while (opcion!=0);
		
		System.out.println("Has salido, gracias por usar el programa");
		
		
		
	}

}
