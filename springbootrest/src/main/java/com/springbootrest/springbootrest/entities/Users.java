package com.springbootrest.springbootrest.entities;

public class Users {

	private long id;
	private String name;
	private String username;
	private String passowrd;
	
	
	public Users(long id, String username, String passowrd,String name) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.passowrd = passowrd;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", passowrd=" + passowrd + "]";
	}
	
	
	
}
