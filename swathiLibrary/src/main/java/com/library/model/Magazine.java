package com.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Magazine {

	@Id
	private String mTitle;
	private String imgSource;
	private String publisher;
	private int mCopies;
	private String mRating;
	
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(String mTitle,String imgSource, String publisher, int mCopies, String mRating) {
		super();
		this.mTitle = mTitle;
		this.imgSource=imgSource;
		this.publisher = publisher;
		this.mCopies = mCopies;
		this.mRating = mRating;
	}

	

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public String getImgSource() {
		return imgSource;
	}

	public void setImgSource(String imgSource) {
		this.imgSource = imgSource;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getmCopies() {
		return mCopies;
	}

	public void setmCopies(int mCopies) {
		this.mCopies = mCopies;
	}

	public String getmRating() {
		return mRating;
	}

	public void setmRating(String mRating) {
		this.mRating = mRating;
	}
	
	
	
}
