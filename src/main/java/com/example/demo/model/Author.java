package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Author 
{
	@Id
	@GeneratedValue
	private long id;
	
	private String firstname;
	private String lastname;
	
	
	@OneToMany
	@JoinColumn(name="id") 
	private List<Post>post;
	 
	
	public List<Post> getPost() {
		return post;
	}
	public void setPost(List<Post> post) {
		this.post = post;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
