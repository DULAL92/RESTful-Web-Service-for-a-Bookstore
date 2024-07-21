# RESTful-Web-Service-for-a-Bookstore
Create a RESTful web service for a simple bookstore management system. This service should allow users to manage books and authors. The service should support basic CRUD operations, partial updates, and proper data persistence.

# Requirements
For development, you will need git,Java 11+ ,Spring Boot 2.5+ ,Spring Data JPA, JUnit 5 ,Mockito, Maven, MySQL database installed in your environment.

# Getting Started
1. Setting Up Your Local Clone
    Before you begin working on anything, make sure you follow these steps in order to set up a clone on your local machine:

    Clone this repo to your local machine with one of the commands below.

      # If you have SSH set up with Git:
       git clone git@github.com:Dev-Sisyphus/Event-Management.git
      # Otherwise for HTTPS:
       git clone https://github.com/Dev-Sisyphus/Event-Management.git
       cd into the directory of your local clone.
2. # Installation
     Installs Java 11+, Postman ,Spring Boot 2.5+ ,Spring Data JPA, JUnit 5 ,Mockito, Maven, MySQL
     And put dependencies such as org.spring-boot-starter-we, org.spring-boot-starter-data-jpa, org.junit.jupiter, com.mysql,com.h2database,spring-boot-starter-test,org.junit.vintage, 
     and org.mockito

4. # Run the Java Program
    Right click on you project->Run as->Javaapplication
        #  Automitical Two table will be created such as Auther and Book in Database
   
5. # Final Output
     # Using Postman software put bellow url link for call api
   
        # Authors:
         o GET /authors - Retrieve all authors
         o GET /authors/{id} - Retrieve an author by ID
         o POST /authors - Create a new author
         o PATCH /authors/{id} - Partially update an existing author
         o PUT /authors/{id} - Update an existing author
         o DELETE /authors/{id} - Delete an author
   
       # Books:  
        o GET /books - Retrieve all books
        o GET /books/{id} - Retrieve a book by ID
        o POST /books - Create a new book
        o PUT /books/{id} - Update an existing book
        o PATCH /books/{id} - Partially update an existing book
        o DELETE /books/{id} - Delete a book

# Junit 5 Test
 Service layer Junit5 test are done.
 How to run Test class---
    #  Right click the test class->Run as->JUnit Test




