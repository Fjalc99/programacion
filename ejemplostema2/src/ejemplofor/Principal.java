package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
	int tope=0;
	String palabra;
	
	
	System.out.println("Que palabra quieres");
	palabra=Leer.dato();
	System.out.println("Cual es tu tope"); 
	tope=Leer.datoInt();
		
	for (int i=0;i<tope;i++) {
		
		System.out.println(palabra);
		
		
			
		}

	}
}