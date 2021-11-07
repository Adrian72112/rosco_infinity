package com.infinityproject.logic;

import java.util.ArrayList;

import com.infinityproject.models.Administrador;
import com.infinityproject.models.Usuario;
import com.infinityproject.persistence.ManejadorAdministradorBD;

public class ManejadorAdministrador {
	
	private ManejadorAdministradorBD manejadorAdminDb;
	
	public ManejadorAdministrador() {
		this.manejadorAdminDb = new ManejadorAdministradorBD();
	}
	
	//Metodos
	public Administrador crearAdministrador (int ci, String nombre, String apellido, String mail, int pin) throws Exception {
		Administrador admin = new Administrador(ci, nombre, apellido, mail, pin);
		
		return manejadorAdminDb.crearAdministrador(admin);
	}
	
	public void eliminarAdministrador (int ci, int pinA) throws Exception {
		manejadorAdminDb.eliminarAdministrador(ci, pinA);
	}
	
}
