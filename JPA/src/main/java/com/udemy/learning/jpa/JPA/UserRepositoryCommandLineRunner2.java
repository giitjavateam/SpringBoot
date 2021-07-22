package com.udemy.learning.jpa.JPA;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.learning.jpa.JPA.entity.User;
import com.udemy.learning.jpa.JPA.service.UserDAOService;
import com.udemy.learning.jpa.JPA.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner2 implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner2.class);
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Jill","Admin");
		userRepository.save(user);
		log.info("New user is created" + user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is retreived :" + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("All Users :" + users);
	}
}
