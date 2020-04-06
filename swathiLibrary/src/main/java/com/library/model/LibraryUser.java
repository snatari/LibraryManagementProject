package com.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LibraryUser {

	private String uName;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long uID;
	private String password;
	private String fName;
	private String lName;
	private String addLine1;
	private String addLine2;
	private String aptNo;
	private String city;
	private int zipCode;
	private Date dob;
	private String email;
	private long phoneNo;
	private String usrType;
	
	public LibraryUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibraryUser(String uName, Long uID, String password, String fName, String lName, String addLine1, String addLine2,
			String aptNo, String city, int zipCode, Date dob, String email, long phoneNo, String usrtype) {
		super();
		this.uName = uName;
		this.uID = uID;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.aptNo = aptNo;
		this.city = city;
		this.zipCode = zipCode;
		this.dob = dob;
		this.email = email;
		this.phoneNo = phoneNo;
		this.usrType = usrtype;
	}

	@Override
	public String toString() {
		return "LibraryUser [uName=" + uName + ", uID=" + uID + ", password=" + password + ", fName=" + fName
				+ ", lName=" + lName + ", addLine1=" + addLine1 + ", addLine2=" + addLine2 + ", aptNo=" + aptNo
				+ ", city=" + city + ", zipCode=" + zipCode + ", dob=" + dob + ", email=" + email + ", phoneNo="
				+ phoneNo + ", type=" + usrType + "]";
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Long getuID() {
		return uID;
	}

	public void setuID(Long uID) {
		this.uID = uID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getAptNo() {
		return aptNo;
	}

	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUsrType() {
		return usrType;
	}

	public void setUsrType(String type) {
		this.usrType = type;
	}
	
	
	
}
