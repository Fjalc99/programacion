package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*7. Mi coche nuevo consume un montón. Dicen las indicaciones técnicas que 7,5 litros a los 100 km pero
no me fío. Realizar un programa que nos ayude a calcular el dinero gastado en gasolina en un viaje.
Para ello, podemos inicializar una variable con los kilómetros recorridos y otra con el precio por litro
de gasolina. */

		double kmRecorridos=300.00, precGas=2.15, cien=100.00, consumoCoche=7.5, consumoFinal=0, precioFinal=0; 
		
		System.out.printf("Bienvenidos al programa para calcular el consumo de su coche");
		System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		
		consumoFinal= kmRecorridos * consumoCoche / cien;
		
		System.out.printf("El consumo final del coche es de %.2f l",consumoFinal);
		
		System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("Ahora vamos a calcular el dinero gastado para la gasolina");
		
		precioFinal= consumoFinal * precGas;
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.printf("El dinero gastado en gasolina es de %.2f €",precioFinal);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
