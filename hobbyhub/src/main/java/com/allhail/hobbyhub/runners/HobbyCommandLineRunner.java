package com.allhail.hobbyhub.runners;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.allhail.hobbyhub.dao.HobbyRepository;
import com.allhail.hobbyhub.models.Hobby;

@Component
public class HobbyCommandLineRunner implements CommandLineRunner {
	private final HobbyRepository repository;
	
	public HobbyCommandLineRunner(HobbyRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		Stream.of(new Hobby("Basketball", "For basketball enthusiasts only!"),
				new Hobby("Movies", "Want to see the latest movies?"),
					new Hobby("C++", "References and Pointers"),
					new Hobby("Java", "We Java because we can't see sharp")).forEach(obj -> repository.save(obj));
		repository.findAll().forEach(System.out::println);
	}
}