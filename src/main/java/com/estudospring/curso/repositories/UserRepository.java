package com.estudospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
