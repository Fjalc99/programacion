package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Calcular el precio final de una compra de un solo producto, pidiendo por teclado el precio
		del producto, la cantidad que se lleva y el porcentaje de descuento que se le aplica, pero solo
		si el total es mayor de 100 €. Si no es superior, se mostrará el mensaje "No hay descuento". */
		
		double product1=0.0, porcentaje=0.0, result=0.0, precioDescu=0.0, cien=100.0, precioFinal=0.0 ;
		int cantidad=0 ;
		
		System.out.println("***********************");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("***********************");
		
		System.out.println("Vamos a calcular el precio de un producto");
		System.out.println("Indique el precio del producto");
		product1=Leer.datoDouble();
		
		System.out.println("¿Cuántas se lleva?");
		cantidad=Leer.datoInt();
		
		System.out.println("¿Qué porcentaje se le aplica?");
		porcentaje=Leer.datoDouble();
		
		result= product1 * cantidad;
		
		if(result>cien) {
			
			precioDescu= porcentaje * result / cien;
			
			precioFinal=result-precioDescu;
			
			System.out.printf("La compra es de: %.2f€", precioFinal);
	
		}else {
			
			System.out.println("No hay descuento");
		}
		
		System.out.println("");
		
		System.out.println("****************************");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("****************************");
		
		

	}

}
