package com.pasapalabraapi.restservice;

public class LoginRequestDTO {
	private int ci;
	private int pin;
	
	public LoginRequestDTO(int ci, int pin) {
		super();
		this.ci = ci;
		this.pin = pin;
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
