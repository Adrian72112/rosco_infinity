package com.pasapalabraapi.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.pasapalabraapi.logic.ManejadorUser;
import com.pasapalabraapi.logic.Usuario;

@Controller
public class LoginController {
	private ManejadorUser userMan = new ManejadorUser();
	
	@PostMapping("/login")
	@ResponseBody
	public Usuario loginAdministradores(@RequestBody(required=true) LoginRequestDTO login) {
		Usuario user = null;
		try {
			user = this.userMan.login(login.getCi(), login.getPin());
			
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
		
		return user;
	} 
}
