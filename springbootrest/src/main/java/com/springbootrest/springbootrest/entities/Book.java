package com.springbootrest.springbootrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private Long id;
	private String title;
	private String isbn;
	private Long authorId;
	
	
	
	public Book(long id, String title, String isbn, Long authorId) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.authorId = authorId;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", authorId=" + authorId + "]";
	}
	
	

}
