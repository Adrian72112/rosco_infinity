package com.pasapalabraapi.logic;

import java.util.ArrayList;

import com.pasapalabraapi.persistence.ManejadorBD;

public class ManejadorUser {
	
	private ManejadorBD manejadorBD = new ManejadorBD();
	
	public Usuario createJugador(int ciA, int pinA, String nombre, int ci, int pin) throws Exception {
		if(manejadorBD.validateCredentialsAdmin(ciA, pinA)) {
			return manejadorBD.createJugador(new Jugador(nombre, ci, pin));
		} else {
			return null;
		}
	}
	
	public Usuario createAdmin(int ciA, int pinA, String nombre, int ci, int pin) throws Exception {
		if(manejadorBD.validateCredentialsAdmin(ciA, pinA)) {
			return manejadorBD.createAdmin(new Administrador(nombre, ci, pin));
		} else {
			return null;
		}
	}
	
	public Usuario login(int ci, int pin) throws Exception {
		return manejadorBD.validateCredentials(ci, pin);
	}
	
	public ArrayList<Usuario> getJugadores() {
		return manejadorBD.getJugadores();
	}
	
	public ArrayList<Usuario> getAdministradores() {
		return manejadorBD.getAdministradores();
	}

	public void deleteUser(int jugadorId) throws Exception {
		manejadorBD.deleteUser(jugadorId);
		
	}
	
	public void deleteAdmin(int jugadorId) throws Exception {
		manejadorBD.deleteAdmin(jugadorId);
		
	}
}
