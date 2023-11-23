package ejemploarrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tam, tam2 = 8, desde, hasta, pos, nuevoValor, total = 0, ceros = 0;
		Random r = new Random(System.nanoTime());
		//1.Declaración de arrays, varias formas
		
		//a) Dando valores inicialmente(inicializando)
		
		//Como no damos el tamaño, el tamaño es 
		//directamente el número de elementos que ponemos.
		int [] lista = {2,3,6};//Tamaño 3, ya se puede usar
		
		//b) Declarando e instanciado en diferentes lineas
		
		//Primero se declara
		int lista2 [];
		
		//Necesito el tamaño, lo pido
		System.out.println("Diga el tamaño:");
		tam = Leer.datoInt();
		
		//Instancio el array con ese tamaño
		lista2 = new int [tam];//El tamaño es el leido por teclado, ya se puede usar
		
		//c) Todo en la misma línea, debemos tener el tamaño antes
		int [] lista3 = new int [tam2];
		
		
		//2. Cargar, rellenar un array
		//Varias formas
		
		//a)Leyendo por teclado
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Leer.datoInt();
		}
		
		//b)Aleatoriamente
		System.out.println("Diga desde:");
		desde = Leer.datoInt();
		System.out.println("Diga hasta:");
		hasta = Leer.datoInt();
		for (int i = 0; i < lista.length; i++) {
			lista[i] = r.nextInt(hasta-desde+1)+desde;
		}
		
		//c)Cascaporra style
		int lista4 [] = {12, 3, 4, 6};
		
		
		//Mostrar el array
		for (int i = 0; i < lista4.length; i++) {
			System.out.println(" "+lista4[i]);
		}
		
		
		//Acceso y cambio de un elemento
		System.out.println("Seleccione la posición a mostrar:");
		pos = Leer.datoInt()-1;
		System.out.println("Elija nuevo valor:");
		nuevoValor = Leer.datoInt();
		
		lista4[pos] = nuevoValor;
		
		
		//Sumar todos los elementos
		for (int i = 0; i < lista4.length; i++) {
			total += lista4[i];
		}
		
		
		//Operaciones variadas
		for (int i = 0; i < lista4.length; i++) {
			if(lista4[i]%2==0) {
				lista4[i] = lista4[i]*2;
			}
		}
		
		
		//Contar ceros
		for (int i = 0; i < lista4.length; i++) {
			if(lista4[i]==0) {
				ceros ++;
			}
		}
		
	}

}
