package com.pasapalabraapi.logic;

import com.pasapalabraapi.persistence.ManejadorUsuarioBD;

public class ManejadorUsuario {

	private ManejadorUsuarioBD manejadorUsuarioDb;

	public ManejadorUsuario() {
		this.manejadorUsuarioDb = new ManejadorUsuarioBD();
	}

	public Usuario crearUsuario(int ci, String nombre, String apellido, String mail, int pin) throws Exception {
		Usuario usuario = new Administrador(ci, nombre, apellido, mail, pin);

		return manejadorUsuarioDb.crearUsuario(usuario);
	}

	public boolean validarUsuario(int ci, int pin) throws Exception {
		return manejadorUsuarioDb.validarUsuario(ci, pin);
	}
}
