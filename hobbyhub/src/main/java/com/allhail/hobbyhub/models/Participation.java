package com.allhail.hobbyhub.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Participation {

	@Id
	@GeneratedValue
	@Column(name = "participation_id")
	private Long id;

	@JoinColumn(name="event_id")
	@JsonBackReference
	private Event event;
	
	@JoinColumn(name="affiliation_id")
	@JsonBackReference
	private Affiliation affiliation;
	
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;

}
