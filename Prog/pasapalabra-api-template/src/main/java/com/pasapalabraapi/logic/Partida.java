package com.pasapalabraapi.logic;

public class Partida {

	private int codigo, puntaje;

	private Palabra[] palabras = new Palabra[25];
	private Jugador jugador;

	public Partida(int codigo, int puntaje) {
		super();
		this.codigo = codigo;
		this.puntaje = puntaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Palabra[] getPalabras() {
		return palabras;
	}

	public void setPalabras(Palabra[] palabras) {
		this.palabras = palabras;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

}
