package com.api.book.bookrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.book.bookrestapi.entities.Book;

@Repository
public interface BookRespository extends CrudRepository<Book,Integer> {  
   
}
