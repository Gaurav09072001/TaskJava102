package com.task.demoTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.demoTask.Repository.BookRepository;
import com.task.demoTask.model.Book;


@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getAllBook(){
		List<Book> bookDataList = new ArrayList<>();
		bookRepository.findAll().forEach(bookDataList::add);
		return bookDataList;
	}
	public Book getBook(String bookId) {
		return bookRepository.findById(bookId).get();
	}
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	public void updateBook(Book book,String id) {
		bookRepository.save(book);
	}
	public void delete(String id) {
		bookRepository.deleteById(id);
	}
}
