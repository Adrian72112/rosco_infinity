package com.pasapalabraapi.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}


/*

	3
	
	Palabra -> usada
	
	A: arbol - avion - azul
	
	arbol -> usada = true
	
	azul -> usada = true
	
	avion -> avion = true


	ResultSet palabras = SELECT * FROM Palabras WHERE usada = false
	Palabra pal = null;
	
	while(palabras.next()){
		CON UN RANDO BUSCAS UNA PALABRA etc etc
		
		pal = new Palabra(palabras.get(nombre), palabras.get(....)....);
	
	}
	
	if(pal != null){
		Mandamos UPDATE Palabras SET usada = true WHERE palabra = pal.getNombre()
	} else {
		UPDATE Palabras SET usada = false
		
		ResultSet palabras = SELECT * FROM Palabras WHERE usada = false
		
		Palabra pal = null;
		
		while(palabras.next()){
			CON UN RANDO BUSCAS UNA PALABRA etc etc
			
			pal = new Palabra(palabras.get(nombre), palabras.get(....)....);
		
		}
	}
	
	UPDATE Palabras SET usada = true WHERE palabra = Avion
	
	UPDATE Palabras SET usada = false

*/