package com.pasapalabraapi.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pasapalabraapi.logic.ManejadorPalabras;
import com.pasapalabraapi.logic.Palabra;
import com.pasapalabraapi.logic.Partida;

public class ManejadorPartidaBD {
	
	private Connection ConnectToDb() {
		DBConf dbconf = new DBConf();
		return dbconf.conectarMySQL();
	}

	public Partida nuevaPartida(Partida partida) throws SQLException {
//		Connection con = ConnectToDb();
//		Statement stmt = con.createStatement();
		
		return null;
	}

//	public Partida nuevaPartidaCategoria(int cedula, int pin, Partida partida)throws SQLException {
//		//Connection con = ConnectToDb();
//		//Statement stmt = con.createStatement();
//		
//		return null;
//	}

	public ArrayList<Partida> obtenerTop10JugadoresPartidasGanadas() throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		String query = "SELECT cedula FROM Partida group by cedula order by sum(puntaje) desc limit 10;";
		ResultSet rsPalabra = stmt.executeQuery(query);
		
		return listaPalabras;

	}

	public ArrayList<Partida> obtenerTop10JugadoresPartidasPerdidas() throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		return null;
	}

}
