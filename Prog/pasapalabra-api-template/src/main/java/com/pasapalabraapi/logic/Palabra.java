package com.pasapalabraapi.logic;

public class Palabra {

	 private char letra ;
	 private String palabra, definicion, categoria;
	 private int codigo, cantidadRespondida, cantidadRespondidaCorrectamente, frecuencia; 
	 private boolean contiene;
	 
	 public Palabra() {
		 
	 }

	 public Palabra(char letra, String definicion, int codigo, int cantidadRespondida,
			int cantidadRespondidaCorrectamente, boolean contiene,
			String categoria, int frecuencia) {
		this.letra = letra;
		this.definicion = definicion;
		this.codigo = codigo;
		this.cantidadRespondida = cantidadRespondida;
		this.cantidadRespondidaCorrectamente = cantidadRespondidaCorrectamente;
		this.contiene = contiene;
		this.categoria = categoria;
		this.frecuencia = frecuencia;
	}

	public Palabra(char letra, String definicion, boolean contiene) {
		this.letra = letra;
		this.definicion = definicion;
		this.contiene = contiene;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidadRespondida() {
		return cantidadRespondida;
	}

	public void setCantidadRespondida(int cantidadRespondida) {
		this.cantidadRespondida = cantidadRespondida;
	}

	public int getCantidadRespondidaCorrectamente() {
		return cantidadRespondidaCorrectamente;
	}

	public void setCantidadRespondidaCorrectamente(int cantidadRespondidaCorrectamente) {
		this.cantidadRespondidaCorrectamente = cantidadRespondidaCorrectamente;
	}

	public boolean getContiene() {
		return contiene;
	}

	public void setContiene(boolean contiene) {
		this.contiene = contiene;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	 
}