package com.pasapalabraapi.restservice;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.pasapalabraapi.logic.ManejadorUser;
import com.pasapalabraapi.logic.Usuario;

@Controller
public class JugadorController {
private ManejadorUser userMan = new ManejadorUser();
	
	@PostMapping("/jugadores")
	@ResponseBody
	public Usuario postJugador(@RequestBody CreateRequestDTO request) {
		Usuario user = null;
		
		try {
			user = this.userMan.createJugador(request.getCi(), request.getPin(), request.getUser().getName(), request.getUser().getCi(), request.getUser().getPin());
			
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
		
		return user;
	}

	@GetMapping("/jugadores")
	@ResponseBody
	public ArrayList<Usuario> getJugadores() {
		return this.userMan.getJugadores();
	}  
	
	@DeleteMapping("/jugadores")
	@ResponseBody
	public void DeleteJugadores(@RequestParam(name="jugadorId", required=true) int jugadorId) {
		try {
			this.userMan.deleteUser(jugadorId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}  
}
