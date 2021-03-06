package com.pasapalabraapi.restservice;

import com.pasapalabraapi.logic.Usuario;

public class CreateRequestDTO {
	private int ci;
	private int pin;
	private Usuario user;
	
	public CreateRequestDTO(int ci, int pin, Usuario user) {
		super();
		this.ci = ci;
		this.pin = pin;
		this.user = user;
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

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	
}
