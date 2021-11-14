package com.pasapalabraapi.logic;

public class Palabra {

	private char letra;
	private String palabra, definicion, categoria;
	private int codigo, cantVecesCorrecta, cantUsada;
	private boolean contiene;

	public Palabra() {

	}

	public Palabra(char letra, String definicion, int codigo, int cantVecesCorrecta, boolean contiene, String categoria,
			int cantUsada) {
		this.letra = letra;
		this.definicion = definicion;
		this.codigo = codigo;
		this.cantVecesCorrecta = cantVecesCorrecta;
		this.contiene = contiene;
		this.categoria = categoria;
		this.cantUsada = cantUsada;
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

	public int getCantVecesCorrecta() {
		return cantVecesCorrecta;
	}

	public void setCantVecesCorrecta(int cantVecesCorrecta) {
		this.cantVecesCorrecta = cantVecesCorrecta;
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

	public int getCantUsada() {
		return cantUsada;
	}

	public void setCantUsada(int cantUsada) {
		this.cantUsada = cantUsada;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

}
