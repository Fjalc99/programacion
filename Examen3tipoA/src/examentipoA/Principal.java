package examentipoA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, metroCuadrados, estado, idLeido;
		String direccion;
		double precioVenta;
		int tam=0, tam2=10;
		Piso p;
		
		Piso [] lista=new Piso[tam2];
		Inmobiliaria t=new Inmobiliaria(lista, tam, 3); 
		
		
		do{
			
			System.out.println("Bienvenido al programa");
			System.out.println("Pulse 1 para agregar un piso");
			System.out.println("Pulse 2 para mostrar la lista");
			System.out.println("Pulse 10 para buscar piso");
			System.out.println("Pulse 0 para salir del programa");
			op=Leer.datoInt();
			
			switch(op) {
			
			case 0: 
				System.out.println("Has salido del programa");
				break;
			
			case 1:
				
				System.out.println("Introduzca la dirección");
				direccion=Leer.dato();
				System.out.println("Introduzca los metros cuadrados");
				metroCuadrados=Leer.datoInt();
				System.out.println("Introduzca el numero para saber estado del piso, 1 nuevo, 2 seminuevo, 3 reformar");
				estado=Leer.datoInt();
				System.out.println("Introduzca el precio de venta");
				precioVenta=Leer.datoDouble();
				break;
				
			case 2:
					t.mostrarPisos(lista);
				
				
		
			
			
			
			}
			
			
		}while(op != 0);
		
		
	}

}
