package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dinRet, dinIng, saldo;
		int opcion;
		
		CuentaCorriente c = new CuentaCorriente (saldo);
		
		
		do {
			System.out.println("Pulse 1 para ingresar dinero");
			
			opcion=Leer.datoInt();
			
			switch(opcion) {
				
			case 1:
				
				System.out.println("Introduce el dinero que desea ingresar");
				dinIng=Leer.datoDouble();
				
				
			
				
			
			}
			
			
			
		}while(opcion != 0);
		
		
		
		
		
		
		
	}

}
