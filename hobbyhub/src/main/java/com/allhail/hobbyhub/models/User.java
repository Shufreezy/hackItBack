package com.allhail.hobbyhub.models;

public class User extends BaseModel  {
	
	private String name;
	
	private String pic;
	
	private Boolean subscribe;
	
	private String email;
	
	private String contactNo;
	
	public User(String name, String pic, Boolean subscribe, String email, String contactNo) {
		super();
		this.name = name;
		this.pic = pic;
		this.subscribe = subscribe;
		this.email = email;
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Boolean getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
