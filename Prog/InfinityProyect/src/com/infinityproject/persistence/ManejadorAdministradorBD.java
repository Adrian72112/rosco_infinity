package com.infinityproject.persistence;

import com.infinityproject.models.Administrador;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ManejadorAdministradorBD {
	
	private Connection ConnectToDb() {
		DBConf dbconf = new DBConf();
		return dbconf.conectarMySQL();
	}
	
	public Administrador crearAdministrador(Administrador admin) throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		// INSERT INTO .... VALUES(48704997,'Adrian','Tesore','...',1234);
		String insert = "INSERT INTO usuario(cedula, nombre, apellido, mail, pin) "
				+ "VALUES(" + admin.getCi() + ",'" + admin.getNombre() + "', '" 
				+ admin.getApellido() + "', '" + admin.getMail() + "', " + admin.getPin() + ");";
		
		stmt.executeUpdate(insert);
		
		// Insertar en la tabla Administrador, ref a Usuario
		insert = "INSERT INTO Administrador(cedula)" + "VALUES(" + admin.getCi() + ");";
		
		stmt.executeUpdate(insert);
		
		return admin;
	}
	
	public void eliminarAdministrador(int ci, int pinA) throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		String delete = "DELETE FROM administradores WHERE ci = " + ci + " AND pin = '" + pinA + "';";
		
		stmt.executeUpdate(delete);
	}
}
