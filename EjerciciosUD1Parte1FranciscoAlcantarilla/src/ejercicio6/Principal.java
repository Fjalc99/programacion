package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*6. Realizar un programa que escriba el precio de un producto en una compra, una vez descontado el tanto
por ciento de descuento, dando nosotros en la declaración de las variables el precio inicial de un
producto y el tanto por ciento que se va a descontar. Ojo, el cálculo el cálculo del tanto por ciento lo debe hacer
el programa no el usuario, por ejemplo, se debe usar 20 y no 0.2. */		
		
		double preProduct=899.00, descuento=20 , cien=100, precioDescuento=0, precioFinal=0;
		
		System.out.println("Bienvenidos al programa para realizar el descuento de los prodcutos");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		
		precioDescuento= (preProduct * descuento) / cien; 
		
		precioFinal= preProduct - precioDescuento;
		
		System.out.printf("El precio final del producto con el descuento aplicado es de %.2f €",precioFinal);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
