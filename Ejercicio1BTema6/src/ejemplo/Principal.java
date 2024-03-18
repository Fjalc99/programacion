package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, den;
		boolean salida =false;
		Calculadora c =  new Calculadora ();
		
		
		try {
			
			do {
				
				System.out.println("Diga el numero");
				num=Leer.datoInt();
				
				System.out.println("Diga el denominador");
				den=Leer.datoInt();
				
				

				System.out.println(c.dividir(num, den));
				salida=true;
				
			//	System.out.println(c.raizCuadrada(-2));
				
				
				
				
				
			} while (!salida);
			
			
		}catch(ArithmeticException e) {
			System.out.println("El denominador no puede ser cero");
		}
		
		
	}

}
