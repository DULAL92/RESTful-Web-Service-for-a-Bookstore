package com.springbootrest.springbootrest.AllServices;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootrest.springbootrest.Dao.AuthorDao;
import com.springbootrest.springbootrest.Dao.BookDao;
import com.springbootrest.springbootrest.entities.Author;
import com.springbootrest.springbootrest.entities.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {
	
	@Autowired
	private BookService bookService;
	
	@MockBean
	private BookDao bookDao;
	
	
	@Test
	public void getBooksTest() {
		
		Book book=new Book();
		book.setId(2L);
		book.setTitle("Java programing");
		book.setIsbn("123S");
		book.setAuthorId(2L);
		
		Book book1=new Book();
		book.setId(2L);
		book.setTitle("C programing");
		book.setIsbn("123S455");
		book.setAuthorId(2L);
		
		List<Book> list=new ArrayList<Book>();
		list.add(book);
		list.add(book1);
		
		Mockito.when(bookDao.findAll()).thenReturn(list);
		assertThat(bookService.getBooks()).isEqualTo(list);	
		
	}
	
	@Test
	public void addBooksTest() {
		Book book=new Book();
		book.setId(2L);
		book.setTitle("Java programing");
		book.setIsbn("123S");
		book.setAuthorId(2L);
		
		Mockito.when(bookDao.save(book)).thenReturn(book);
		assertThat(bookService.addBooks(book)).isEqualTo(book);
	}
	
	
	
	@Test
	public void deleteBookByIdTest() {
		
		doNothing().when(bookDao).deleteById(4L);

		bookDao.deleteById(4L);

        verify(bookDao, times(1)).deleteById(4L);
	}
	
	
	@Test
	public void getBooksByTest() {
		Book book=new Book();
		book.setId(1L);
		book.setTitle("Java programing");
		book.setIsbn("123S");
		book.setAuthorId(2L);
		Optional<Book> foundBook = bookDao.findById(1L);
		
		Mockito.when(bookDao.findById(4L)).thenReturn(foundBook);
		
		assertThat(bookService.getBooks(4L)).isEqualTo(foundBook);
       
	}
	
	@Test
	public void UpdateBookTest() {
		Book book=new Book();
		book.setId(2L);
		book.setTitle("Java programing");
		book.setIsbn("123S");
		book.setAuthorId(2L);
		
		Mockito.when(bookDao.save(book)).thenReturn(book);
		assertThat(bookService.UpdateBooks(book)).isEqualTo(book);
	}
	

}
