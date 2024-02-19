package ejemplo;

import java.util.LinkedList;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LinkedList<Movil> lista = new LinkedList<>();
		  Movil m = new Movil ("Samsung","Galaxy S20","Negro",1250.00);
		  CrudMovil cm = new CrudMovil(lista);

		  int opcion, indice;
		  String marca = null, modelo = null, color = null;
		  double precio;
		  
		  do {
			
			  System.out.println("Bienvenido al progama");
			  System.out.println("Pulse 0 para salir del programa");
			  System.out.println("Pulse 1 para añadir un movil");
			  System.out.println("Pulse 2 para añadir en el ultimo lugar");
			  System.out.println("Pulse 3 para buscar por marca");
			  System.out.println("Pulse 4 para buscar el primero de la lista");
			  System.out.println("Pulsa 5 para borrar por indice");
			  System.out.println("Pulsa 6 para borrar el ultimo de la lista");
			  opcion=Leer.datoInt();
			  
			  
			  switch(opcion) {
			  		
			  	case 1:
			  		System.out.println("Introduzca la marca del movil");
			  		marca=Leer.dato();
			  		
			  		System.out.println("Introduzca el modelo del movil");
			  		modelo=Leer.dato();
			  		
			  		System.out.println("Introduzca el color del movil");
			  		color=Leer.dato();
			  		
			  		System.out.println("Introduzca el precio del movil");
			  		precio=Leer.datoDouble();
			  		
			  		cm.añadirMovil(new Movil(marca,modelo,color,precio));
			  		
			  		System.out.println(lista);
			  
			  		break;
			  		
			  	case 2:
			  		
			  		System.out.println("Introduzca la marca del movil");
			  		marca=Leer.dato();
			  		
			  		System.out.println("Introduzca el modelo del movil");
			  		modelo=Leer.dato();
			  		
			  		System.out.println("Introduzca el color del movil");
			  		color=Leer.dato();
			  		
			  		System.out.println("Introduzca el precio del movil");
			  		precio=Leer.datoDouble();
			  		
			  		cm.añadirMovilV2(new Movil(marca,modelo,color,precio));
			  		System.out.println(lista);
			  		
			  		break;
			  		
			  	case 3:
			  		System.out.println("Introduzca la marca que deseas buscar");
			  		marca=Leer.dato();
			  		
			  		System.out.println(cm.buscarMovil(marca));
			  		break;
			  		
				case 4:
			  	
			  		System.out.println(cm.buscarMovilV2(marca));
			  		break;
			  		
				case 5:
					System.out.println("Introduzca el indice que deseas borrar");
					indice=Leer.datoInt();
					
					cm.borrarMovil(indice);
					
					System.out.println(lista);
					
					break;
			  		
					
				case 6:
					 cm.borrarMovilV2();
					 
					 System.out.println(lista);
			  }
			  
			  
		} while (opcion !=0);
		  
	}

}
