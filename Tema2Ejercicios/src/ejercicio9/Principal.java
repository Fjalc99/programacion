package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*9. Calcular el precio por entrar en el cine, pidiendo el número de entradas y el precio. Pedir el
día de la semana y si es miércoles (día del espectador) se aplicará un descuento del 30 % al
total.
*/
		
		double precio = 0.00, descuento = 30.00, total = 0, cien = 100;
		int numEntradas;
		char dia;
		
		
		System.out.println("Introduzca el numero de entradas");
		numEntradas=Leer.datoInt();
		System.out.println("Introduzca el precio de las entradas");
		precio=Leer.datoDouble();
		System.out.println("Introduzca el dia que es");
		dia=Leer.datoChar();
		
		if (dia == 'X') {
			total = (numEntradas * precio) - ((numEntradas * precio)*descuento/cien);
			System.out.printf("El precio con el descuento aplicado para el miercoles es de %.2f",total);
			
			
		}else {
			total = precio * numEntradas;
			
			System.out.printf("El precio para entrar en el cine es de %.2f",total);
			
		}
	}
}
