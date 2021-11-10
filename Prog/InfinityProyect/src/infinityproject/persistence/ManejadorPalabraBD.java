package com.infinityproject.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.infinityproject.models.Palabra;

public class ManejadorPalabraBD {
	
	private ArrayList<Palabra> listaPalabras;
	
	public ManejadorPalabraBD() {
		this.listaPalabras = new ArrayList<Palabra>(); 
	}
	
	
	private Connection ConnectToDb() {
		DBConf dbconf = new DBConf();
		return dbconf.conectarMySQL();
	}

	public Palabra createNewPalabra(Palabra palabra) throws SQLException {
		
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		// INSERT INTO .... VALUES(48704997,'A','planta grande', true);
		String insert = "INSERT INTO palabra(letra, definicion, empiezaPor) VALUES('" + palabra.getLetra() + "', '" + palabra.getDefinicion() + "', " + palabra.getEmpiezaPor() + ";)" ;
		
		stmt.executeUpdate(insert);
		
		return palabra;
	}

	public boolean deletePalabra(int codigo) throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		// INSERT INTO .... VALUES(48704997,'A','planta grande', true);
		String delete = "DELETE palabra where codigo = " + codigo + ";";
		
		// Devuelve cuantos registros elimino (deberia de ser 1)
		int result = stmt.executeUpdate(delete);
		
		return result == 1;
	}
	
	public ArrayList<Palabra> obtenerPalabras(String categoria) throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
		// Queremeos selecionar por categoria
		String queryCategoria = "";
		if (categoria != "") {
			queryCategoria = " AND categoria = '" + categoria + "'"; 
		}
			
		// Obtenemos las letras de la base de datos "a,b,c,d,e...."
		String query = "SELECT distinct letra FROM PALABRA;";
		ResultSet rs = stmt.executeQuery(query);
		
		// rs.next va a recorrer a --> b --> c --> d...
		while (rs.next()) {
			String letra = rs.getString("letra");
			// Por cada letra, obtenemos su informacion correspondiente
			String obtenerPalabra = "SELECT * FROM palabra WHERE letra = '" + letra + "'" + queryCategoria + " order by frecuencia asc limit 1;";
			ResultSet rsPalabra = stmt.executeQuery(obtenerPalabra);
			
			if (rsPalabra.first()) {
				// Generamos el objeto Palabra
				Palabra palabra = obtenerPalabra(rsPalabra);
				// Lo guardamos en la lista de palabras
				listaPalabras.add(palabra);
			}
		}
		return listaPalabras;
		
	}


	private Palabra obtenerPalabra(ResultSet rsPalabra) throws SQLException {
		Palabra palabra = new Palabra();
		palabra.setLetra(rsPalabra.getString("letra").toCharArray()[0]);
		palabra.setCategoria(rsPalabra.getString("categoria"));
		palabra.setDefinicion(rsPalabra.getString("definicion"));
		palabra.setCantidadRespondida(rsPalabra.getInt("cantidadRespondida"));
		palabra.setCantidadRespondidaCorrectamente(rsPalabra.getInt("cantidadRespondidaCorrectamente"));
		palabra.setPalabra(rsPalabra.getString("palabra"));
		palabra.setCodigo(rsPalabra.getInt("codigo"));
		palabra.setFrecuencia(rsPalabra.getInt("frecuencia"));
		return palabra;
	}


	public ArrayList<Palabra> obtenerTop10PalabrasMasDificiles()throws SQLException {
		Connection con = ConnectToDb();
		Statement stmt = con.createStatement();
		
			String query = "SELECT * FROM palabra order by (cantidadRespondida - cantidadRespondidaCorrectamente) desc limit 10;";
			ResultSet rsPalabra = stmt.executeQuery(query);
			
			while (rsPalabra.next()) {
				// Generamos el objeto Palabra
				Palabra palabra = obtenerPalabra(rsPalabra);
				// Lo guardamos en la lista de palabras
				listaPalabras.add(palabra);
			}
		return listaPalabras;
	}

	
}
