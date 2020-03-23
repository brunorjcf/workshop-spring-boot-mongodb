package com.TechVF.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.TechVF.workshopmongo.domain.User;
import com.TechVF.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User Alex = new User(null, "Alex Green", "alex@gmail.com");
		User Bob = new User(null, "Bob Marley", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, Alex, Bob));
	}
}
