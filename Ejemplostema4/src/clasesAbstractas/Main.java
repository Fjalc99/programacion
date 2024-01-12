package clasesAbstractas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cuadrado c = new Cuadrado (1,2,3); Se puede
		
		//Figura f = new Figura (1,3); No se puede 
		
		Figura cuadrado = new Cuadrado (1,2,2); //No da error
		
		//Rectangulo r = new Rectangulo (2,6,6,2); Se puede 
		
		System.out.println(cuadrado.calcularArea());
	}

}
