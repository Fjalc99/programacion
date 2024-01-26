package ejercicio7;

import java.util.Random;

public class CaraCruz {

	public int generarCaraCruz(int desde, int hasta) {
		int num=0;
		Random r =new Random (System.nanoTime());
		num=r.nextInt(hasta - desde +1)+desde;
		
		return num;
	}
	
	public void mostrarNum (int desde, int hasta) {
		
		System.out.println("El numero es "+generarCaraCruz(desde, hasta));
	}
	
	
}
