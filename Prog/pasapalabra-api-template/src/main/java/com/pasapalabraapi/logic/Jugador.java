package com.pasapalabraapi.logic;

public class Jugador extends Usuario {
	
	private int partidasJugadas, partidasGanadas;
	
	public Jugador(int ci, String nombre, String apellido, String mail, int pin, String nickname, int partidasJugadas,
			int partidasGanadas) {
		super(ci, nombre, apellido, mail, pin);
		this.partidasJugadas = partidasJugadas;
		this.partidasGanadas = partidasGanadas;
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
