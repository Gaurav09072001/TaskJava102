package com.task.demoTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.task.demoTask.model.Book;
import com.task.demoTask.service.BookService;


@RestController
public class bookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/book")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	
	@RequestMapping("/book/{id}")
	public Book getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}
	@PostMapping("/Book")
	public void addBook(@RequestBody Book Book ) {
		bookService.addBook(Book);
	}
	@PutMapping("/bookName/{id}")
	public void updateBook(@RequestBody  Book Book ,@PathVariable String id ) {
		bookService.updateBook(Book,id);
	}
	@DeleteMapping("/Book/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.delete(id);
	}
}
