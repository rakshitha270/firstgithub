package com.hibernate.project1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	

	public User(int user_id, String user_fname, String user_lname, String user_email) {
		this.user_id = user_id;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_email = user_email;
	}

	@Id 
	@Column(name="user_id")
	int user_id;
	
	@Column(name="user_fname")
	String user_fname;
	
	@Column(name="user_lname")
	String user_lname;
	
	@Column(name="user_email")

	String user_email;
}
