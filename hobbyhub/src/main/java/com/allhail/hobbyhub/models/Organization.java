package com.allhail.hobbyhub.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organization extends BaseModel {
	
	public Organization() {}
	
	@Id
	@GeneratedValue
	@Column(name = "organization_id")
	private Long id;
	
	private String name;
	
	private String address;
	
	private String description;
	
	private String link;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

	public Organization(String name, String address, String description, String link, String email) {
		super();
		this.name = name;
		this.address = address;
		this.description = description;
		this.link = link;
		this.email = email;
	}
}
