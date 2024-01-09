package calculadora;

/**
 * Clase que implementa una calculadora básica de numeros básica de números reales
 * 
 * @author alcantarilla.cafra24
 * 
 * 
 * */

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3, b=7;
		System.out.println(suma(a,b));
		
		System.out.println(multiplicar(a,b));
	}
	
	/**
	 * Este metodo suma dos numeros reales
	 * @param a
	 * @param b
	 * @return
	 * */
		
	
	public static double suma(double a, double b) {
		double result=0;
		result = a+b;
		return result;
		
	}

	/**
	 * Este metodo Multiplica dos numeros reales
	 * @since 1.0
	 * @see Libro gordo de Petete
	 * @see <a href= "https://google.es"> "Ver aqui" </a>
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return Multplica los dos numeros
	 * 
	 * */
	
	public static double multiplicar(double a, double b) {
		
		double result=0;
		result= a * b;
		return result;
		
	}
	
/**
 * 
 * @deprecated
 * @param a Primer operando
 * @param b Segundo operando
 * @return Suma los dos numeros
 * */
	
	public double sumar(double a, double b) {
		return a+b;
		
	}

}






