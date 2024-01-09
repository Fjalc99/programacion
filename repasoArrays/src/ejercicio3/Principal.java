package ejercicio3;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 8, contador = 0, cero = 0;
		double media = 0;

		int numeros[] = new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca el número");
			numeros[i] = Leer.datoInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];

			if (numeros[i] == cero) {
				contador++;
			}

		}
			media = media / tam;
			System.out.println("La media es de "+media);
			System.out.println("El número de ceros es de "+contador);
	}	

}
