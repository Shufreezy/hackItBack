package com.allhail.hobbyhub.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hobby extends BaseModel {
	
	public Hobby() {}
	
	@Id
	@GeneratedValue
	@Column(name = "hobby_id")
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	private String name;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Hobby(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}
