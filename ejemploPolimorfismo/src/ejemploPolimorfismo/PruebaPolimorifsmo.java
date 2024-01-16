package ejemploPolimorfismo;

public class PruebaPolimorifsmo {

	public static void main(String[] args) {

		// Prueba con objetos "sueltos"
		// Figura f1=new Figura (); No se puede crear porque Figura es abstracta

		
		int tam =4;
		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c = new Cuadrado("Cuadrado 1", "Negro", 2);
		Circulo cir = new Circulo("Circulo 1", "Azul", 1);
		Figura f1 = new Cuadrado("Figura 1 como cuadrado", "Rojo", 4);
		Figura f2 = new Circulo("Figura 1 como circulo", "Blanco", 3);
		
		//Lista de figuras 
		
		Figura [] lista = new Figura [tam];
		//Hacemos esto solo para el ejemplo
		
		lista[0]=c;
		lista[1]=cir;
		lista[2]=f1;
		lista[3]=f2;
		
		
		
		//Figura f4 = new Figura [tam];
		

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
		
		System.out.println(op.sumarAreas(lista));
	}

}
