package arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		int total = 0;
		int tam;
		int lista [];
		
		System.out.println("Introduzca el tamaño");
=======

		int tam, total = 0;
		int lista [];
		
		System.out.println("Diga su tamaño");
>>>>>>> 85d36bafa46f1fe195bd3d6a4ffef8f2dc0b614c
		tam=Leer.datoInt();
		
		lista = new int [tam];
		for (int i = 0; i < lista.length; i++) {
			lista[i]=Leer.datoInt();
			total += lista[i];
		}
		System.out.println("El total es "+total);
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Leer.datoInt();;
			total += lista [i];
		}
		System.out.println("El total es "+total);
	}

}
