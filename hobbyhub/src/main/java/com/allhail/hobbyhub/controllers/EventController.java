package com.allhail.hobbyhub.controllers;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allhail.hobbyhub.dao.AffiliationRepository;
import com.allhail.hobbyhub.dao.EventRepository;
import com.allhail.hobbyhub.models.Affiliation;
import com.allhail.hobbyhub.models.Event;

@RestController
public class EventController {
	private final EventRepository repo;
	private final AffiliationRepository affiliationRepo;
	private Long userId;
	
	public EventController(EventRepository repo, AffiliationRepository repo2) {
		this.repo = repo;
		this.affiliationRepo = repo2;
	}
	
	@GetMapping("/get-events/{userid}")
	@CrossOrigin(origins = "http://localhost:8080")
	public Collection<Event> getEvents(@PathVariable("userid") Long userId) {
		this.userId = userId;
		return repo
				.findAll()
				.stream()
				.filter(this::isViewable)
				.collect(Collectors.toList());
	}
	
	private boolean isViewable(Event event) {
		boolean isAffiliated = false;
		if (!event.getPrivacy()) {
			isAffiliated = true;
		} else if (event.getUser().getId() == userId) {
			for (Affiliation a : affiliationRepo.findAll()) {
				if (a.getOrganization().getId() == event.getOrganization().getId()) {
					isAffiliated = true;
					break;
				}
			}
		}
		return isAffiliated;
	}
	
//	@RequestMapping(value = "/get-event/{userid}", method = RequestMethod.GET)
//	@CrossOrigin(origins = "http://localhost:8080")
//	public User getUser(@PathVariable("userid") Long id) {
//	}
//	
//	@PostMapping("/add-user")
//	public boolean addUser(User user) {
//		repo.save(new User(user.getName()));
//		return true;
//	}
}
