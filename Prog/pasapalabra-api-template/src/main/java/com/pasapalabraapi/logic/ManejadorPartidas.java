package com.pasapalabraapi.logic;

import java.sql.SQLException;
import java.util.ArrayList;
import com.pasapalabraapi.persistence.ManejadorPartidaBD;

public class ManejadorPartidas {

	private ManejadorPartidaBD manejadorBD = new ManejadorPartidaBD();
	private ArrayList<Partida> partidas;

//	ArrayList char letras;

	public ManejadorPartidas() {
		this.partidas = new ArrayList<Partida>();
	}

	public Partida nuevaPartida(int cedula, int pin) throws Exception {
		Partida partida = new Partida(cedula, pin);

		return manejadorBD.nuevaPartida(partida);

		// Dado un cedula y un pin (opcionalmente puede solicitar una categor�a)
		// Caso 1: el nickname no existe. En este caso el sistema crea el usuario con el
		// pin dado, luego contin�a con el default.
		// verificar que la cedula exista si no existe que me muestro no?
		// Caso 2: el nickname existe y el pin es incorrecto. Devuelve un
		// mensaje de error con el pin incorrecto.
		// verica ceula y pin -->
		// Caso 3: el nickname existe y el pin es correcto. Salta al caso default.
		// Default: El sistema crea y devuelve una partida con 25 palabras (que pueden
		// ser sobre una categor�a o aleatorias) con un c�digo de
	}

//	public Partida nuevaPartidaCategoria(int cedula, int pin, String categoria) throws Exception {
//		Partida partida = new Partida(cedula, pin, categoria);
//
//		return manejadorBD.nuevaPartidaCategoria(partida);
//	}

	public void finalizarPartida(int codigoPartida, int puntaje) {
		// LETRA
		// Dado un c�digo de partida y un puntaje obtenido (cantidad de
		// respuestas correctas) se cambia el estado de la partida y se
		// actualizan las variables estad�sticas de los jugadores y se finaliza la
		// partida.
	}

	public ArrayList<Partida> obtenerTop10JugadoresPartidasGanadas() throws SQLException {
		// Devuelve un ArrayList de Palabras, con el top 10 palabra cuyo índice de
		// respuesta incorrecta sea más cercano a 1
		return manejadorBD.obtenerTop10JugadoresPartidasGanadas();

		// LETRA
		// Devuelve un ArrayList de Jugadores, con los 10 jugadores que han conseguido
		// m�s partidas ganadas (contestar todas correctamente).

	}

	public ArrayList<Partida> obtenerTop10JugadoresPartidasPerdidas() throws SQLException {
		return manejadorBD.obtenerTop10JugadoresPartidasPerdidas();
		// LETRA
		// Devuelve un ArrayList de Jugadores, con los 10 jugadores que han conseguido
		// m�s partidas perdidas (no poder contestar ninguna correctamente).
	}

}
