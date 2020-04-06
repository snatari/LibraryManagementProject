package com.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DVD {

	@Id
	private String dTitle;
	private String imgSource;

	private String author;
	private int dCopies;
	private String vRating;
	
	public DVD(String dTitle, String imgSource, String author, int dCopies, String vRating) {
		super();
		this.dTitle = dTitle;
		this.imgSource = imgSource;
		this.author = author;
		this.dCopies = dCopies;
		this.vRating = vRating;
	}

	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getvRating() {
		return vRating;
	}

	public void setvRating(String vRating) {
		this.vRating = vRating;
	}
	public String getImgSource() {
		return imgSource;
	}

	public void setImgSource(String imgSource) {
		this.imgSource = imgSource;
	}
	public String getdTitle() {
		return dTitle;
	}

	public void setdTitle(String dTitle) {
		this.dTitle = dTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getdCopies() {
		return dCopies;
	}

	public void setdCopies(int dCopies) {
		this.dCopies = dCopies;
	}
	
	
}
