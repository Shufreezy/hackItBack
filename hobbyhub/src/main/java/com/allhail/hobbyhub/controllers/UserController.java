package com.allhail.hobbyhub.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allhail.hobbyhub.dao.UserRepository;
import com.allhail.hobbyhub.models.User;

@RestController
public class UserController {
	private final UserRepository repo;
	
	public UserController(UserRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping("/get-users")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<User> getUsers() {
		return repo.findAll();
	}
	
	@GetMapping("/get-user/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public User getUser(long id) {
		return repo.findOne(id);
	}
}
