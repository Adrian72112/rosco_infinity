package com.pasapalabraapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.pasapalabraapi.DTO.CreateUsuarioDTO;
import com.pasapalabraapi.DTO.LoginDTO;
import com.pasapalabraapi.logic.ManejadorUsuario;
import com.pasapalabraapi.logic.Usuario;

public class LoginController {
	
	private ManejadorUsuario manejadorUsuario = new ManejadorUsuario();
	
	@PostMapping("/login")
	@ResponseBody
	public Usuario login(@RequestBody(required = true) LoginDTO loginDTO) {
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not implemented...");
	} 
	
	@PostMapping("/user")
	@ResponseBody
	public Usuario createUser(@RequestBody(required = true) CreateUsuarioDTO createUser) {
		try {
			return manejadorUsuario.crearUsuario(createUser);
		}
		catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error al crear usuario");
		}
	}
}
