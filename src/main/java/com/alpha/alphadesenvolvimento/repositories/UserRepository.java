package com.alpha.alphadesenvolvimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.alphadesenvolvimento.entities.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}