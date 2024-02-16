package ejercicio3;

import java.util.Objects;

public class Alumno {

	private int id;
	private String nombre;
	private double nota;
	
	
	
	public Alumno(int id, String nombre, double nota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nota = nota;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
	}



	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", nota=" + nota + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, nota);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
	
	
}
