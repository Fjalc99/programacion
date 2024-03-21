package ejercicio3;

public class CEcuacion2Grado {

	public double calcularEcuacion2Grado (double a, double b, double c) throws ComprobarDiscriminante {
		
		double discriminante = (Math.pow(b, 2) - (4 * a * c));
		
		if (discriminante < 0) {
			
			throw new ComprobarDiscriminante("El discriminante es  menor que cero");
		}
		
		if(a==0 && b==0) {
			throw new ComprobarAyB("La A y la B valen 0");
		}
		
		if(a == 0) {
			return -c/b;
		}
		
		
		double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
     
        
        return raiz1;
	}
	
	
}
