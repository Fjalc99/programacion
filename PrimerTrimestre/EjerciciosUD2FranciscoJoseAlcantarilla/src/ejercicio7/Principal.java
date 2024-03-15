package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*7. Calcular el precio final de una compra de un solo producto, pidiendo por teclado el precio
del producto, la cantidad que se lleva y el porcentaje de descuento que se le aplica, pero solo
si el total es mayor de 100 €. Si no es superior, se mostrará el mensaje "No hay descuento".*/
		
		double precProduc = 0.0, cant = 0.0, precFinal = 0.0, desc = 0.0, cien = 100.00, precTotal = 0.0 ;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("#########################################################");
		
		System.out.println("Introduzca el precio del producto");
		precProduc=Leer.datoDouble();
		System.out.println("#########################################################");
		
		System.out.println("Introduzca la cantidad del producto que deseas comprar");
		cant=Leer.datoDouble();
		System.out.println("#########################################################");
		
		precFinal = precProduc * cant;
		
		System.out.printf("El precio final es de %.2f\n",precFinal);
		System.out.println("#########################################################");
		
		if(precFinal > cien) {
			System.out.println("Como supera los 100 euros vamos aplicarle un descuento");
			System.out.println("#########################################################");
			System.out.println("Introduzca el descuento");
			desc=Leer.datoDouble();
			precTotal = precFinal -(precFinal*desc)/cien;
			System.out.printf("El precio con el descuento aplicado es de %.2f", precTotal);
			
		}else {
			System.out.println("No se le puede aplicar el descuento");
		}
		
		
		
		
		
		
	}

}
