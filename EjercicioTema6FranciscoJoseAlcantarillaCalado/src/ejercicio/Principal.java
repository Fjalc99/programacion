package ejercicio;

import utilidades.Leer;

public class Principal{

	public static void main(String[] args) throws ComprobarMaximoSaldo, ComprobarSaldoMinimo {
		// TODO Auto-generated method stub

		
		double retirar, depositar;
		String pin;
		int opcion = 0;
		Tarjeta t = new Tarjeta ("124F",2000.0);
		
		
		
		do {
			
			try {
				
				System.out.println("Bienvenido al programa");
				System.out.println("Pulse 0 para salir del programa");
				System.out.println("Pulse 1 para retirar dínero");
				System.out.println("Pulse 2 para depositar dínero");
				opcion=Leer.datoInt();
				
				
				switch(opcion) {
				
					case 1:
					
						System.out.println("Introduzca la cantidad que desea retirar");
						retirar=Leer.datoDouble();
						
						System.out.println(t.comprobarSaldo(retirar));
						
						break;
				
				
					case 2: 
						
						System.out.println("Introduzca la cantidad a depositar");
						depositar=Leer.datoDouble();
						
						System.out.println(t.comprobarSaldoMin(depositar));
						break;
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			} catch (ComprobarMaximoSaldo e) {
				// TODO: handle exception
				e.getMessage();
			}catch(ComprobarSaldoMinimo e) {
				e.getMessage();
			}
			
			
			
			
			
			
		} while (opcion!=0);
		
		
		
		
		
		
	}

}
