package com.example.bookdemo.service;

import com.example.bookdemo.model.Book;
import com.example.bookdemo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBookInfo(Book book) {
        return bookRepository.findById(book.getId())
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }
}
