package EjercicioTipoExamenv3;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, id, numVecesEscuchada, opcionEstado;
		String interprete, nombreCanc;
		boolean estado;
		double duracion;
		
		
		
		List <Cancion> lista = new ArrayList <>();
		MiMusica miMus = new MiMusica(lista);

		miMus.añadirCancion(new Cancion(1,"Solita","Bad bunny",20,false,1.20));
		miMus.añadirCancion(new Cancion(2,"Malo","Juan magan",10,true,2.20));
		miMus.añadirCancion(new Cancion(3,"Malamente","Rosalia",4,true,4.20));
		miMus.añadirCancion(new Cancion(4,"Roto","Pole",6,false,4.20));
		miMus.añadirCancion(new Cancion(5,"Soltera","Lunnay",12,true,5.20));
		miMus.añadirCancion(new Cancion(6,"Soltera Remix","Lunnay",12,true,8.20));
		
		
		
		do {
				System.out.println("Bienvenido al programa");
				System.out.println("Pulse 0 para salir del programa");
				System.out.println("Pulse 1 para añadir una canción");
				System.out.println("Pulse 2 para buscar las canciones gratis");
				System.out.println("Pulse 3 para buscar la cancion con mayor duracion");
				System.out.println("Pulse 4 para buscar todas las canciones de un intérprete");
				System.out.println("Pulse 5 para buscar la canción mas escuchada");
				System.out.println("");
				System.out.println("Pulse 7 para ordenar de manera alfabeticamente");
				System.out.println("Pulse 8 para ordenar de mayor a menor la duracion");
				opcion=Leer.datoInt();
			
				
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo del programa...");
					
					break;
					
				case 1: 
					System.out.println("introduzca el id de la canción");
					id=Leer.datoInt();
					
					System.out.println("Introduzca el nombre de la canción");
					nombreCanc=Leer.dato();
					
					System.out.println("Introduzca el intérprete de la canción");
					interprete=Leer.dato();
					
					System.out.println("Introduzca el número de veces escuchadas");
					numVecesEscuchada=Leer.datoInt();
					
					
					System.out.println("Introduzca el estado de la canción 1 para que sea gratis y cualqier otro para que sea de pago");
					opcionEstado=Leer.datoInt();
					
					
					if (opcionEstado==1) {
						estado= false;
					}else {
						estado=true;
					}
					
					System.out.println("Introduzca la duración de la canción");
					duracion=Leer.datoDouble();
					
					break;
					
				case 2:
					
			
					miMus.buscarCancionesGratis();
					
					break;
					
					
				case 3:
					
					System.out.println(miMus.buscarCancMayorDurac());
					
					break;
					
				case 4:
					System.out.println("Seleccione el interprete que deseas buscar");
					interprete=Leer.dato();
					
					System.out.println(miMus.buscarPorInterprete(interprete));
					
					break;
				
				case 5:
					
					System.out.println(miMus.buscarCanMasEscuchadas());
					break;
			
				case 6:
					
					miMus.ordenarAlfabeticamente();
					break;
					
				case 7:
					
					miMus.ordenarDuracionMayor();
					break;
					
				case 8:
					
					miMus.mostrarLista();
					break;
					
				case 9:
					
					System.out.println("Introduzca el id de la canción que deseas buscar");
					id=Leer.datoInt();
					
					System.out.println("Introduzca el estado de la canción 1 para que sea gratis y cualqier otro para que sea de pago");
					opcionEstado=Leer.datoInt();
					
					
					if (opcionEstado==1) {
						estado= false;
					}else {
						estado=true;
					}
					
					
					miMus.modificarPrecio(miMus.buscarPorId(id), estado);
					
					
					break;
			
			}
			
			
			
		} while (opcion !=0);
		
		
	}

}
