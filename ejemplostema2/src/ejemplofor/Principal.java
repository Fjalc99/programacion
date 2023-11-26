package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
	int tope=10;
	int num1;
	
	
	System.out.println("Que numero quieres");
	num1=Leer.datoInt();
	
		
	for (int i=0;i<=tope;i++) {
		
		System.out.println( i + "*" + num1 + "=" + i * num1);
		
		
		
		
			
		}

	}
}