package com.allhail.hobbyhub.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

interface BaseModel {
	
	public final Long _id;
	@JsonIgnore
	public final Date date_created;
	@JsonIgnore
	public final Date date_updated;
	
	public final Boolean deleted;
	
}
