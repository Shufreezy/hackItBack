package com.allhail.hobbyhub.runners;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.allhail.hobbyhub.dao.EventRepository;
import com.allhail.hobbyhub.models.Event;

@Component
public class EventCommandLineRunner implements CommandLineRunner {

	private final EventRepository repo;
	
	public EventCommandLineRunner(EventRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// Create dummy list of events
		Stream
			.of(new Event(), new Event())
			.forEach(obj -> repo.save(obj));
		repo.findAll().forEach(System.out::println);
	}

}
