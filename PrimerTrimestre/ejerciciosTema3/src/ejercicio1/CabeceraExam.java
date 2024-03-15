package ejercicio1;

public class CabeceraExam {
	
	
	//Atributos
	private String nombreAsig, aula, nota;

	
	//Constructor
	public CabeceraExam(String nombreAsig, String aula, String nota) {
		
		this.nombreAsig = nombreAsig;
		this.aula = aula;
		this.nota = nota;
	}
	
	
	public void cabecera () {
		
		System.out.println("Asignatura:"+ nombreAsig);
		System.out.println("Aula:"+ aula);
		System.out.println("Nota:"+nota);
	}
	
	

}
