package com.library.main;

import java.util.Date;
//This Class is Used to hold the checkOut details along with Books and DVDS.
public class CheckedOutItems {

	private long iSBN;
	private String imgSource;
	private String title;
	private String username;
	private String type;
	private Date dueDate;
	
	public CheckedOutItems(long iSBN, String imgSource, String title, String username, String type, Date dueDate) {
		super();
		this.iSBN = iSBN;
		this.imgSource = imgSource;
		this.title = title;
		this.username = username;
		this.type = type;
		this.dueDate = dueDate;
	}

	public CheckedOutItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public long getiSBN() {
		return iSBN;
	}

	public void setiSBN(long iSBN) {
		this.iSBN = iSBN;
	}

	public String getImgSource() {
		return imgSource;
	}

	public void setImgSource(String imgSource) {
		this.imgSource = imgSource;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
