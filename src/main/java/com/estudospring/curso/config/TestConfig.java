package com.estudospring.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudospring.curso.entities.User;
import com.estudospring.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Bruno Oliveira", "bruno@gmail.com", "988888888", "123456");
		User u4 = new User(null, "Yasmim Oliveira", "yasmim@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
		
	}
	
	
}