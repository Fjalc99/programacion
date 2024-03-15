package ejemplosdowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double precVip = 10.0, precNor = 5.00, prec3D = 8.75, precNiños = 2.50, total = 0.0 ;
		int cant = 0, sala = 0;
		
		
		
	do {
			System.out.println("Bienvenidos al programa para elegir la sala de cine");
			System.out.println("----------------------------------------------------");
			System.out.println("Pulse 1 para la sala de cine VIP");
			System.out.println("Pulse 2 para la sala de cine normal");
			System.out.println("Pulse 3 para la sala de cine 3D");
			System.out.println("Pulse 4 para la sala de cine de niños");
			System.out.println("Pulse 0 para salir");
			System.out.println("----------------------------------------------------");
			sala=Leer.datoInt();
			
			switch (sala) {
			 case 1:
				 System.out.println("Has elegido la sala vip, tiene un precio de 10€ , introduzca cuantas entradas deseas comprar");
				 cant=Leer.datoInt();
				 total= cant * precVip;
				 System.out.printf("El precio total de las entradas es de %.2f €\n",total);
				 break;
				 
			 case 2:
				 System.out.println("Has elegido la sala normal, tiene un precio de 5€ , introduzca cuantas entradas deseas comprar");
				 cant=Leer.datoInt();
				 total= cant * precNor;
				 System.out.printf("El precio total de las entradas es de %.2f €\n",total);
				 break;
				 
			 case 3:
				 System.out.println("Has elegido la sala 3D, tiene un precio de 8.75€ , introduzca cuantas entradas deseas comprar");
				 cant=Leer.datoInt();
				 total= cant * prec3D;
				 System.out.printf("El precio total de las entradas es de %.2f €\n",total);
				 break;
				 
			 case 4:
				 System.out.println("Has elegido la sala vip, tiene un precio de 2,50€ , introduzca cuantas entradas deseas comprar");
				 cant=Leer.datoInt();
				 total= cant * precNiños;
				 System.out.printf("El precio total de las entradas es de %.2f € \n",total);
				 break;
				 
			 case 0: 
				 System.out.println("Has salido del Programa");
				 break;
			
			default: 
				System.out.println("Opcion no valida");

			}	
			System.out.println("--------------------------------------------------------");
			System.out.println("Gracias por usar el programa que disfrute de la pelicula");
			System.out.println("--------------------------------------------------------");
			
			
	}while(sala !=0);
	
	}

}
