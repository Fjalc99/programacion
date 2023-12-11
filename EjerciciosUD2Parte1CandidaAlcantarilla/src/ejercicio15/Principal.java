package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se
		necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final,
		la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es
		necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos. */
		
		int tope=0, cinco=5, opcion, cero=0,  nSupen=0;
		double notaMedia=0, result=0, nota; 
		
		System.out.println("----------------------");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("----------------------");
		
		 do {
			System.out.println("Vamos a calcular la nota media y ver cuánto ha supendido");
			System.out.println("--------------------------------------------------------");
			System.out.println(" 0 - Salir");
			System.out.println(" 1 - Obtener media");
			System.out.println("------------------");
			System.out.println("Indique que desea hacer");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1: 
					System.out.println("");
					System.out.println("Indique cuántas asignaturas tiene");
					tope=Leer.datoInt();
					System.out.println("");
					
					for (int i=0; i<tope; i++) {
						
						System.out.println("Diga " + (i+1) + "º nota");
						nota=Leer.datoDouble();
						
						result+=nota;
						
						if(nota<cinco) {
						
							nSupen++;
						
						}	
						
					}
					
					notaMedia= result / tope;
					System.out.printf("La nota media es: %.2f\n", notaMedia );
					
					System.out.printf("Ha suspendido: %d\n", nSupen);
					nSupen=cero;
					
					break;
					
				case 0:
					System.out.println("Saliendo...");
					break;
					
				default:
					System.out.println("Opción no válida");
					break;
			}
			
			System.out.println("");
			
			
			
		}while(opcion!=cero);
		
		
		System.out.println("----------------------------");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("----------------------------");
	
	}

}
