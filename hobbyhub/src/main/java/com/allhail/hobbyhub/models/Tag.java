package com.allhail.hobbyhub.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Tag extends BaseModel {
	
	public Tag() {	}
	
	@Id
	@GeneratedValue
	@Column(name = "tag_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="event_id")
	@JsonBackReference
	private Event event;
	
	@ManyToOne
	@JoinColumn(name="hobby_id")
	@JsonBackReference
	private Hobby hobby;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}
}
