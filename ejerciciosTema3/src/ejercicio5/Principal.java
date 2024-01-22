package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String copiar;
		int numero;
		Copiado cop = new Copiado();
		
		System.out.println("Diga su frase a copiar"); 
		copiar=Leer.dato();
		
		System.out.println("Indique el numero de veces");
		numero=Leer.datoInt();
		
		cop.repetirFrase(copiar, numero);
		
		
		
		
		

	}
}	
		