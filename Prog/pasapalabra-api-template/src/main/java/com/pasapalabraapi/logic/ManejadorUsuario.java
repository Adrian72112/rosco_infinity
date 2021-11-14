package com.pasapalabraapi.logic;

import com.pasapalabraapi.DTO.CreateUsuarioDTO;
import com.pasapalabraapi.persistence.ManejadorUsuarioBD;

public class ManejadorUsuario {

	private ManejadorUsuarioBD manejadorUsuarioDb;

	public ManejadorUsuario() {
		this.manejadorUsuarioDb = new ManejadorUsuarioBD();
	}

	public Usuario crearUsuario(CreateUsuarioDTO user) throws Exception {
		// Crear un nuevo usuario a partir del objeto DTO
		Usuario usuario = new Administrador(user.getCi(), user.getNombre(), 
				user.getApellido(), user.getMail(), user.getPin());
		// Llamamos al manejador de la base para crear el usuario
		return manejadorUsuarioDb.crearUsuario(usuario);
	}

	public boolean validarUsuario(int ci, int pin) throws Exception {
		return manejadorUsuarioDb.validarUsuario(ci, pin);
	}
}
