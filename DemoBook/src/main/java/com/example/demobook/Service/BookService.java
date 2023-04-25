package com.example.demobook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demobook.Repository.BookRepository;
import com.example.demobook.model.Book;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	public List<Book>getAllBook()
	{
		List<Book> bookList=bookRepository.findAll();
		return bookList;
	}
	public Book saveBook(Book b)
	{
		 Book obj=bookRepository.save(b);
		 return obj;
		 //return studRepository.save(s);
	}
	public Book updateBook(Book b)
	{
		 Book obj=bookRepository.save(b);
		 return obj;
		 //return studRepository.save(s);
	}
	public void deleteBook(int bookNo)
	{
		 bookRepository.deleteById(bookNo);
	}
	public Book getBook(int bookNo)
	{
		 Book b=bookRepository.findById(bookNo).get();
		 return b;
	}
}
