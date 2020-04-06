package com.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hold {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long holdId;
	private String type;
	private Date availDate;
	private String dTitle;
	private String mTitle;
	private long iSBN;
	private String username;

	public Hold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hold(long holdId, String type, Date availDate, String dTitle, String mTitle, long iSBN,
			String username) {
		super();
		this.holdId = holdId;
		this.type = type;
		this.availDate = availDate;
		this.dTitle = dTitle;
		this.mTitle = mTitle;
		this.iSBN = iSBN;
		this.username = username;
	}

	public long getHoldId() {
		return holdId;
	}

	public void setHoldId(long holdId) {
		this.holdId = holdId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getAvailDate() {
		return availDate;
	}

	public void setAvailDate(Date availDate) {
		this.availDate = availDate;
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

	public long getiSBN() {
		return iSBN;
	}

	public void setiSBN(long l) {
		this.iSBN = l;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	
}
