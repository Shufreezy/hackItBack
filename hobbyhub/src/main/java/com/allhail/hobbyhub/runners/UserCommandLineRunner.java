package com.allhail.hobbyhub.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.allhail.hobbyhub.dao.UserRepository;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private final UserRepository repo;
	
	public UserCommandLineRunner(UserRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// Create dummy list of users
	}

}
