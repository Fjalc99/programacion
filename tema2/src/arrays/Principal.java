package arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, total = 0;
		int lista [];
		
		System.out.println("Diga su tamaño");
		tam=Leer.datoInt();
		
		lista = new int [tam];
		for (int i = 0; i < lista.length; i++) {
			lista[i]=Leer.datoInt();
			total += lista[i];
		}
		System.out.println("El total es "+total);
		
	}

}
