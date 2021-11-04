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
public class AdminController {
	private ManejadorUser userMan = new ManejadorUser();
	
	@PostMapping("/admins")
	@ResponseBody
	public Usuario postAdministrador(@RequestBody(required=true) CreateRequestDTO request) {
		Usuario user = null;
		
		try {
			user = this.userMan.createAdmin(request.getCi(), request.getPin(), request.getUser().getName(), request.getUser().getCi(), request.getUser().getPin());
			
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
		
		return user;
	}

	@GetMapping("/admins")
	@ResponseBody
	public ArrayList<Usuario> getAdministradores() {
		return this.userMan.getAdministradores();
	}  
	
	@DeleteMapping("/admins")
	@ResponseBody
	public void DeleteJugadores(@RequestParam(name="adminId", required=true) int adminId) {
		try {
			this.userMan.deleteAdmin(adminId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}  
	
}
