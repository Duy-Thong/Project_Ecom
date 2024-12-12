package com.example.ecommerce.repository;

import com.example.ecommerce.model.product.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    // Có thể thêm các phương thức tìm kiếm tùy chỉnh nếu cần
    // Ví dụ: Optional<Book> findByIsbn(String isbn);
} 