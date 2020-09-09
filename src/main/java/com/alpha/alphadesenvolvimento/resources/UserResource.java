package com.alpha.alphadesenvolvimento.resources;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.alphadesenvolvimento.entities.User;
import com.alpha.alphadesenvolvimento.entities.User.UserResponse;
import com.alpha.alphadesenvolvimento.entities.response.ServiceResponse;
import com.alpha.alphadesenvolvimento.entities.response.ServiceResponse.JsonResponse;
import com.alpha.alphadesenvolvimento.services.UserService;

@RestController
@RequestMapping(value = "api/user")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<JsonResponse> findById(@PathVariable Long id){
		User obj = service.findById(id);
		ServiceResponse meta = new ServiceResponse();
		JsonResponse response = meta.new JsonResponse();
		
		response.setData(obj);
		
		return ResponseEntity.ok().body(response);	
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<User> insert(@RequestBody User obj){
		
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj); 
		
	}
	
	@PostMapping
	public ResponseEntity<JsonResponse> login(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		
		JsonResponse response = service.validateEmail(email, password);
		
		return ResponseEntity.ok().body(response);
		
	}

}
