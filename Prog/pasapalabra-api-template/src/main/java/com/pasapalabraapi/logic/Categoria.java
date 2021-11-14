package com.pasapalabraapi.logic;

import java.util.ArrayList;

public class Categoria {

	private String nombre;

	public ArrayList<Palabra> palabras = new ArrayList<Palabra>();

	public Categoria(String nombre, ArrayList<Palabra> palabras) {
		super();
		this.nombre = nombre;
		this.palabras = palabras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Palabra> getPalabras() {
		return palabras;
	}

	public void setPalabras(ArrayList<Palabra> palabras) {
		this.palabras = palabras;
	}

}
