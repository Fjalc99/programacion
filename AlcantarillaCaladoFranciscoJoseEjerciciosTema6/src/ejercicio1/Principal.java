package ejercicio1;







import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, num2, raizCuadrada, opcion;
		double resultado;

		

		try {
			
			do {
				
				System.out.println("-------------------------------------------");
				System.out.println("Bienvenido al programa");
				System.out.println("-------------------------------------------");
				System.out.println("Introduzca el primer número");
				num = Leer.datoInt();
				System.out.println("Introduzca el segundo número");
				num2 = Leer.datoInt();
				
				System.out.println("Introduzca número para calcular la raíz cuadrada");
				raizCuadrada=Leer.datoInt();

				System.out.println("-------------------------------------------");
				System.out.println("Pulse 0 para salir");
				System.out.println("Pulse 1 para sumar");
				System.out.println("Pulse 2 para restar");
				System.out.println("Pulse 3 para multiplicar");
				System.out.println("Pulse 4 para dividir");
				System.out.println("Pulse 5 para ráiz cuadrada");
				System.out.println("-------------------------------------------");
				opcion = Leer.datoInt();

				switch (opcion) {

				case 0:
					System.out.println("Saliendo del programa");
					break;

				case 1:
					resultado = num + num2;

					System.out.printf("La resultado es: %.2f \n", resultado);

					break;

				case 2:
					resultado = num - num2;

					System.out.printf("La resultado es: %.2f\n", resultado);

					break;

				case 3:
					resultado = num * num2;

					System.out.printf("La resultado es: %.2f\n", resultado);

					break;

				case 4:
					resultado = num / num2;

					System.out.printf("La resultado es: %.2\nf", resultado);

					break;

				case 5:
					

					System.out.printf("La resultado es: %.2f\n", Math.sqrt(raizCuadrada));

					break;

				}

			} while (opcion != 0);

	} catch (NumberFormatException e) {

			System.out.println("Has introducido una letra");
		
		}catch(ArithmeticException e) {
			
			System.out.println("Estas dividiendo por cero");
		}
		
		

	}
}
