package com.pasapalabraapi.logic;

import java.sql.SQLException;
import java.util.ArrayList;

import com.pasapalabraapi.logic.Palabra;
import com.pasapalabraapi.persistence.ManejadorPalabraBD;

public class ManejadorPalabras {

	private ManejadorPalabraBD manejadorBD = new ManejadorPalabraBD();
	
	public ManejadorPalabras() {
		this.manejadorBD = new ManejadorPalabraBD(); 
	}
	
	//	Dado una letra, una definici�n y un boolean que especifica si se empieza por la letra o la contiene, se crea una nueva Palabra para utilizar en el juego.
	public Palabra crearNuevaPalabra(char letra, String definicion, boolean empiezaPor) throws SQLException {
		return manejadorBD.createNewPalabra(new Palabra(letra, definicion, empiezaPor));
	}
	
	//Dado un c�digo de palabra, se elimina de la aplicacion.
	public boolean eliminarPalabra(int codigo) throws SQLException {
		return manejadorBD.deletePalabra(codigo);
	}
	
	public ArrayList<Palabra> obtenerPalabras() throws SQLException{
		return manejadorBD.obtenerPalabras(""); // No queremos filtrar por categoria
	}
	
	public ArrayList<Palabra> obtenerPalabras(String categoria) throws SQLException {
		return manejadorBD.obtenerPalabras(categoria);
	}
	
	public ArrayList<Palabra> obtenerTop10PalabrasMasDificiles() throws SQLException {
	//Devuelve un ArrayList de Palabras, con el top 10 palabra cuyo índice de respuesta incorrecta sea más cercano a 1
		return manejadorBD.obtenerTop10PalabrasMasDificiles();

	}
}
