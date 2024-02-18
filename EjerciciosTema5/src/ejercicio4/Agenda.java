package ejercicio4;

import java.util.Objects;

public class Agenda {
	
	private String contacto;
	private String numero;
	
	
	public Agenda(String contacto, String numero) {
		super();
		this.contacto = contacto;
		this.numero = numero;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Agenda [contacto=" + contacto + ", numero=" + numero + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(contacto, numero);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(contacto, other.contacto) && Objects.equals(numero, other.numero);
	}
	
	
	
	
}
