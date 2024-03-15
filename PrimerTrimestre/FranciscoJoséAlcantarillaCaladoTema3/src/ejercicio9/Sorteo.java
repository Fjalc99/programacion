package ejercicio9;

import java.util.Random;

public class Sorteo {

	public int numeroMaquina(int desde, int hasta) {

		int num = 0;
		Random r = new Random(System.nanoTime());

		num = r.nextInt(hasta - desde + 1) + desde;

		return num;
	}

	public int numSorteo(int desde, int hasta) {

		return numeroMaquina(desde, hasta);
	}

	public boolean comprobarNumero(int hasta, int desde) {

		
		if (numSorteo(desde, hasta) == numeroMaquina(desde, hasta)) {

		
			return true;

		} else {
			return false;

		}
	}

	public void mostrarGanador(int hasta, int desde) {

		if (comprobarNumero(hasta, desde)) {

			System.out.println("¡¡¡Has ganado la loteria felicidades!!!");
		} else {

			System.out.println("Has perdido suerte para la próxima vez");
		}

	}

}
