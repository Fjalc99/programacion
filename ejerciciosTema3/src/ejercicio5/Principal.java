package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String copiar;
		int numero = 0;
		Copiado cop;
		
		System.out.println("Diga su frase a copiar"); 
		copiar=Leer.dato();
		
		System.out.println("Indique el numero de veces");
		numero=Leer.datoInt();
		
		cop=new Copiado (copiar,numero);
		cop.mostrarFrase(copiar);
		
		System.out.println();
		

	}
}	
		