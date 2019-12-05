package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private int id;
	public User(@JsonProperty("id") int id,@JsonProperty("name") String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("user");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
