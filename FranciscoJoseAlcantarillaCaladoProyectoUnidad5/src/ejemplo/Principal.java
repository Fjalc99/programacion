package ejemplo;

import java.util.LinkedList;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LinkedList<Movil> lista = new LinkedList<>();
		  CrudMovil cm = new CrudMovil(lista);
		  
		  
		  int opcion, indice;
		  String marca, modelo, color;
		  double precio;
		  
		  
		  Movil m =new Movil("Samsung","Note 10","Blanco",500.0);
		  Movil m1 =new Movil("Xiaomi","Note 8","Negro",300.0);
		  Movil m2 =new Movil("Iphone","15 Pro","Negro",900.0);
		  Movil m3 =new Movil("Huawei","S5","Rojo",400.0);
		  
		  cm.añadirMovil(new Movil("Samsung","Note 10","Blanco",500.0));
		  cm.añadirMovil(new Movil("Xiaomi","Note 8","Negro",300.0));
		  cm.añadirMovil(new Movil("Iphone","15 Pro","Negro",900.0));
		  cm.añadirMovil(new Movil("Huawei","S5","Rojo",400.0));
		  
		  do {
			
			  System.out.println("Bienvenido al progama");
			  System.out.println("Pulse 0 para salir del programa");
			  System.out.println("Pulse 1 para añadir un movil");
			  System.out.println("Pulse 2 para añadir en el ultimo lugar");
			  System.out.println("Pulse 3 para buscar por marca");
			  System.out.println("Pulse 4 para buscar el primero de la lista");
			  System.out.println("Pulsa 5 para borrar por indice");
			  System.out.println("Pulsa 6 para borrar el ultimo de la lista");
			  System.out.println("Pulsa 7 para mostrar el ultimo de la lista");
			  System.out.println("Pulse 8 para mostrar y eliminar el primero de lista");
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
			  		
			  		cm.mostrarLista();
			  
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
			  		
			  		cm.mostrarLista();
			  		
			  		break;
			  		
			  	case 3:
			  		System.out.println("Introduzca la marca que deseas buscar");
			  		marca=Leer.dato();
			  		
			  		System.out.println(cm.buscarMovil(marca));
			  		break;
			  		
				case 4:
			  	
			  		System.out.println(cm.buscarMovilV2());
			  		break;
			  		
				case 5:
					System.out.println("Introduzca el indice que deseas borrar");
					indice=Leer.datoInt();
					
					cm.borrarMovil(indice);
					
					cm.mostrarLista();
					
					break;
			  		
					
				case 6:
					 cm.borrarMovilV2();
					 
					 cm.mostrarLista();
					 
					 break;
			 
				case 7:
					
					cm.mostrarLista();
					System.out.println("###############################");
					System.out.println(cm.mostrarPeeak());
					System.out.println("###############################");
					cm.mostrarLista();
					break;
					
				
				case 8:
					cm.mostrarLista();
					System.out.println("###############################");					
					System.out.println(cm.mostrarYeliminar());
					System.out.println("###############################");
					cm.mostrarLista();
					
					break;
					
				
				default:
					System.out.println("Opcion no valida pruebe de nuevo");
					
					break;
					
			  }
			  
			 
		} while (opcion !=0);
		  
	}

}
