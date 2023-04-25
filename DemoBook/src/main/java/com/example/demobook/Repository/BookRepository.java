package com.example.demobook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demobook.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>
{

}
