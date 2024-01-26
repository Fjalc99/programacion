package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int desdeP = 1;
		int hastaP = 3;
		int opcion = 0, primitiva = 8;
		Generadora gen1 = new Generadora();

		System.out.println("Bienvenidos al programa");
		System.out.println("pulse 1 para la primitiva");
		opcion = Leer.datoInt();

		do {
			switch (opcion) {

			case 1:
				if (gen1.generarPrimitiva(desdeP, hastaP) < primitiva) {

					for (int i = 0; i < primitiva; i++) {

						gen1.generarNum(desdeP, hastaP);
					}
				}
				gen1.mostrarPrimitiva(desdeP, hastaP);
			}

		} while (opcion != 0);

	}

}
