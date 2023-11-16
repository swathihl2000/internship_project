package com.appstronauts.bugtracker.bugmanagement.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="BUG_CREATION")
@SequenceGenerator(sequenceName = "BUG_SEQUENCE",initialValue = 1, name = "MyBugTrackingSequence",allocationSize = 1)
public class BugCreation {

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="MyBugTrackingSequence"  )
	@Column(name="ID")
	private int id;
	
	@Column(name= "USER_ID") 
    private int user_id;
	
	@Column(name="BUG_NAME")
	private String bug_name;
	
	@Column(name="BUG_DESCRTIPTION")
	private String bug_description;
	
	@Column(name="BUG_TYPE")
	private String bug_type;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getBug_name() {
		return bug_name;
	}

	public void setBug_name(String bug_name) {
		this.bug_name = bug_name;
	}

	public String getBug_description() {
		return bug_description;
	}

	public void setBug_description(String bug_description) {
		this.bug_description = bug_description;
	}

	public String getBug_type() {
		return bug_type;
	}

	public void setBug_type(String bug_type) {
		this.bug_type = bug_type;
	}
}



