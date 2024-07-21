package com.springbootrest.springbootrest.AllServices;
import java.util.List;
import java.util.Optional;
import com.springbootrest.springbootrest.entities.Author;
public interface AuthorService {
	public List<Author> getAuthors();
	
	public Optional<Author> getAuthor(long id);
	
	public Author addAuthor(Author author);
	
	public Author patchAuthor(long id, Author author);
	
	public Author UpdateAuthor(Author author);
	
	public void DeleteAuthor(long id);
	
}
