package ejemplosdowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0, tope=0, uno=1;
		System.out.println("Hola Bienvenido al programa, imprimimos números por teclado");
		
		
		System.out.println("Diga su tope");
		tope=Leer.datoInt();
		
		do {
			
			System.out.println((num+uno));
			num++;
			
		}while(num<tope);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
