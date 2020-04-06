package com.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
@Entity
public class LibraryBook {

	@Id 
	private long ISBN;
	private String imgSrc;
	private String bTitle;
	private String author;
	private int bCopies;
	private String illustrator;
	
	public LibraryBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibraryBook(long iSBN, String imgSrc, String bTitle, String author, int bCopies, String illustrator) {
		super();
		ISBN = iSBN;
		this.imgSrc = imgSrc;
		this.bTitle = bTitle;
		this.author = author;
		this.bCopies = bCopies;
		this.illustrator = illustrator;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		this.ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getbCopies() {
		return bCopies;
	}

	public void setbCopies(int bCopies) {
		this.bCopies = bCopies;
	}

	public String getIllustrator() {
		return illustrator;
	}

	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}
		
}
