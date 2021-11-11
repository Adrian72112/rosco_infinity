package com.pasapalabraapi.DTO;

public class CreatePalabraDTO {
	private char letra;
	private String definicion;
	private int codigo;
	private boolean contiene;
	private int cantidadRespondida;
	private int cantidadRespondidaCorrectamente;
	private String palabra;
	
	public CreatePalabraDTO(char letra, String definicion, int codigo, boolean contiene, int cantidadRespondida,
			int cantidadRespondidaCorrectamente, String palabra) {
		super();
		this.letra = letra;
		this.definicion = definicion;
		this.codigo = codigo;
		this.contiene = contiene;
		this.cantidadRespondida = cantidadRespondida;
		this.cantidadRespondidaCorrectamente = cantidadRespondidaCorrectamente;
		this.palabra = palabra;
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

	public boolean isContiene() {
		return contiene;
	}

	public void setContiene(boolean contiene) {
		this.contiene = contiene;
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

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	
}
