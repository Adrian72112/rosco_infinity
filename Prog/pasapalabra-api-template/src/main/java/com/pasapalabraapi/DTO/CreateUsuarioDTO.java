package com.pasapalabraapi.DTO;

import com.pasapalabraapi.logic.Usuario;

public class CreateUsuarioDTO {
	private int ci;
	private int pin;
	private String nombre, apellido, mail;
	
	public CreateUsuarioDTO(int ci, int pin, String nombre, String apellido, String mail) {
		super();
		this.ci = ci;
		this.pin = pin;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
