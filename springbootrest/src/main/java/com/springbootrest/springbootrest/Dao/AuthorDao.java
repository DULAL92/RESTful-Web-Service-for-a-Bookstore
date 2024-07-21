package com.springbootrest.springbootrest.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrest.springbootrest.entities.Author;
@Repository
public interface AuthorDao extends JpaRepository<Author, Long> {


}
