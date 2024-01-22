package interfaces;

public interface IDepredador {
	
	 //No hace falta ponerle el public ni el abstract porque 
	//Todas las clases son publicas y abstractas en las interfaces

public abstract	void localizar(Animal presa);
	void cazar (Animal presa);
	
}
