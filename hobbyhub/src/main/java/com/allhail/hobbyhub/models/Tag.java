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
}
