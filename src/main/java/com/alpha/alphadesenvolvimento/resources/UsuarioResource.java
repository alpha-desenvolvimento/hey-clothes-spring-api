package com.alpha.alphadesenvolvimento.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.alphadesenvolvimento.entities.Usuario;

@RestController
@RequestMapping(value = "api/test")
public class UsuarioResource {

	@PostMapping
	public Usuario obterUsuario(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		Usuario obj = new Usuario();
		obj.setId((long) 1);
		obj.setEmail("e@gmail.com");
		obj.setPassword("123456");
		obj.setName("userTeste");
		obj.setToken("TokenQualquer");
		obj.setStatus("Success!");
		
//		String jsonEmail = String.valueOf(email);
//		String jsonPass = String.valueOf(password);
		
		String userEmail = obj.getEmail();
		String userPass = obj.getPassword();
		

		if (email.equals(userEmail) && password.equals(userPass)) {
			String userName = obj.getName();
			String userToken = obj.getToken();
			String status = obj.getStatus();
			return obj;
		}else{
			Usuario obj2 = new Usuario();
			obj2.setStatus("FAIL");
			return obj2;
		}
		
		
		
		
	}

}
