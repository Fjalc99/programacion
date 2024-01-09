package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fijo=1000;
		
		Trabajador t = new Trabajador ("Ángel", "programador Junior", "1A");
		Empleado e = new Empleado ("Luismi", "jefe","2B", 2000.0, 15.0);
		Consultor c=new Consultor ("Miguel", "Experto", "4d", 20.0, 18.0);
		
		//Empleado e2=new Empleado ("3C",1500.0, 12.5);
		
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga());
		
		System.out.println("************************");
		
		System.out.println(t.calcularPagaV2(fijo));
		System.out.println(e.calcularPagaV2(fijo));
		System.out.println(c.calcularPagaV2(fijo));
		
		System.out.println("************************");
	}

}
