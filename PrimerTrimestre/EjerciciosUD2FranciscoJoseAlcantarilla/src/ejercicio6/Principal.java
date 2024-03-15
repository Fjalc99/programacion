package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*6. Crear un programa que reciba por teclado 3 notas, calcule la media y diga si la media sale
aprobada o no.*/
		
		double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, media = 0.0, tres = 3.0, cinco = 5.00;
		
		System.out.println("Bienvenidos al programa para calcular su media de notas");
		System.out.println("#######################################################");
		
		System.out.println("Introduzca su primera nota");
		nota1=Leer.datoDouble();
		System.out.println("#######################################################");
		
		System.out.println("Introduzca su segunda nota");
		nota2=Leer.datoDouble();
		System.out.println("#######################################################");
		
		System.out.println("Introduzca su tercera nota");
		nota3=Leer.datoDouble();
		System.out.println("#######################################################");
		
		System.out.println("Ahora vamos a calcular la media de sus notas");
		System.out.println("#######################################################");
		
		media = (nota1 + nota2 + nota3) / tres ;
		
		System.out.printf("Su nota media es de %.2f\n", media);
		System.out.println("#######################################################");
		
		if(media >= cinco) {
			System.out.println("La media le sale aprobada");
			
		}else{
			System.out.println("La media le sale suspensa");
		}
		
		
	}

}
