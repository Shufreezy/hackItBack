package com.allhail.hobbyhub.runners;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.allhail.hobbyhub.dao.UserRepository;
import com.allhail.hobbyhub.models.User;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private final UserRepository repo;
	
	public UserCommandLineRunner(UserRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// Create dummy list of users
		Stream
			.of("Kim", "Dale", "Xavier")
			.forEach(name -> repo.save(new User(name)));
		repo.findAll().forEach(System.out::println);
	}

}
