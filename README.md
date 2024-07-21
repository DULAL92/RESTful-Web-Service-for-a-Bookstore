# RESTful-Web-Service-for-a-Bookstore
Create a RESTful web service for a simple bookstore management system. This service should allow users to manage books and authors. The service should support basic CRUD operations, partial updates, and proper data persistence.
## Installation
   Steps to install your project:
   ```bash
   git clone https://github.com/yourusername/project-name.git
   cd project-name




# Usage
    Access the API at http://localhost:9090.
      1. Create a Spring Boot project with the following entities:
        • Author: id, name, email
        • Book: id, title, isbn, authorId
     2. Endpoints:
       • Authors:
         o GET /authors - Retrieve all authors
         o GET /authors/{id} - Retrieve an author by ID
         o POST /authors - Create a new author
         o PATCH /authors/{id} - Partially update an existing author
         o PUT /authors/{id} - Update an existing author
         o DELETE /authors/{id} - Delete an author
     • Books:
        o GET /books - Retrieve all books
        o GET /books/{id} - Retrieve a book by ID
        o POST /books - Create a new book
        o PUT /books/{id} - Update an existing book
        o PATCH /books/{id} - Partially update an existing book
        o DELETE /books/{id} - Delete a book



# Tools & Technologies:
   o Java 11+
   o Spring Boot 2.5+
   o Spring Data JPA
   o JUnit 5
   o Mockito
   o Maven or Gradle
   o MySQL/PostgreSQL database


