package com.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryEvents {

	@Id
	private String eName;
	private Date eDate;
	private String ageGroup;
	private String duration;
	private String eLocation;
	
	public LibraryEvents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibraryEvents(String eName, Date eDate, String ageGroup, String duration, String eLocation) {
		super();
		this.eName = eName;
		this.eDate = eDate;
		this.ageGroup = ageGroup;
		this.duration = duration;
		this.eLocation = eLocation;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Date geteDate() {
		return eDate;
	}

	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String geteLocation() {
		return eLocation;
	}

	public void seteLocation(String eLocation) {
		this.eLocation = eLocation;
	}
	
	
	
}
