package com.example.ecommerce.repository;

import com.example.ecommerce.model.product.book.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {
    // Có thể thêm các phương thức tìm kiếm tùy chỉnh nếu cần
    // Ví dụ: Optional<Publisher> findByName(String name);
} 