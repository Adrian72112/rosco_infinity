package com.pasapalabraapi.logic;

//import java.util.ArrayList;

//import com.pasapalabraapi.logic.Administrador;
//import com.pasapalabraapi.logic.Usuario;
import com.pasapalabraapi.persistence.ManejadorAdministradorBD;

public class ManejadorAdministrador {

	private ManejadorAdministradorBD manejadorAdminDb;

	public ManejadorAdministrador() {
		this.manejadorAdminDb = new ManejadorAdministradorBD();
	}

	public Administrador crearAdministrador(int ci, String nombre, String apellido, String mail, int pin)
			throws Exception {
		Administrador admin = new Administrador(ci, nombre, apellido, mail, pin);

		return manejadorAdminDb.crearAdministrador(admin);
	}

	public void eliminarAdministrador(int ci, int pinA) throws Exception {
		manejadorAdminDb.eliminarAdministrador(ci, pinA);
	}

}
