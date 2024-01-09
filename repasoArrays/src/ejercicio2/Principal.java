package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 10;
		int dos = 2;
		/*
		 * Con numeros[i] estamos sacando el numero del indice y con la operacion que
		 * sea el doble de lo que vale el indice
		 */
		int numeros[] = new int [tam];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * dos;
			System.out.println(numeros[i]);
		}

	}

}
