package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num , tope = 10, opcion = 0;
		
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("Bienvenidos al programa de la tabla de multiplicar");
			System.out.println("--------------------------------------------------");
			System.out.println("Pulse 1 para multiplicar");
			System.out.println("pulse 0 para salir");
			System.out.println("--------------------------------------------------");
			opcion=Leer.datoInt();
			
			switch(opcion) {
				
				case 1:
					System.out.println("Indique el numero que deseas multiplicar");
					num=Leer.datoInt();
					for (int i = 0; i <= tope; i++) {
						System.out.println( i + "*" + num + "=" + i * num);
	
					}
						
					
					break;
			
					
				case 0: 
					System.out.println("Has salido del programa");
					break;
					
					
				default: 
					System.out.println("opcion no valida");
					break;
			}
			System.out.println("--------------------------------------------------");
			System.out.println("Gracias por usar el programa :)");
				
		}while(opcion !=0);	
	}

}
