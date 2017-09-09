package com.allhail.hobbyhub.models;

import java.util.Date;
import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseModel {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@JsonIgnore
	private Date dateCreated = Calendar.getInstance().getTime();
	
	@JsonIgnore
	private Date dateUpdated = Calendar.getInstance().getTime();
	
	private Boolean deleted = false;
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
