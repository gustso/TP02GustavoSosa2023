package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {
	private String nombre;
	private String apellido;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
