package com.task.demoTask.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private String bookId;
	
    public Book(String bookId, String bookName, String bookDescription) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
	}
	private String bookName;
    private String bookDescription;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public Book() {}
}