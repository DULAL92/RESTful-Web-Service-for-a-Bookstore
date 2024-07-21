package com.springbootrest.springbootrest.AllServices;

import java.util.List;
import java.util.Optional;

import com.springbootrest.springbootrest.entities.Book;

public interface BookService {
	
    public List<Book> getBooks();
	
	public Optional<Book> getBooks(long id);
	
	public Book addBooks(Book book);
	
	public Book patchBook(long id, Book book);
	
	public Book UpdateBooks(Book book);

	public void DeleteBooks(long id);


}
