package ejemploarrays;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam;
		int tam2=8, desde, hasta, elemento, nuevoValor, total = 0, cero = 0;
		Random num  = new Random(System.nanoTime());
		
		//1.Declaracion de arrays, varias formas
		
		//a) Dando valores inicialmente, inicializando
		//Como no damos el tamaño, el tamaño es directamente
		// El numero de elementos que ponemos
		int []lista= {2,3,6}; //Tamaño?3 Ya se puede usar
		
		//b) declarando e instanciando en diferentes lineas
		
		// Primero se declara, siempre primero
		
		int lista2[];
		//todavia no se puede usar
		//necesito el tamaño, lo pido, 
		//tengo que declarar una variable al comienzo para guardarlo
		
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();
		//Instanciando con ese tamaño
		
		lista2=new int [tam]; //El tamaño es el leido, ya que se puede usar
		
		//c) Todo en la misma linea, debemos tener el tamaño antes
		
		int [] lista3=new int [tam2];
		
		
		//El mejor el segundo, aunque puede que nos encontremos el primero
		
		//2. Cargar, rellenar array
		// Varias formas
		//Para recorrer una array siempre hace falta un bucle y vamos a usar el for
		// a) Leyendo por teclado
		System.out.println("introduzca los números para rellenar");
		for (int i = 0; i < lista2.length; i++) {
			lista2[i]=Leer.datoInt();
			
		}
		
		
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(" "+lista2[i]);
		}
		
		// b) Aleatoriamente, necesitamos hasta y desde declarados al principio
		System.out.println("Diga desde");
		desde=Leer.datoInt();
		System.out.println("Diga hasta");
		hasta=Leer.datoInt();
		
		
		for (int i = 0; i < lista2.length; i++) {
			lista2[i]= num.nextInt(hasta-desde+1)+desde;
		}
		
		// c) Cascaporra style
		
		int lista4[] = {12,8,6,9};
		
	
		//3. mostrar Array
		
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(" "+lista2[i]);
		}
		
		//4. Acceso a un elemento
		
		System.out.println("Indique el elemento qué desea cambiar:");
		elemento=Leer.datoInt()-1;
		System.out.println("Indique el nuevo valor:");
		nuevoValor=Leer.datoInt();
		
		lista2[elemento] = nuevoValor;
		
		
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(" "+lista2[i]);
		}
		
		//5. sumamos los elementos
		
		for (int i = 0; i < lista2.length; i++) {
			total += lista2[i];
		}
		
		
		
		//Operaciones variadas 
		
		
		for (int i = 0; i < lista4.length; i++) {
			if (lista4[i]%2==0) {
				lista4[i]=lista4[i]*2;
			}
		}
		
		//Contar los numero cero
		
		for (int i = 0; i < lista4.length; i++) {
			if (lista4[i]==0) {
				cero ++;
			}
		}
		
	 }

	}


