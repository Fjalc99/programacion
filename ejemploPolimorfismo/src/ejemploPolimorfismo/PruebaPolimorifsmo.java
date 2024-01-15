package ejemploPolimorfismo;

public class PruebaPolimorifsmo {

	public static void main(String[] args) {

		// Prueba con objetos "sueltos"
		// Figura f1=new Figura (); No se puede crear porque Figura es abstracta

		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c = new Cuadrado("Cuadrado 1", "Negro", 2);
		Circulo cir = new Circulo("Circulo 1", "Azul", 1);
		Figura f1 = new Cuadrado("Figura 1 como cuadrado", "Rojo", 4);
		Figura f2 = new Circulo("Figura 1 como circulo", "Blanco", 3);

		System.out.printf("El área es %.2f", op.calcularElAreaDeUnaFigura(cir));
		System.out.printf("\nEl área es %.2f", op.calcularElAreaDeUnaFigura(c));
		System.out.printf("\nEl área es %.2f", op.calcularElAreaDeUnaFigura(f1));
		System.out.printf("\nEl área es %.2f\n", op.calcularElAreaDeUnaFigura(f2));

		
		//Métodos no rescritos
		
		 //Se puede usar porque es un metodo tipo figura que se comporta como cuadrado y 
		 //se puede llamar porque herereda los metodos
		c.metodoSoloDeFigura(); 
		cir.metodoSoloDeFigura();
		
		c.mostrarLados();
		cir.mostrarRadianes();
		f1.calcularArea();
		
		
	}

}
