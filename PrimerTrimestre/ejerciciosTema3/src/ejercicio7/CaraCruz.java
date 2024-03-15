package ejercicio7;

import java.util.Random;

public class CaraCruz {

	public int generarCaraCruz(int desde, int hasta) {
		int num=0;
		Random r =new Random (System.nanoTime());
		num=r.nextInt(hasta - desde +1)+desde;
		
		return num;
	}
	
	public boolean comprobarCara  (int cara) {
		if(cara == 1)
			return true;
		else 
			return false;
	}
	
	public void imprimirResultado (int cara) {
		
		if(comprobarCara(cara)) 
			System.out.println("Ha salido cara");
		else
			System.out.println("Ha salido cruz");
	}
	
	
	
}
