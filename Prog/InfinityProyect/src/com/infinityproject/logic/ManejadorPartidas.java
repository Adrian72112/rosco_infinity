package com.infinityproject.logic;
import java.util.ArrayList;

import com.infinityproject.models.Partida;
import com.infinityproject.persistence.ManejadorAdministradorBD;

public class ManejadorPartidas {
	
	private ManejadorAdministradorBD manejadorBD = new ManejadorAdministradorBD(); 
	private ArrayList<Partida> partidas;
	
	//Array List char letras;
	
	
	public ManejadorPartidas() {
		this.partidas = new ArrayList<Partida>();
	}

	public void /*Partida*/ nuevaPartida(String nickname, int pin) {
	//	LETRA
	//	Dado un nickname y un pin (opcionalmente puede solicitar una categor�a)
	// 	Caso 1: el nickname no existe. En este caso el sistema crea el usuario con el pin dado, luego contin�a con el default.
	// 	Caso 2: el nickname existe y el pin es incorrecto. Devuelve un
	// 	mensaje de error con el pin incorrecto.
	// 	Caso 3: el nickname existe y el pin es correcto. Salta al caso default.
	//	Default: El sistema crea y devuelve una partida con 25 palabras (que pueden ser sobre una categor�a o aleatorias) con un c�digo de
	// 	partida �nico.
		
	return ;
		
	}
	
	public void /*Partida*/ nuevaPartida(String nickname, int pin, String categoria) {
//		return manejadorBD.newPartida(new Palabra(nickname, pin, categoria));
	}

	public void finalizarPartida(int codigoPartida, int puntaje) {
	//	LETRA
	//	Dado un c�digo de partida y un puntaje obtenido (cantidad de
	//	respuestas correctas) se cambia el estado de la partida y se
	//	actualizan las variables estad�sticas de los jugadores y se finaliza la partida.
	}
	
	public void /*ArrayList<Jugador>*/ obtenerTop10JugadoresPartidasGanadas() {
	//	LETRA
	//	Devuelve un ArrayList de Jugadores, con los 10 jugadores que han conseguido m�s partidas ganadas (contestar todas correctamente).
		
	}
	
	public void /*ArrayList<Jugador>*/ obtenerTop10JugadoresPartidasPerdidas() {
	//	LETRA
	//	Devuelve un ArrayList de Jugadores, con los 10 jugadores que han conseguido m�s partidas perdidas (no poder contestar ninguna correctamente).
	}
	
	public void /*ArrayList<Palabra>*/ obtenerTop10PalabrasMasDificiles() {
	//	LETRA
	//	Devuelve un ArrayList de Palabras, con el top 10 palabra cuyo �ndice de respuesta incorrecta sea m�s cercano a 1
	}
	
	
}
