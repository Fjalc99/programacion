package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Implementar un programa que calcule el índice de masa corporal (IMC) de una persona y diga
		en qué estado se encuentra dependiendo del resultado, según la tabla. El IMC se calcula
		dividiendo el peso de una persona en kg entre la altura en metros al cuadrado, es decir:*/

		
		double peso=0.0, altura=0.0, dos=2.0;
		int result=0;
		
		
		System.out.println("************************");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("************************");
		System.out.println("Vamos a calcular el IMC de una persona");
		System.out.println("Indique su peso (en kg)");
		peso=Leer.datoDouble();
		System.out.println("Indique su altura (en metros)");
		altura=Leer.datoDouble();
		 
		result=(int)(peso / Math.pow (altura, dos));
		
		switch (result) {
		
		case 15:
			System.out.println("Su IMC es:"+ result + " --> Criterio de ingreso en hospital");
			break;
		
		case 16:
			System.out.println("Su IMC es:"+ result + " --> Infrapeso");
			break;
			
		case 17:
			System.out.println("Su IMC es:"+ result + " --> Infrapeso");
			break;
			
		case 18:
			System.out.println("Su IMC es:"+ result + " --> Bajo peso");
			break;
			
		case 19:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
			
		case 20:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
			
		case 21:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
			
		case 22:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
			
		case 23:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
			
		case 24:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
		
		case 25:
			System.out.println("Su IMC es:"+ result + " --> Peso normal (saludable)");
			break;
			
		case 26:
			System.out.println("Su IMC es:"+ result + "  --> Sobrepeso (obesidad de grado I)");
			break;
			
		case 27:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso (obesidad de grado I)");
			break;	
			
		case 28:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso (obesidad de grado I)");
			break;
			
		case 29:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso (obesidad de grado I)");
			break;
			
		case 30:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso (obesidad de grado I)");
			break;
			
		case 31:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso crónico (obesidad de grado II)");
			break;
			
		case 32:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso crónico (obesidad de grado II)");
			break;
			
		case 33:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso crónico (obesidad de grado II)");
			break;
			
		case 34:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso crónico (obesidad de grado II)");
			break;
			
		case 35:
			System.out.println("Su IMC es:"+ result + " --> Sobrepeso crónico (obesidad de grado II)");
			break;
			
		case 36:
			System.out.println("Su IMC es:"+ result + " --> Obesidad premórbida (obesidad de grado III)");
			break;
			
		case 37:
			System.out.println("Su IMC es:"+ result + " --> Obesidad premórbida (obesidad de grado III)");
			break;
			
		case 38:
			System.out.println("Su IMC es:"+ result + " --> Obesidad premórbida (obesidad de grado III)");
			break;
			
		case 39:
			System.out.println("Su IMC es:"+ result + " --> Obesidad premórbida (obesidad de grado III)");
			break;
			
		case 40:
			System.out.println("Su IMC es:"+ result + " --> Obesidad premórbida (obesidad de grado III)");
			break;	
			
		default:
			System.out.println("No hay ningun caso");
			break;
				
	}

		System.out.println("****************************");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("****************************");
		
	}
}
