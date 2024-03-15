package ejercicio15;

import utilidades.Leer;

public class Principal {
	
	public static void main(String[] args) {
	
	/*Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se
necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final,
la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es
necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.*/
	
	
	int  opcion=0, numeroAsignaturas = 6, cinco = 5, contador = 0 ;
	double nota, media = 0.00;
	
		
		
	
		do {
			
			System.out.println("Bienvenidos al programa");
			System.out.println("Pulse 1 para ver su nota media y el numero de suspensos");
			System.out.println("Pulse 0 para salir");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
			case 1:
				for (int i = 0; i < numeroAsignaturas; i++) {
					System.out.println("Introduzca sus notas");
					nota=Leer.datoDouble();
					media = nota + media;
					if (nota < cinco) {
						contador++;
					}
				
				
				}
				media = media / numeroAsignaturas;
				System.out.println("La nota media es de "+media);
				System.out.println("El numero de suspensos es de "+contador);
				
			}
						
		}while(opcion !=0);
	
}
}