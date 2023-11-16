package com.appstronauts.bugtracker.bugmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="BUG_MANAGEMENt")
@SequenceGenerator(sequenceName = "BUGID_SEQUENCE", initialValue = 12121, name="BugSequence", allocationSize = 1)
public class BugManagement {
	
	

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="BugSequence")
	@Column(name="B_ID")
	private int bId;
	
	@Column(name="ID")
	private int id;
	
	@Column(name="BUG_NAME")
	private String bugName;
	
	@Column(name="BUG_DESCRTIPTION")
	private String bugDescription;
	
	@Column(name="ASSIGN_TO")
	private int assignTo;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="BUG_TYPE")
	private String bugType;
	
	
	public BugManagement( int id, String bugName, String bugDescription, int assignTo, String status,
			String bugType) {
		
		//this.bId = bId;
		this.id = id;
		this.bugName = bugName;
		this.bugDescription = bugDescription;
		this.assignTo = assignTo;
		this.status = status;
		this.bugType = bugType;
	}

	public BugManagement() {

	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBugName() {
		return bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	public String getBugDescription() {
		return bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	public int getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(int assignTo) {
		this.assignTo = assignTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBugType() {
		return bugType;
	}

	public void setBugType(String bugType) {
		this.bugType = bugType;
	}
	

}
