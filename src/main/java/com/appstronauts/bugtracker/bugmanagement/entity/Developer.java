package com.appstronauts.bugtracker.bugmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DEVELOPER")
public class Developer {
	
	
	@Id
	@Column(name="D_ID")
	private int dId;
	
	@Column(name="D_NAME")
	private String dName;
	
	@Column(name ="D_TYPE")
	private String dType;
	
	
	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdType() {
		return dType;
	}
	public void setdType(String dType) {
		this.dType = dType;
	}
	
	public Developer() {
		
	}

	public Developer(int dId, String dName, String dType) {
		
		this.dId = dId;
		this.dName = dName;
		this.dType = dType;
	}

	


}
