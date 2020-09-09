package com.alpha.alphadesenvolvimento.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import com.alpha.alphadesenvolvimento.entities.User;
import com.alpha.alphadesenvolvimento.entities.User.UserResponse;
import com.alpha.alphadesenvolvimento.repositories.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public User findByEmail(String email) {
		Optional<User> objEmail = repository.findByEmail(email);
		return objEmail.get();
		
	}
	
	public UserResponse validateEmail(String email, String password) {
		
		User obj = findByEmail(email);
		UserResponse response = obj.new UserResponse();
		
		
		
		if(obj.getPassword().equals(password)) {
			
			
			response.setName(obj.getName());
		    response.setToken("tokenqualquer");
		    response.setStatus("200");
			
		    return response; 
		} else {
			response.setName("Usuário Inválido");
		    response.setToken("invalido");
		    response.setStatus("401");
			
		    return response; 
		}
	}

	
}
