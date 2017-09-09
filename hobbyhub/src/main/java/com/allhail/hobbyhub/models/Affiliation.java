package com.allhail.hobbyhub.models;

import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Affiliation extends BaseModel {
	
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;
	
	@JoinColumn(name="organization_id")
	@JsonBackReference
	private Organization organization;
}
