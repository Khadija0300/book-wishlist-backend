
package com.example.bookwishlist.controller;

import com.example.bookwishlist.model.WishlistBook;
import com.example.bookwishlist.repository.WishlistBookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BookController {

    private final WishlistBookRepository repository;

    public BookController(WishlistBookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    public List<WishlistBook> getBooks() {
        return repository.findAll();
    }

    @PostMapping("/books")
    public WishlistBook addBook(@RequestBody WishlistBook book) {
        return repository.save(book);
    }
}
