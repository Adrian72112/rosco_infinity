package com.pasapalabraapi.logic;

public class Usuario {
	private String name;
	private int ci;
	private int pin;
	
	public Usuario(String name, int ci, int pin) {
		this.name = name;
		this.ci = ci;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	

}
