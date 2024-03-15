package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Calcular el precio por entrar en el cine, pidiendo el número de entradas y el precio. Pedir el
		día de la semana y si es miércoles (día del espectador) se aplicará un descuento del 30 % al
		total.*/


		int cantidad=0, miercoles=3, diaSemana=0;
		double cien=100.0, precioEntrada=0.0, precioNormal=0.0, precioConDesct=0.0, descuento=30.0, result=0.0;
		
		System.out.println("-----------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-----------------------");
		System.out.println("Vamos a calcular el precio para entrar al cine");
		
		System.out.println("¿En que día estamos?, sabiendo que el 1 es Lunes"
				+ "y el 7 Domingo");
		diaSemana=Leer.datoInt();
		
		System.out.println("Indique el precio de las entradas");
		precioEntrada=Leer.datoDouble();
		
		System.out.println("¿Cuántas entradas desea?");
		cantidad=Leer.datoInt();
		
		precioNormal= precioEntrada * cantidad;
		
		if(diaSemana==miercoles) {
			
			result=precioNormal * descuento / cien;
			precioConDesct= precioNormal - result;
			
			System.out.printf("El precio de las entradas con el descuento es: %.2f€\n", precioConDesct);
			
			
		}else {
			
			System.out.printf("El precio de las entradas es: %.2f€\n", precioNormal);
			
		}
		
		System.out.println("----------------------------");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("----------------------------");
		
		
	}

}
