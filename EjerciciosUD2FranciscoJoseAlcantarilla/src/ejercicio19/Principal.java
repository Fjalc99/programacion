package ejercicio19;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*19. Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).*/
	int opcion, cero = 0, dos = 2, tope;
	double num1 , num2 ,  resultSum = 0, resultRest = 0, resultMulti = 0, resultDiv;
	
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
					System.out.println("Introduzca cuantos numeros deseas sumar");
					tope=Leer.datoInt(); 
					
					for (int i = 0; i < tope; i++) {
						
						System.out.println("Diga el " + (i+1) + "º número" );
						num1=Leer.datoDouble();
						
						resultSum += num1;
						
					}
					System.out.println("La suma total es "+resultSum);
					resultSum=cero;
					System.out.println("");
					break;
					
				case 2: 
					System.out.println("Introduzca cuantos numeros deseas sumar");
					tope=Leer.datoInt(); 
					
					for (int i = 0; i < tope; i++) {
						
						System.out.println("Diga el  " + (i+1) + "º número" );
						num1=Leer.datoDouble();
						
						if(i==cero) {
							resultRest+=num1;
							
						}else {
							resultRest-=num1;
						}
					}
					
					System.out.println("El resultado de la resta es de "+resultRest);
					resultRest -= cero;
					System.out.println("");
					break;
					
				case 3:
					System.out.println("Introduzca cuantos numeros deseas sumar");
					tope=Leer.datoInt(); 
					
					for (int i = 0; i < tope; i++) {
						
						System.out.println("Diga el  " + (i+1) + "º número" );
						num1=Leer.datoDouble();
						
						resultMulti *= num1;
						
					}
					
					System.out.println("El resultado de la multiplicacion es de "+resultMulti);
					System.out.println("");
					break;
					
				case 4:
					System.out.println("Introduzca el número que quires dividir");
					num1=Leer.datoDouble();
					System.out.println("Introduzca entre cuanto lo quires dividir");
					num2=Leer.datoDouble();
					
					
					if(num2 == cero) {
						System.out.println("No se puede dividir");
					}else {
						
						resultDiv = num1 / num2;
						System.out.println("El resultado de la división "+resultDiv);
					}
					System.out.println("");
					break;
					
				case 5:
					System.out.println("Introduzca el número");
					num1=Leer.datoDouble();
					if(num1 % dos == 0) {
						System.out.println("El número es par");
					}else {
						System.out.println("El número es impar");
					}
					break;
					
				case 0: 
					System.out.println("Saliendo del programa");
					break;
					
				default:
					System.out.println("Opcion no valida");
				    break;
			}
		
		}while(opcion !=0);
		
	
		
	}
		
}
