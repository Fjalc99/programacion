package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 /* 10. Escribir un programa que sirva para calcular el precio final de un producto. El cliente se lleva 4
unidades de un producto que cuesta 12,99 € y se le aplica un descuento del 3 % al precio total.*/
		
		double cantProd = 4.00, precProd = 12.99, desc = 3.00, precDesc = 0.0,  precTotalProd = 0, cien=100.00, precFinal = 0.0;
		
		System.out.println("Bienvendidos al programa vamos a realizar una compra con descuento");
		System.out.println("#####################################################################");
		
		precTotalProd= cantProd * precProd;
		
		System.out.printf("El precio total del producto sin el descuento aplicado es de %.2f €",precTotalProd);
		System.out.println("\n#####################################################################");
		System.out.println("Ahora vamos aplicarle el descuento al producto");
		
		precDesc= precTotalProd * desc / cien;
		System.out.print("#####################################################################"+precDesc+"€");
		System.out.printf("El descuento aplicado es de %.2f € y ahora vamos a ver cual es totla del producto \n",precDesc);
		
		precFinal= precTotalProd - precDesc;
		System.out.println("#####################################################################");
		System.out.printf("El precio final del producto con el descuento aplicado es de %.2f €", precFinal);
		
	}

}
