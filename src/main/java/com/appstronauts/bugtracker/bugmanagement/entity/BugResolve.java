package com.appstronauts.bugtracker.bugmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BUG_RESOLVE")
public class BugResolve {
	
	


	@Column(name="D_ID")
	private int dId;
	
	@Id
	@Column(name="B_ID")
	private int bId;
	
	@Column(name="STATUS")
	private String status;
	
	
	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	  public BugResolve() {
		// TODO Auto-generated constructor stub
	}
	  
	  

	public BugResolve(int dId, int bId, String status) {
		
		this.dId = dId;
		this.bId = bId;
		this.status = status;
	}


}
