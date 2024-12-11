package com.example.ecommerce.repository;

import com.example.ecommerce.model.product.book.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
    // Có thể thêm các phương thức tìm kiếm tùy chỉnh nếu cần
    // Ví dụ: Optional<Author> findByName(String name);
} 