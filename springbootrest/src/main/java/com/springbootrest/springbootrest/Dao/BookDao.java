package com.springbootrest.springbootrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrest.springbootrest.entities.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

}
