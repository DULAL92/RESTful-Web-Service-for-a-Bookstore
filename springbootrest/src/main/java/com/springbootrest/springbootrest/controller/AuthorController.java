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
import com.springbootrest.springbootrest.AllServices.AuthorService;
import com.springbootrest.springbootrest.entities.Author;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	//Retrieve all authors
	@GetMapping("/authors")
	public List<Author> getAuthors(){
		return this.authorService.getAuthors();
		
	}
	
	//Retrieve an author by ID
	@GetMapping("/authors/{id}")
	public Optional<Author> getAuthor(@PathVariable String id){
		return this.authorService.getAuthor(Long.parseLong(id));
		
	}
	
	//Create a new author
	@PostMapping("/authors")
	public Author addAuthor(@RequestBody Author author) {
		
		return this.authorService.addAuthor(author);
	}
	
	//Partially update an existing author
	@PatchMapping("/authors/{id}")
    public Author patchAuthor(@PathVariable String id,@RequestBody Author author) {
		return this.authorService.patchAuthor(Long.parseLong(id),author);
	}
	
	//Update an existing author
	@PutMapping("/authors/{id}")
    public Author UpdateAuthor(@RequestBody Author author) {
		
		return this.authorService.UpdateAuthor(author);
	}
	
	//Delete an author
	@DeleteMapping("/authors/{id}")
    public ResponseEntity<HttpStatus> DeleteAuthor(@PathVariable String id) {
		
		try {
			 this.authorService.DeleteAuthor(Long.parseLong(id));
			 return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

}
