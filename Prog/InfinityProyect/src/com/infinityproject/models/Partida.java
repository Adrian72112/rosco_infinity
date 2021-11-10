package com.infinityproject.models;

public class Partida {

	private int codigo, puntaje;
	private String nickname;
	private boolean finalizada;
	
	private Palabra[] palabras = new Palabra[25];
	private Jugador jugador;
	
	public Partida(int codigo, int puntaje, String nickname, boolean finalizada) {
		super();
		this.codigo = codigo;
		this.puntaje = puntaje;
		this.nickname = nickname;
		this.finalizada = finalizada;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public boolean isFinalizada() {
		return finalizada;
	}
	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	
}
