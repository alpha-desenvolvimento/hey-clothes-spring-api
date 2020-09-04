package com.alpha.alphadesenvolvimento.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.alpha.alphadesenvolvimento.entities.User;
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

	
}
