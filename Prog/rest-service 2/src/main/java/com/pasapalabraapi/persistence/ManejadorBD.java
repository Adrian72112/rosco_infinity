package com.pasapalabraapi.persistence;

import com.pasapalabraapi.logic.Administrador;
import com.pasapalabraapi.logic.Jugador;
import com.pasapalabraapi.logic.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ManejadorBD {
	
	public Usuario validateCredentials(int ci, int pin) throws Exception {
		Connection con = ConnectToDb();
		
		Usuario user = null;
		
		try {
			Statement stmt = con.createStatement();

			String query = "SELECT * FROM jugadores WHERE ci = " + ci + " and pin =" + pin;
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int ciFound = rs.getInt("ci");
				String nombreFound = rs.getString("name");
				int pinFound = rs.getInt("pin");
				
				user = new Jugador(nombreFound, ciFound, pinFound);
			}
			
			if(user == null) {
				query = "SELECT * FROM administradores WHERE ci = " + ci + " and pin =" + pin;
				rs = stmt.executeQuery(query);
				
				while(rs.next()) { 
					int ciFound = rs.getInt("ci");
					String nombreFound = rs.getString("name");
					int pinFound = rs.getInt("pin");
					
					user = new Administrador(nombreFound, ciFound, pinFound);
				}
			}

		}catch (SQLException e) {
			System.out.println(e.getMessage());
			
			throw new Exception(e.getMessage());
		}
		
		if(user == null) {
			throw new Exception("The username and / or password you entered does not match our records. Please check and try again.");
		}
		
		return user;
	}
	
	public boolean validateCredentialsAdmin(int ci, int pin) throws Exception {
		Connection con = ConnectToDb();
		
		Usuario user = null;
		
		try {
			Statement stmt = con.createStatement();

			String query = "SELECT * FROM administradores WHERE ci = " + ci + " and pin =" + pin;
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int ciFound = rs.getInt("ci");
				String nombreFound = rs.getString("name");
				int pinFound = rs.getInt("pin");
				
				user = new Jugador(nombreFound, ciFound, pinFound);
			}	

		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
			throw new Exception(e.getMessage());
		}
		
		if(user == null) {
			throw new Exception("The username and / or password you entered does not match our records. Please check and try again.");
		}
		
		return user != null;
	}
	
	public Usuario createJugador(Usuario user) throws SQLException {
		Connection con = ConnectToDb();

		Statement stmt = con.createStatement();
		
		String insert = "INSERT INTO jugadores(ci, name, pin) "
				+ "VALUES(" + user.getCi() + ",'" + user.getName() + "', " + user.getPin() + ")";

		stmt.executeUpdate(insert);
		
		return user;
	}
	
	public Usuario createAdmin(Usuario user) throws SQLException {
		Connection con = ConnectToDb();

		Statement stmt = con.createStatement();
		
		String insert = "INSERT INTO administradores(ci, name, pin) "
				+ "VALUES(" + user.getCi() + ",'" + user.getName() + "', " + user.getPin() + ")";
		
		stmt.executeUpdate(insert);
		
		return user;

	}

	private Connection ConnectToDb() {
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		return con;
	}
	
	public ArrayList<Usuario> getJugadores() {
		Connection con = ConnectToDb();
		
		ArrayList<Usuario> jugadores = new ArrayList<Usuario>();
		
		try {
			Statement stmt = con.createStatement();

			String query = "SELECT * FROM jugadores";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int ci = rs.getInt("ci");
				String nombre = rs.getString("name");
				int pin = rs.getInt("pin");
				
				jugadores.add(new Jugador(nombre, ci, pin));
			}
			
			return jugadores;

		}catch (SQLException e) {
			System.out.println(e.getMessage());
			
			return jugadores;
		}
	}
	
	public ArrayList<Usuario> getAdministradores() {
		Connection con = ConnectToDb();
		
		ArrayList<Usuario> admins = new ArrayList<Usuario>();
		
		try {
			Statement stmt = con.createStatement();

			String query = "SELECT * FROM administradores";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int ci = rs.getInt("ci");
				String nombre = rs.getString("name");
				int pin = rs.getInt("pin");
				
				admins.add(new Administrador(nombre, ci, pin));
			}
			
			return admins;

		}catch (SQLException e) {
			System.out.println(e.getMessage());
			
			return admins;
		}
	}
	
	public void deleteUser(int jugadorId) throws Exception {
		Connection con = ConnectToDb();

		Statement stmt = con.createStatement();
		
		String insert = "DELETE FROM jugadores WHERE ci="+jugadorId;
		
		stmt.executeUpdate(insert);
		
	}
	
	public void deleteAdmin(int adminId) throws Exception {
		Connection con = ConnectToDb();

		Statement stmt = con.createStatement();
		
		String insert = "DELETE FROM administradores WHERE ci="+adminId;
		
		stmt.executeUpdate(insert);
		
	}
}
