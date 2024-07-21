package com.springbootrest.springbootrest.AllServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.springbootrest.Dao.AuthorDao;
import com.springbootrest.springbootrest.entities.Author;

@Service
public class authorServiceImpl implements AuthorService {
	@Autowired
	private AuthorDao authorDao;
	
	
 //===============================Author===============================
	@Override
	public List<Author> getAuthors() {
	
		return authorDao.findAll();
	}

	@Override
	public Optional<Author> getAuthor(long id) {
		return authorDao.findById(id);
	}

	@Override
	public Author addAuthor(Author author) {
		authorDao.save(author);
		return author;
	}

	@Override
	public Author UpdateAuthor(Author author) {
		authorDao.save(author);
		return author;
	}

	@Override
	public void DeleteAuthor(long id) {
		authorDao.deleteById(id);
	}

	@Override
	public Author patchAuthor(long id, Author author) {
		
		return	authorDao.findById(id).map(existingAuthor -> {
            if (author.getName() != null) {
                existingAuthor.setName(author.getName());
            }
            if (author.getEmail() != null) {
                existingAuthor.setEmail(author.getEmail());
            }
            return authorDao.save(existingAuthor);
        }).orElseThrow(() -> new RuntimeException("Author not found"));
	
	

	
	}	

}
