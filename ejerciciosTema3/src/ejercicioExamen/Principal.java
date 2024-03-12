package ejercicioExamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, tam, id=5,  numeroDeGastos=5, idLeido;
		Gasto [] lista;
		GestionGastos ga;
		Gasto g;
		double cantTotalGastada = 0, cantGastos, nuevaCantGastos;
		String concepto;
		
		System.out.println("Introduzca el tamaño de la lista de gastos");
		tam=Leer.datoInt();
		
		lista = new Gasto [tam];
		
		lista[0] = new Gasto("Ropa", 30.0, 1 );
		lista[1] = new Gasto("Ropa", 40.0, 2 );
		lista[2] = new Gasto("Cenas", 50.0, 3 );
		lista[3] = new Gasto("Cenas", 60.0, 4 );
		lista[4] = new Gasto("Regalos", 70.0, 5 );
		
		
		
		
		ga = new GestionGastos (lista, cantTotalGastada,numeroDeGastos);
		
		
		
		do {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("--------------------------------------------------------------");
			System.out.println("Pulse 0 para salir del menu");
			System.out.println("Pulse 1 para añadir un gasto");
			System.out.println("Pulse 2 para mostrar la lista");
			System.out.println("Pulse 3 para calcular el total gastado");
			System.out.println("Pulse 4 para mostrar el gasto con su cantidad gastada");
			System.out.println("Pulse 5 para calcular si me he pasado del presupuesto o no");
			System.out.println("Pulse 6 para modificar cantidad");
			System.out.println("Pulse 7 para buscar por conceptos");
			System.out.println("--------------------------------------------------------------");
			opcion=Leer.datoInt();
			
			
			
			 switch(opcion) {
			
			 	case 0:
			 		
			 		System.out.println("Saliendo del programa...");
			 		break;
			 
			 	case 1: 
			 		System.out.println("Introduzca el concepto del gasto");
			 		concepto=Leer.dato();
			 		
			 		System.out.println("Introduzca el total gastado");
			 		cantGastos=Leer.datoDouble();
			 		
			 		id++;
			 		g = new Gasto (concepto, cantGastos, id);
			 		ga.addGasto(g);
			 		
			 		break;
			 
			 	case 2:
			 		
			 		ga.mostrarLista();
			 		
			 		
			 		break;
			 		
			 	case 3:
			 		System.out.println(ga.calcularTotalGastos());
			 	
			 		break;
			 		
			 	case 4: 
			 		
			 		ga.mostrarCantidad();
			 		
			 		break;
			 		
			 	case 5:
			 		
			 		
			 		
			 		break;
			 		
			 		
			 	case 6:
			 		
			 		System.out.println("Introduzca el id del concepto que quireres modificar");
			 		idLeido=Leer.datoInt();
			 		
			 		System.out.println("Introduzca la nueva cantidad de gasto");
			 		nuevaCantGastos=Leer.datoDouble();
			 		
			 		ga.modificarCantidad(ga.buscarPorId(idLeido), nuevaCantGastos);
			 		
			 		break;
			 		
			 		
			 	case 7:
			 		
			 		System.out.println("Introduzca el concepto que quieres buscar");
			 		concepto=Leer.dato();
			 		
			 		ga.mostrarListaV2(ga.buscarConcepto(concepto));
			 		
			 		break;
			 }
			
			
			
			
			
			
			
			
		} while (opcion!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
