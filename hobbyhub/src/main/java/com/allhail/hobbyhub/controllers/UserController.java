package com.allhail.hobbyhub.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@CrossOrigin(origins = "http://localhost:8080")
	public Collection<User> getUsers() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/get-user/{id}", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:8080")
	public User getUser(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	@PostMapping("/add-user")
	public boolean addUser(User user) {
		repo.save(new User(user.getName()));
		return true;
	}
}
