package com.allhail.hobbyhub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Event extends BaseModel {
	
	public Event() {}
	
	@Id
	@GeneratedValue
	@Column(name = "event_id")
	private Long id;
	
	private Date dateStart;
	private Date dateEnd;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	private String name;
	private String description;
	private String pic;
	private Double fee;
	private Boolean privacy;
	
	@ManyToOne
	@JoinColumn(name="organization_id")
	@JsonBackReference
	private Organization organization;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	@JsonBackReference
	private Location location;
	
	public Date getDateStart() {
		return dateStart;
	}
	
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	
	public Date getDateEnd() {
		return dateEnd;
	}
	
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
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
	
	public String getPic() {
		return pic;
	}
	
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public Double getFee() {
		return fee;
	}
	
	public void setFee(Double fee) {
		this.fee = fee;
	}
	
	public Boolean getPrivacy() {
		return privacy;
	}
	
	public void setPrivacy(Boolean privacy) {
		this.privacy = privacy;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
