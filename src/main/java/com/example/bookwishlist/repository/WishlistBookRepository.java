
package com.example.bookwishlist.repository;

import com.example.bookwishlist.model.WishlistBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistBookRepository
        extends JpaRepository<WishlistBook, Long> {
}
