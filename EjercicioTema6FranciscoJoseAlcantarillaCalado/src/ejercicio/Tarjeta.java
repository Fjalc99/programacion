package ejercicio;

public class Tarjeta extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pin;
	private double saldo;
	
	
	public Tarjeta(String pin, double saldo) {
		super();
		this.pin = pin;
		this.saldo = saldo;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Tarjeta [pin=" + pin + ", saldo=" + saldo + "]";
	}
	
	
	
	public double comprobarSaldo (double retirar) throws ComprobarMaximoSaldo {
		
		if (retirar > saldo) {
		  throw new ComprobarMaximoSaldo("Quieres retirar más dinero que hay en la cuenta");
		}
		
		return saldo -retirar;
	}
	

	public double comprobarSaldoMin ( double depositar) throws ComprobarSaldoMinimo{
		
		if (depositar <= 0) {
			throw new ComprobarSaldoMinimo("Tienes que depositar mas de 0");
		}
		
		return saldo + depositar;
	}
	
	
	public void comprobarPin (String pin) throws ComprobarPin  {
		
		if (!pin.equalsIgnoreCase(pin)) {
			throw new ComprobarPin("El pin no coincide");
		}
		
	}
	
	
	
}
