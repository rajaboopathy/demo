package com.example.demo.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookResource {

    @GetMapping("/books")
    public BookWrapper getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(getBook(123L));
        books.add(getBook(3434L));
        books.add(getBook(456L));
        books.add(getBook(358L));
        BookWrapper bookWrapper = new BookWrapper();
        bookWrapper.setBookList(books);
        return bookWrapper;
    }

    @GetMapping("/books/{bookId}")
    public Book retrieveABook(@PathVariable Long bookId) {
        Book book = getBook(bookId);
        return book;
    }

    private Book getBook(@PathVariable Long bookId) {
        Book book = new Book();
        book.setId(bookId);
        book.setAuthor("Raja Boopathy");
        book.setName("Spring boot");
        book.setVersion("5");
        return book;
    }
}
