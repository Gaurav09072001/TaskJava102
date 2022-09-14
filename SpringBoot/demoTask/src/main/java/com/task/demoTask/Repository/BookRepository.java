package com.task.demoTask.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.demoTask.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

}
