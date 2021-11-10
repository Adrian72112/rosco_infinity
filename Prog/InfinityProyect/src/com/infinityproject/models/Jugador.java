package com.infinityproject.models;

public class Jugador extends Usuario {
	
	private String nickname;
	private int partidasJugadas,partidasGanadas;
	
	public Jugador(int ci, String nombre, String apellido, String mail, int pin, String nickname, int partidasJugadas,
			int partidasGanadas) {
		super(ci, nombre, apellido, mail, pin);
		this.nickname = nickname;
		this.partidasJugadas = partidasJugadas;
		this.partidasGanadas = partidasGanadas;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}
	
}
