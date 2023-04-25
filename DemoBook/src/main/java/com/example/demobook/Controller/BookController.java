package com.example.demobook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demobook.Service.BookService;
import com.example.demobook.model.Book;

@RestController
public class BookController {
	@Autowired
	  BookService bookService;
	  @GetMapping(value="/fetchEmployee")
	  public List<Book> getAllEmployee()
	  {
		  List<Book> bookList=bookService.getAllBook();
		  return bookList;
	  }
	  @PostMapping(value="/saveBook")
	  public Book saveEmployee(@RequestBody Book b)
	  {
	 	 return bookService.saveBook(b);
	  }
	  @PutMapping(value="/updateBook")
	  public Book updateStudent(@RequestBody Book b)
	  {
	 	 return bookService.saveBook(b);
	  }
	  @DeleteMapping("/deleteBook/{bno}")
	 	 public void deleteStudent(@PathVariable("bno") int bookNo)
	 	 {
	 		 bookService.deleteBook(bookNo);
	 	 }

	 @GetMapping(value="/getBook/{bno}")
	 public Book getBook(@PathVariable("bno") int bookNo)
	 {
	 	return bookService.getBook(bookNo);
	 }
}
