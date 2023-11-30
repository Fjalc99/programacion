package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
		pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
		(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
		PLANETA Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno
		EQUIVALENCIA 0.38 0.91 1.00 0.38 2.53 1.06 0.92 1.2 */
		
		String mercurio="Mercurio", marte="Marte",  saturno="Saturno", tierra="Tierra", venus="Venus", jupiter="Júpiter"
				,urano="Urano", neptuno="Neptuno";
		
		double equiMer=0.38, equiVenus=0.91, equiTierra=1.00, equiMarte=0.38, equiJup=2.53, equiSatu=1.06, equiUra=0.92
				, equiNep=1.2, pesoPerso=0.0, result=0.0;
		
		int opcion;
		
		
		System.out.println("----------------------");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("----------------------");

		System.out.println("Vamos a calcular el peso equivalente en los diferentes planetas");
		System.out.println("Indique su peso (Kg)");
		pesoPerso=Leer.datoDouble();
		
		System.out.println("--------------------------------------");
		System.out.printf("1 - %s - %.2f\n", mercurio, equiMer);
		System.out.printf("2 - %s - %.2f\n", marte, equiMarte);
		System.out.printf("3 - %s - %.2f\n", saturno, equiSatu);
		System.out.printf("4 - %s - %.2f\n", tierra, equiTierra);
		System.out.printf("5 - %s - %.2f\n", venus, equiVenus);
		System.out.printf("6 - %s - %.2f\n", jupiter, equiJup);
		System.out.printf("7 - %s - %.2f\n", urano, equiUra);
		System.out.printf("8 - %s - %.2f\n", neptuno, equiNep);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Indique la opción con la que quiere ver su peso");
		opcion=Leer.datoInt();

		switch (opcion) {
		
			case 1:
				result=equiMer * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n", mercurio, result);
				break;
				
			case 2: 
				result= equiMarte * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n ",marte, result);
				break;
				
			case 3:
				result=equiSatu * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n ", saturno, result);
				break;
				
			case 4: 
				result=equiTierra * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fKg\n", tierra, result);
				break;
				
			case 5:
				result=equiVenus * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n", venus, result);
				break;
				
			case 6: 
				result=equiJup * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n", jupiter, result);
				break;
				
				
			case 7: 
				result=equiUra * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n", urano, result);
				break;
				
			case 8: 
				result=equiNep * pesoPerso;
				System.out.printf("Su peso en %s es de: %.2fkg\n", neptuno, result);
				break;
				
			default:
				System.out.println("No ninguna opción con ese número");
				break;
		}
		
		System.out.println("-----------------------------");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("-----------------------------");
		
	
	}

}
