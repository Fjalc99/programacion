package ejercicio4;

public class SumaVariables {

	public int suma (int a, int b) throws totalMayor10 {
		
		
		if(a + b > 10) {
			 throw new totalMayor10 ("El numero es mayor de 10");
		}else {
			return a + b;
		}
	}
	
}
