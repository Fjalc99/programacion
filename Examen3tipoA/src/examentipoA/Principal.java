package examentipoA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, metroCuadrados, estado;
		String direccion;
		double precioVenta;
		
		
		do{
			
			System.out.println("Bienvenido al programa");
			System.out.println("Pulse 1 para agregar un piso");
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
			
			
			
			
			}
			
			
		}while(op != 0);
		
		
	}

}
