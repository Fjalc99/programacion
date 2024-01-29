package forEach;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numeros = {1,2,3,4,5,6,7,8,9,10};
		int suma=0;
		
		for (int i : numeros) {
			suma = suma + i;
			
			System.out.println((i)); 
			//Valor se refiere al valor guardado en el array y no el indice como en los bucles normales. 
			//numeros es el nombre del array.
		}
		
		System.out.println("La suma es: "+suma);
	}

}
