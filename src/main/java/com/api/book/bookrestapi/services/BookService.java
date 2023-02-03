package com.api.book.bookrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bookrestapi.entities.Book;
import com.api.book.bookrestapi.repository.BookRespository;

@Service
public class BookService {

    // private static List<Book> list = new ArrayList<>();

    // static {
    //     list.add(new Book(111, "Java Refrenece Book", "ABC"));
    //     list.add(new Book(222, "Python reference book", "XYZ"));
    //     list.add(new Book(333, " React js refernce book", "LMN"));
    // }

    // // get all books
    // public List<Book> getAllBooks() {
    //     return list;
    // }

    // public Book getBookById(Integer id) {

    //     Book book = null;

    //     try {
    //         list.stream().filter(e -> e.getId() == id).findFirst().get();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return book;
    // }

    // public Book addBook(Book book) {
    //     list.add(book);
    //     return book;
    // }

    // public void deleteBook(Integer bookId) {
    //     list = list.stream().filter(book -> {
    //         if (book.getId() != bookId) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     }).collect(Collectors.toList());
    // }

    // public void updateBook(Book book, Integer bookId) {
    //     list = list.stream().map(b -> {
    //         if (b.getId() == bookId) {
    //             b.setTitle(book.getTitle());
    //             b.setAuthor(book.getAuthor());
    //         }
    //         return b;
    //     }).collect(Collectors.toList());
    // }



     @Autowired
     private BookRespository bookRespository;
    // get all books
    
    public List<Book> getAllBooks() {
        List<Book> list=(List<Book>)this.bookRespository.findAll();
        return list;
    }

    public Book getBookById(Integer id) {
        Book book = null;
        try {
            // list.stream().filter(e -> e.getId() == id).findFirst().get();
            book=this.bookRespository.findById(id).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book book) {
       Book result=this.bookRespository.save(book);
        return result;
    }

    public void deleteBook(Integer bookId) {
        this.bookRespository.deleteById(bookId);
    }

    public void updateBook(Book book, Integer bookId) {
       book.setId(bookId);
    this.bookRespository.save(book); 
    }


}
