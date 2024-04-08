package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10, opcion, idLeido;
		double porcentaje, extraDobleEspadas, pagar;
		Producto [] lista = new Producto [tam];
		Ventas v = new Ventas (lista);
		
		lista[0] = new Moviles(1,500.0,25,"Samsung","S10");
		lista[1] = new Moviles(2,1500.0,10,"Iphone","15");
		lista[2] = new EspadaLaser(3,800.0,20,"Sable verde","simple");
		lista[3] = new EspadaLaser(4,1900.0,3,"Sable rojo","doble");
		
		
		
		do {
			
			System.out.println("-------------------------------------------------");
			System.out.println("Bienvenido al programa");
			System.out.println("-------------------------------------------------");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para saber los productos que hay en venta en total");
			System.out.println("Pulse 2 pare calcular el total de dinero recaudado");
			System.out.println("Pulse 3 para recibir el cambio de la compra");
			System.out.println("Pulse 4 para mostrar lista ");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
				case 0: 
					System.out.println("Saliendo del programa...");
				break;
				
				
				case 1:
					
					System.out.println("La cantidad total de productos en ventas es de "+v.cantTotalProductos());
					break;
			
			
				case 2:
						System.out.println("Introduzca el porcentaje de ganacia");
						porcentaje=Leer.datoDouble();
						
						System.out.println("Introduzca el Extra por ser espada doble");
						extraDobleEspadas=Leer.datoDouble();
						
						
						System.out.printf("\nEl precio total de ventas es de %.2f€ \n",v.calcularTotalVentas(porcentaje, extraDobleEspadas));
					
						
					break;
					
					
					
				case 3:
						System.out.println("Introduzca la id del producto que quieres comprar");
						idLeido=Leer.datoInt();
						
						System.out.println("Introduzca el porcentaje de ganancias");
						porcentaje=Leer.datoDouble();
						
						System.out.println("Introduzca el Extra por ser espada doble");
						extraDobleEspadas=Leer.datoDouble();
						
						System.out.printf("\nEl precio del producto es de %.2f€ \n",v.calcularUnProducto(porcentaje, extraDobleEspadas, idLeido));
					
						
						System.out.println("Introduzca el dinero a pagar");
						pagar=Leer.datoDouble();
						if (pagar >= v.calcularUnProducto(porcentaje, pagar, idLeido)) {
							
							
							System.out.printf("\nEl cambio es %.2f€ \n",v.devolverCambio(porcentaje, extraDobleEspadas, idLeido, pagar));
						}
						
						
						
						
						
					
					break;
			
					
				case 4:
					v.mostrar();
					
					break;
					
					
			}
			
			
			
			
			
			
			
		} while (opcion!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
