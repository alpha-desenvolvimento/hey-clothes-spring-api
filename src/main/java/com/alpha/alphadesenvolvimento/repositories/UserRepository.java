package com.alpha.alphadesenvolvimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.alphadesenvolvimento.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
