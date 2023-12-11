package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
		16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
		deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
		que le corresponde.*/
		
		int horasTotal=0, opcion, cero=0, cuarenta=40;
		double precioHora=0.0, precioHoraExtr=0.0, sueldo=0.0;
		
		System.out.println(".......................");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println(".......................");
		
		do {
			
			System.out.println("Vamos a calcular el salario semanal de un trabajador");
			System.out.println("----------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Calcular precio semanal");
			System.out.println("----------------------------");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
				case 1: 
					System.out.println("¿Cuántas horas has trabajado?");
					horasTotal=Leer.datoInt();
					System.out.println("¿A cuánto se paga la hora?");
					precioHora=Leer.datoDouble();
					System.out.println("¿Y las horas extras?");
					precioHoraExtr=Leer.datoDouble();
					
					if(horasTotal>cuarenta){
						
						sueldo= cuarenta * precioHora;
						sueldo+= (horasTotal - cuarenta) * precioHoraExtr;		
						
					}else {
						
						sueldo= horasTotal * precioHora;
					
					}
					System.out.printf("El salario semanal es de:%.2f€\n", sueldo);
					System.out.println("");
					break;
					
				case 0:
					System.out.println("Saliendo...");
					System.out.println("");
					break;
					
					default:
						System.out.println("Opción no válida");
						System.out.println("");
						break;
	
			}
			
			
		}while(opcion!=cero);
		
		System.out.println("............................");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("............................");
	

	}

}
