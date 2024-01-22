package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero;
		
		
		Operaciones o = new Operaciones();
		
		System.out.println("Introduzca el número");
		numero=Leer.datoInt();
		
		o.mostraPar(numero);

		System.out.println("Introduzca el número");
		numero=Leer.datoInt();
		
		o.mostraNumNegativo(numero);
	
	
	
	
	
	
	}

}
