package logic;
import java.util.ArrayList;

public class ManejadorPalabras {

	private ArrayList<Palabra> palabras;
	
	public ManejadorPalabras() {
		this.palabras = new ArrayList<Palabra>();
	}
	
	//
	public void /*Palabra*/ crearNuevaPalabra(char letra, String definicion, boolean empiezaPor) {
	//	LETRA
	//	Dado una letra, una definici�n y un boolean que especifica si se
	//	empieza por la letra o la contiene, se crea una nueva Palabra para
	//	utilizar en el juego. El c�digo debe generarse autom�ticamente y no
	//	puede ser �nico.
		
		
		
		//Palabra pal = new Palabra(letra, definicion, empiezaPor);
		//this.palabras.add(pal);
		
	}
	
	public void eliminarPalabra(int codigo) {
		//LETRA
		//Dado un c�digo de palabra, se elimina de la aplicaci�n.
		
		//...
	}
	
	public void /*ArrayList<Palabra>*/ obtenerPalabras() {
		
	//	LETRA
	//	Caso 1: El sistema devuelve un ArrayList con 25 palabras, tal que la
	//	letra de cada palabra debe ser distinta a las dem�s.
	//	El estado de uso de las palabras elegidas debe estar en false y
	//	luego de seleccionarlas las pasamos a true. En caso de que no
	//	tengamos palabras en false, marcamos todas en true y obtenemos
	//	las mismas de forma aleatoria.
		
		//...
	}
	
	public void /*ArrayList<Palabra>*/ obtenerPalabras(String categoria) {
	//	LETRA
	//	Caso 2: Dado un nombre de categor�a, se devuelven palabras igual
	//	al Caso 1, pero de la categor�a antes mencionada.
		
		//...
	}
	
}
