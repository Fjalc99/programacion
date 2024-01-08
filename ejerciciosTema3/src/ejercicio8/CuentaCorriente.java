package ejercicio8;

public class CuentaCorriente {

	//Atributos
	
	private String nomTitular;
	private double saldo;
	
	
	public CuentaCorriente (String nomTitular, double saldo) {
		this.nomTitular=nomTitular;
		this.saldo=saldo;
	}


	public String getNomTitular() {
		return nomTitular;
	}


	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos
	
	public void ingresarDinero (double dinIng) {
		
		saldo=saldo+dinIng;
		
		//Nunca se pone asignaciones en el return, return saldo;
	}
	
	
	
	public double retirarDinero (double dinRet) {
		
		saldo=saldo-dinRet;
		return saldo;
		
	}
	
}
