package com.springbootrest.springbootrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrest.AllServices.BookService;
import com.springbootrest.springbootrest.entities.Book;

@RestController
public class BookController {
	@Autowired
	private BookService bookservice;

	
	//Retrieve all book
		@GetMapping("/books")
		public List<Book> getBooks(){
			return this.bookservice.getBooks();
			
		}
		
//		//Retrieve an book by ID
		@GetMapping("/books/{id}")
		public Optional<Book> getBooks(@PathVariable String id){
			return this.bookservice.getBooks(Long.parseLong(id));
			
		}
		
		//Create a new book
		@PostMapping("/books")
		public Book addBooks(@RequestBody Book book) {
			return this.bookservice.addBooks(book);
		}
		
		//Partially update an existing book
		@PatchMapping("/books/{id}")
	    public Book patchBook(@PathVariable String id,@RequestBody Book book) {
			
			return this.bookservice.patchBook(Long.parseLong(id),book);
		}
		
		//Update an existing book
		@PutMapping("/books/{id}")
	    public Book UpdateBooks(@RequestBody Book book) {
			
			return this.bookservice.UpdateBooks(book);
		}
		
		//Delete an book
		@DeleteMapping("/books/{id}")
	    public ResponseEntity<HttpStatus> DeleteBooks(@PathVariable String id) {
			
			try {
				 this.bookservice.DeleteBooks(Long.parseLong(id));
				 return new ResponseEntity<>(HttpStatus.OK);
				
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		
	
	

}
