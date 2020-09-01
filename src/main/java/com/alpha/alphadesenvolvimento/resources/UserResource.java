package com.alpha.alphadesenvolvimento.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.alphadesenvolvimento.entities.User;

@RestController
@RequestMapping(value = "api/test")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L,"Alpha Desenvolvimento", "alpha@unicsul.com");
		return ResponseEntity.ok().body(user);
	}

}
