package com.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CheckOut {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long checkoutId;
	private String type;
	private Date dueDate;
	private String dTitle;
	private String mTitle;
	private long iSBN;
	private String username;
	
	public CheckOut() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckOut(long checkoutId, String type, Date dueDate, String dTitle, String mTitle, long iSBN, String username) {
		super();
		this.checkoutId = checkoutId;
		this.type = type;
		this.dueDate = dueDate;
		this.dTitle = dTitle;
		this.mTitle = mTitle;
		this.iSBN = iSBN;
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(long checkoutId) {
		this.checkoutId = checkoutId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getdTitle() {
		return dTitle;
	}

	public void setdTitle(String dTitle) {
		this.dTitle = dTitle;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public long getISBN() {
		return iSBN;
	}

	public void setISBN(long iSBN) {
		this.iSBN = iSBN;
	}



	
	
}
