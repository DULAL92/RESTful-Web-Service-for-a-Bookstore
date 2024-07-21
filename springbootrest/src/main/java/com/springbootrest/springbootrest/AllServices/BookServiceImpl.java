package com.springbootrest.springbootrest.AllServices;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootrest.springbootrest.Dao.BookDao;
import com.springbootrest.springbootrest.entities.Book;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookdao;

	@Override
	public List<Book> getBooks() {
		return bookdao.findAll();
	}

	@Override
	public Optional<Book> getBooks(long id) {
		return bookdao.findById(id);
	}

	@Override
	public Book addBooks(Book book) {
		System.out.println(book);
		bookdao.save(book);
        return book;
	}

	@Override
	public Book UpdateBooks(Book book) {
		bookdao.save(book);
		return book;
	}

	@Override
	public void DeleteBooks(long id) {
		bookdao.deleteById(id);
		
	}

	
	@Override
	public Book patchBook(long id, Book book) {
		return	bookdao.findById(id).map(existingAuthor -> {
            if (book.getTitle() != null) {
                existingAuthor.setTitle(book.getTitle());
            }
            if (book.getIsbn() != null) {
                existingAuthor.setIsbn(book.getIsbn());
            }
            return bookdao.save(existingAuthor);
        }).orElseThrow(() -> new RuntimeException("Book not found"));
		
		
	}


}
