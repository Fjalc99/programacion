package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		/* Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y
		mostrarlo por la pantalla mediante un bucle for. */

	
		String nombres []= {"María", "Sergio", "Sebastian", "Lucas", "Marta"};
		
		
		
		System.out.println("------------------------------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA DE MOSTRAR NOMBRES");
		System.out.println("------------------------------------------");
		
		
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println("El " + (i+1) + "º nombre es " + nombres[i]);
			
		}
		
		System.out.println("----------------------------");
		System.out.println("GARCIAS POR USAR EL PROGRAMA");
		System.out.println("----------------------------");
		
		
	}

}
