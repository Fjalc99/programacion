package ejercio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 10, dos=2;
		
		int numeros [] = new int [tam];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * dos;
			System.out.println(numeros[i]);
		}
	}

}
