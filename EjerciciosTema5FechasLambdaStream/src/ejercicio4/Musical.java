package ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Musical {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalTime fechaFinal;
	
	
	public Musical(String nombre, LocalDate fechaInicio, LocalTime fechaFinal) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public LocalTime getFechaFinal() {
		return fechaFinal;
	}


	public void setFechaFinal(LocalTime fechaFinal) {
		this.fechaFinal = fechaFinal;
	}


	@Override
	public String toString() {
		return "Musical [nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + "]";
	}
	
	
	
	


}
