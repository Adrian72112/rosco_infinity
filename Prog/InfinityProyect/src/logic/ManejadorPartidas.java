package logic;
import java.util.ArrayList;

public class ManejadorPartidas {
	
	private ArrayList<Partida> partidas;
	
	array list char letras
	
	
	public ManejadorPartidas() {
		this.partidas = new ArrayList<Partida>();
	}

	public void /*Partida*/ nuevaPartida(String nickname, int pin) {
	//	LETRA
	//	Dado un nickname y un pin (opcionalmente puede solicitar una categoría)
	// 	Caso 1: el nickname no existe. En este caso el sistema crea el usuario con el pin dado, luego continúa con el default.
	// 	Caso 2: el nickname existe y el pin es incorrecto. Devuelve un
	// 	mensaje de error con el pin incorrecto.
	// 	Caso 3: el nickname existe y el pin es correcto. Salta al caso default.
	//	Default: El sistema crea y devuelve una partida con 25 palabras (que pueden ser sobre una categoría o aleatorias) con un código de
	// 	partida único.
		
		
		
	}
	
	public void /*Partida*/ nuevaPartida(String nickname, int pin, String categoria) {
	
	}

	public void finalizarPartida(int codigoPartida, int puntaje) {
	//	LETRA
	//	Dado un código de partida y un puntaje obtenido (cantidad de
	//	respuestas correctas) se cambia el estado de la partida y se
	//	actualizan las variables estadísticas de los jugadores y se finaliza la partida.
	}
	
	public void /*ArrayList<Jugador>*/ obtenerTop10JugadoresPartidasGanadas() {
	//	LETRA
	//	Devuelve un ArrayList de Jugadores, con los 10 jugadores que han conseguido más partidas ganadas (contestar todas correctamente).
		
	}
	
	public void /*ArrayList<Jugador>*/ obtenerTop10JugadoresPartidasPerdidas() {
	//	LETRA
	//	Devuelve un ArrayList de Jugadores, con los 10 jugadores que han conseguido más partidas perdidas (no poder contestar ninguna correctamente).
	}
	
	public void /*ArrayList<Palabra>*/ obtenerTop10PalabrasMasDificiles() {
	//	LETRA
	//	Devuelve un ArrayList de Palabras, con el top 10 palabra cuyo índice de respuesta incorrecta sea más cercano a 1
	}
	
	
}
