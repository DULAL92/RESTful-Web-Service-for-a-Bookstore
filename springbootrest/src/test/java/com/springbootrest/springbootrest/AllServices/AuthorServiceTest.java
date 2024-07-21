package com.springbootrest.springbootrest.AllServices;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootrest.springbootrest.AllServices.AuthorService;
import com.springbootrest.springbootrest.AllServices.authorServiceImpl;
import com.springbootrest.springbootrest.Dao.AuthorDao;
import com.springbootrest.springbootrest.entities.Author;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorServiceTest {
    
	@Autowired
	private AuthorService authorService;
	
	@MockBean
	private AuthorDao authorDao;
    
	//private Author author;
	
	@Test
	public void getAuthortest() {
		
		Author author=new Author();
		author.setId(1);
		author.setName("Dulal Adak");
		author.setEmail("adak@gmail.com");
		
		Author author1=new Author();
		author1.setId(2);
		author1.setName("Dulal Adak");
		author1.setEmail("adak@gmail.com");
		
		List<Author> list=new ArrayList<Author>();
		list.add(author);
		list.add(author1);
		
		Mockito.when(authorDao.findAll()).thenReturn(list);
		assertThat(authorService.getAuthors()).isEqualTo(list);	
		
	}
	
	@Test
	public void addAuthorTest() {
		Author author=new Author();
		author.setId(6);
		author.setName("Dulal Adak");
		author.setEmail("ffff@gmail.com");
		
		Mockito.when(authorDao.save(author)).thenReturn(author);
		assertThat(authorService.addAuthor(author)).isEqualTo(author);
	}
	
	@Test
	public void deleteByIdTest() {
		
		doNothing().when(authorDao).deleteById(4L);

		authorDao.deleteById(4L);

        verify(authorDao, times(1)).deleteById(4L);
	}

	@Test
	public void getAuthortestById() {
		Author author=new Author();
		author.setId(4L);
		author.setName("Amal Adak");
		author.setEmail("Amal@gmail.com");
		Optional<Author> foundAuthor = authorDao.findById(4L);
		
		Mockito.when(authorDao.findById(4L)).thenReturn(foundAuthor);
		
		assertThat(authorService.getAuthor(4L)).isEqualTo(foundAuthor);
       
	}

	
	@Test
	public void patchAuthorTest() {
		Author author=new Author();
		author.setId(4L);
		author.setName("Dulal Adak");
		author.setEmail("ffff@gmail.com");
		
		when(authorDao.findById(4L)).thenReturn(Optional.of(author));
        when(authorDao.save(any(Author.class))).thenReturn(author);

        Author result = authorService.patchAuthor(4L, author);

        assertThat(result).isEqualTo(author);

        verify(authorDao, times(1)).findById(4L);
        verify(authorDao, times(1)).save(any(Author.class));
		
	}
	
	@Test
	public void UpdateAuthorTest() {
		Author author=new Author();
		author.setId(6);
		author.setName("Dulal Adak");
		author.setEmail("ffff@gmail.com");
		
		Mockito.when(authorDao.save(author)).thenReturn(author);
		assertThat(authorService.UpdateAuthor(author)).isEqualTo(author);
	}
	
	
}
