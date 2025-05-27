package com.example.bookdemo.controller;

import com.example.bookdemo.model.Book;
import com.example.bookdemo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("book-demo")
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping
    public Book findBookById(@RequestParam Long id) {
        return bookService.findBookById(id);
    }

    @PutMapping
    public Book updateBookInfo(@RequestBody Book book) {
        return bookService.updateBookInfo(book);
    }

    @DeleteMapping("{id}")
    public void deleteStudentById(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }
}
