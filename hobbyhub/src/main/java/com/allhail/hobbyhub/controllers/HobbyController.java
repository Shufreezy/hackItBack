package com.allhail.hobbyhub.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allhail.hobbyhub.dao.HobbyRepository;
import com.allhail.hobbyhub.models.Hobby;

@RestController
public class HobbyController {
	private HobbyRepository repository;
	
	public HobbyController(HobbyRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/get-all-hobbies")
	@CrossOrigin(origins = "http://localhost:8080")
	public Collection<Hobby> getAllHobbies() {
		return repository.findAll();
	}
}