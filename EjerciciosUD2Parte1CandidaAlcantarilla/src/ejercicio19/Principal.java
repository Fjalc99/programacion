package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
		multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
		en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
		comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero) */
		
		String op1="Suma", op2="Resta", op3="Multiplicación", op4="División", op5="Par o Impar";
		double num1=0.0, num2=0.0, resultSum=0.0, resultRest=0.0, resultMul=1.0, resultDiv=1.0, resultPaIm;
		int opcion, cero=0, tope=0, dos=2;
		
		System.out.println("***********************");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("***********************");
		
		do {
			System.out.println("Vamos a hacer una mini-calculadora");
			System.out.println("----------------------------------");
			System.out.println(" 0 - Salir");
			System.out.printf(" 1 - %s\n", op1);
			System.out.printf(" 2 - %s\n", op2);
			System.out.printf(" 3 - %s\n", op3);
			System.out.printf(" 4 - %s\n", op4);
			System.out.printf(" 5 - %s\n", op5);
			System.out.println("---------------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			
			
			switch(opcion) {
			
				case 1: 
					System.out.println("¿Cúanto números quieres introducir?");
					tope=Leer.datoInt();
					for(int i=0; i<tope; i++) {
						
						System.out.println("Diga el " + (i+1) + "º número");
						num1=Leer.datoDouble();
						
						resultSum+=num1;	
					}
					
					System.out.printf("La suma total es: %.2f\n", resultSum);
					resultSum=cero;
					System.out.println("");
					break;
					
				case 2:
					System.out.println("¿Cúanto números quieres introducir?");
					tope=Leer.datoInt();
					for(int i=0; i<tope; i++) {
						
						
						System.out.println("Diga el " + (i+1) + "º número");
						num1=Leer.datoDouble();
						if(i==cero) {
							resultRest+=num1;
							
						}else {
							resultRest-=num1;
						}
							
					}
					
					System.out.printf("La resta total es: %.2f\n", resultRest);
					resultRest=cero;
					System.out.println("");
					break;
					
					
				case 3:
					System.out.println("¿Cúanto números quieres introducir?");
					tope=Leer.datoInt();
					for(int i=0; i<tope; i++) {
						
						
						System.out.println("Diga el " + (i+1) + "º número");
						num1=Leer.datoDouble();
						
						resultMul*=num1;
						
					}
					
					System.out.printf("El resultado de la multiplicación es: %.2f\n", resultMul);
						
					System.out.println("");	
					break;
					
				case 4:
					System.out.println("Indica el número que quieres dividir");
					num1=Leer.datoDouble();
					System.out.println("¿Entre cuánto quieres dividirlo?");
					num2=Leer.datoDouble();
				
					if(num2==cero) {
						
						System.out.println("No es posible dividir entre cero");
						
					}else {
						resultDiv=num1/num2;
						System.out.printf("El resultado de la división es: %.2f\n", resultDiv);	
					}
					
					System.out.println("");
					break;
					
				case 5: 
					System.out.println("Indique el número");
					num1=Leer.datoInt();
					
					resultPaIm=num1%dos;
					
					if (resultPaIm==cero) {
						
						System.out.println("El número es par ");
						
					}else {
						
						System.out.println("El número es impar");
					}
					
					System.out.println("");
					break;
					
				case 0: 
					System.out.println("Saliendo...");
					System.out.println("");
					break;
					
				default:
					System.out.println("Opción no válida");
					break;
						
					
			}
			
		}while(opcion!=cero);
		
		System.out.println("****************************");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("****************************");
		

	}

}
