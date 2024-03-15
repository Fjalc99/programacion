package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* 8. Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo
de radio 5.2 metros. Puedes hacer infinidad de ejercicios como este con fórmulas matemáticas como
áreas, volúmenes, teoremas (Pitágoras, por ejemplo), etc.  */
	
		double radio1=3, radio2=5.2, longitudCir=0, areaCir=0, dos=2;
		
		System.out.println("Bienvenidos al programa, vamos a calcular el area y la longitud de una círculo y de una circunferencia");
		System.out.println("######################################################################################################");
		System.out.println("Ahora vamos a calcular el area de un círculo");
		
		areaCir= Math.PI * Math.pow(radio2, dos);
		System.out.println("######################################################################################################");
		System.out.printf("El area del circulo es %.2f M",areaCir);
		System.out.println("\n######################################################################################################");
		System.out.println("Ahora vamos a calcular la longitud de la circuferencia");
		
		longitudCir= dos * Math.PI * radio1;
		System.out.println("######################################################################################################");
		System.out.printf("La longitud de la circunferencia es de %.2f M",longitudCir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
