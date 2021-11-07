package com.infinityproject.models;

public class Palabra {

	 private char letra ;
	 private String definicion;
	 private int codigo, cantidadRespondida, cantidadRespondidaCorrectamente; 
	 private boolean empiezaPor, estadoUso;
	 
	 public Categoria categoria;

	public Palabra(char letra, String definicion, int codigo, int cantidadRespondida,
			int cantidadRespondidaCorrectamente, boolean empiezaPor, boolean estadoUso, Categoria categoria) {
		super();
		this.letra = letra;
		this.definicion = definicion;
		this.codigo = codigo;
		this.cantidadRespondida = cantidadRespondida;
		this.cantidadRespondidaCorrectamente = cantidadRespondidaCorrectamente;
		this.empiezaPor = empiezaPor;
		this.estadoUso = estadoUso;
		this.categoria = categoria;
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

	public boolean isEmpiezaPor() {
		return empiezaPor;
	}

	public void setEmpiezaPor(boolean empiezaPor) {
		this.empiezaPor = empiezaPor;
	}

	public boolean isEstadoUso() {
		return estadoUso;
	}

	public void setEstadoUso(boolean estadoUso) {
		this.estadoUso = estadoUso;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	 
}