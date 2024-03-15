package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2. En tiempos de sequía hay que cuidar el agua de las piscinas y muchas engañan según su forma.
Calcula y muestra en pantalla el volumen de dos piscinas:
- Piscina olímpica (50 m de largo por 21 de ancho) y 2,50 de profundidad.
- Piscina circular de 1,80 de profundidad y 12 metros de radio.
¿Cuánto costará llenar cada una si el metro cúbico cuesta 1,80 €? */
		
		double largPisOlim=50.00, anchPisOlim=21.00, profunPisOlim=2.50,volumPisOlim=0, precM3=1.80, totPrePisOlim=0;
		double profunPisCir=1.80, radioPisCir=12.00, volumPisCir=0, dos=2.00, totPrePisCir=0;
		
		System.out.println("Bienvenidos vamos al programa para calcular el volumen de psicinas");
		System.out.println("//////////////////////////////////////////////////////////////////");
		System.out.println("Vamos a calcular el volumen de la piscina olímpica");
		
		volumPisOlim= largPisOlim * anchPisOlim * profunPisOlim;
		System.out.printf("El volumen de la piscina es de %.2f m^3 \n",volumPisOlim);
		System.out.println("//////////////////////////////////////////////////////////////////");
		System.out.println("Ahora vamos a calcular cuanto nos cuesta llenar la piscina olímpica");
		totPrePisOlim= volumPisOlim * precM3;
		System.out.printf("El precio de llenar la piscina es de %.2f €  ",totPrePisOlim);
		
		System.out.println("\n//////////////////////////////////////////////////////////////////");
		System.out.println("Ahora vamos a calcular el volumen de la piscina Circular");
		
		volumPisCir= Math.PI* Math.pow(radioPisCir, dos) * profunPisCir;
		
		System.out.printf("El volumen de la piscina circular es de %.2f m^3 \n",volumPisCir);
		System.out.println("//////////////////////////////////////////////////////////////////");
		
		System.out.println("Ahora vamos a calcular el precio que nos cuesta llenar la piscina circular");
		totPrePisCir= volumPisCir * precM3;
		System.out.printf("El precio de llenar la piscina circular es de %.2f €",totPrePisCir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
