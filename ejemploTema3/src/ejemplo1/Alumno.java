package ejemplo1;

public class Alumno {

	//Atributos
	/*en la clase que se definen obejetos no se le ponen valores a los atributos */
	
	private String nombre;
	private int edad;
	private double notaMedia;
	
	//constructores
	
	// Para crear un objeto con valores
	
	public Alumno (String nombre, int edad, double notaMedia) {
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
	}
	
	public Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	
	//Métodos
	
	//Primer método propio, para imprimir bonito
	
	public void mostrarDatos (String calle) {
		//Cuerpo
		
		System.out.println("Los datos del alumno son:");
		System.out.println("Nombre:"+ nombre);
		System.out.println("Edad:"+ edad);
		System.out.println("Nota media:"+notaMedia);
		System.out.println("Calle:"+calle);
	}
	
 
}

