package ejemploCalculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, total;
		int opcion;
		
		System.out.println("Introduzca el primer numero");
		num1=Leer.datoDouble();
		
		System.out.println("Introduzca el segundo numero");
		num2=Leer.datoDouble();
		
		
		do {
			System.out.println("1 para sumar");
			System.out.println("2 para restar");
			System.out.println("3 para multiplicar");
			System.out.println("4 para dividir");
			opcion=Leer.datoInt();
			
			
			
			switch(opcion) {
				
				case 1:
					
					total = num1 + num2;
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> restar
=======
>>>>>>> multiplicar
					
					break;
					
				case 2:
<<<<<<< HEAD
<<<<<<< HEAD

					
			

=======
>>>>>>> restar
=======
>>>>>>> multiplicar
			
					total = num1 - num2;
					
					break;
			
				case 3:
					
					total = num1 * num2;
					break;
			
					
				case 4:
					total= num1 / num2;
					
					break;
					
				case 0:
					System.out.println("Saliendo del programa...");
					break;
			}
			
			
			
			
		} while (opcion!=0);
		
		
		
	}

}
