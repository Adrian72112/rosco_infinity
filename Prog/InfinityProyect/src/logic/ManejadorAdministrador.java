package logic;

import java.util.ArrayList;

public class ManejadorAdministrador {
	
	private ArrayList<Usuario> usuarios;
	
	public ManejadorAdministrador() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	//Métodos
	public void crearAdministrador (int ci, String nombre, String apellido, String mail, int pin, int ciA, int pinA ) {
		Usuario admin = new Administrador(ci, nombre, apellido, mail, pin); 
		//se crea un nuevo adm. ciA y pinA es parte del adm que está creando al nuevo adm
		this.usuarios.add(admin);
	}
	
	public void eliminarAdministrador (int ci, int pinA, int ciA) {
		int aux = -1;
		
		for(int i = 0; i < this.usuarios.size(); i++) { //recorre los usuarios que existen
			if(this.usuarios.get(i).getCi() == ci) { 
				//dentro del array de usuarios, pide la ci del i y la compara con la que ingresó el adm. 
				//si es así, la variable aux será positiva
				aux = i;
			}
		}
		
		if(aux >= 0) { //si aux es positiva, significa que entró al if anterior, por lo que coincide y se remueve del array
			this.usuarios.remove(aux);
		} else { //si es negativo no entró en el if
			System.out.println("No existe un usuario con esa cédula");
		}
	}
	
}
