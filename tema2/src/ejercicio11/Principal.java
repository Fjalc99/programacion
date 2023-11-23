package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*11. Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
PLANETA      Mercurio Venus Tierra  Marte  Júpiter  Saturno  Urano   Neptuno
EQUIVALENCIA  0.38    0.91   1.00   0.38     2.53    1.06     0.92    1.2 */
		
		int planeta;
		double pesoPlaneta,pesoPersona;
		double mer=0.38, ven=0.91, ti=1.00, mar=0.38, jup=2.53, sat=1.06, ura=0.92, nep=1.2;
		
		System.out.println("Bienvenido al programa vamos a calcuar su peso en diferentes planetas");
		System.out.println("Indique su peso ");
		System.out.println("Pulse 1 si quieres saber su peso en Mercurio");
		System.out.println("Pulse 2 si quieres saber su peso en Venus");
		System.out.println("Pulse 3 si quieres saber su peso en la Tierra");
		System.out.println("Pulse 4 si quieres saber su peso en Marte");
		System.out.println("Pulse 5 si quieres saber su peso en Júpiter");
		System.out.println("Pulse 6 si quieres saber su peso en Saturno");
		System.out.println("Pulse 7 si quieres saber su peso en Urano");
		System.out.println("Pulse 8 si quieres saber su peso en Neptuno");
		planeta=Leer.datoInt();
		
		switch (planeta) { 
		
		 	case 1: 
		 	System.out.println("Has seleccionado saber su peso en Mercurio, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*mer;
		 	System.out.println("Su peso en mercurio es de "+pesoPlaneta+"kg");
		 	break;
		 	
		 	case 2:
		 	System.out.println("Has seleccionado saber su peso en Venus, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*ven;
		 	System.out.println("Su peso en venus es de "+pesoPlaneta+"kg");
		 	break;
		
		 	case 3:
		 	System.out.println("Has seleccionado saber su peso en la Tierra, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*ti;
		 	System.out.println("Su peso en la tiera es de "+pesoPlaneta+"kg");
		 	break;
		 	
		 	case 4:
		 	System.out.println("Has seleccionado saber su peso en Marte, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*mar;
		 	System.out.println("Su peso en Marte es de "+pesoPlaneta+"kg");
		 	break;
		 	
		 	case 5:
		 	System.out.println("Has seleccionado su peso en Júpiter, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*jup;
		 	System.out.println("Su peso en Júpiter es de  "+pesoPlaneta+"kg");
		 	break;
		 	
		 	case 6:
		 	System.out.println("Has seleccionado su peso en Saturno, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*sat;
		 	System.out.println("Su peso en Saturno es de "+pesoPlaneta+"kg");
		 	break;
		 	
		 	case 7:
		 	System.out.println("Has seleccionado su peso en Urano, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*ura;
		 	System.out.println("Su peso en Urano es de "+pesoPlaneta+"kg");
		 	break;
		 	
		 	case 8:
		 	System.out.println("Has seleccionado su peso en Neptuno, introduzca su peso");
		 	pesoPersona=Leer.datoDouble();
		 	pesoPlaneta=pesoPersona*nep;
		 	System.out.println("Su peso en Neptuno es de "+pesoPlaneta+"kg");
		 	break;
		 	
		 	default:
		 	System.out.println("Opción no valida :(");
	
		
	    }	
			System.out.println("Gracias por usar el progama :)");
	}
}
