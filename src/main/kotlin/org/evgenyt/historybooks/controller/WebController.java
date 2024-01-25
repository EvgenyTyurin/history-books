package org.evgenyt.historybooks.controller;

import org.evgenyt.historybooks.model.Book;
import org.evgenyt.historybooks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class WebController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/books")
    void createBook(@RequestBody Book book) {
        book.setId(UUID.randomUUID());
        bookRepository.save(book);
    }

    @GetMapping("/books")
    List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
