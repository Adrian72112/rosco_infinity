package com.pasapalabraapi.persistence;

import com.pasapalabraapi.logic.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManejadorUsuarioBD {

	private Connection ConnectToDb() {
		DBConf dbconf = new DBConf();
		return dbconf.conectarMySQL();
	}

	public Usuario crearUsuario(Usuario usuario) throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();

		// INSERT INTO .... VALUES(48704997,'Adrian','Tesore','...',1234);
		String insert = "INSERT INTO Usuario(cedula, nombre, apellido, mail, pin) " + "VALUES(" + usuario.getCi() + ",'"
				+ usuario.getNombre() + "', '" + usuario.getApellido() + "', '" + usuario.getMail() + "', "
				+ usuario.getPin() + ");";

		stmt.executeUpdate(insert);

		return usuario;
	}

	public boolean validarUsuario(int ci, int pin) throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();

		String validar = "SELECT 1 FROM Usuario WHERE cedula = " + ci + " AND pin = '" + pin + "';";
		ResultSet rs = stmt.executeQuery(validar);

		// .next() --> devuelvo los resultados de la query(validar)
		while (rs.next()) {
			return true;
		}

		return false;
	}
}
