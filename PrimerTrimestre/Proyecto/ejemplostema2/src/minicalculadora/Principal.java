package minicalculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, cero = 0, dos = 2, tope;
		double num1 = 0 , num2 ,  resultSum = 0, resultRest = 0, resultMulti = 0, resultDiv;
		
		do {
			
			System.out.println("Bienvenidos a la mini-calculadora");
			System.out.println("Pulsa 1 para sumar");
			System.out.println("Pulsa 2 para restar");
			System.out.println("Pulsa 3 para multiplicar");
			System.out.println("Pulsa 4 para dividir");
			System.out.println("Pulsa 5 para Par o Impar");
			System.out.println("Pulsa 0 para salir");
			opcion=Leer.datoInt();
			
			switch(opcion) {
					
			                case 1:
				
			
			                	System.out.println("Introduzca los números que quiera sumar");
			            		tope=Leer.datoInt();
			            		for (int i = 0; i < tope; i++) {
			            			
			            			System.out.println("Diga el " + (i+1 + "º número"));
			            			num1=Leer.datoDouble();
			            			resultSum += num1;
			            			
			            			
			            		}
			            			System.out.println("El resultado de la suma es de "+resultSum);

			      	}
		
			}while (opcion !=0);
			
		}
		
	

}
