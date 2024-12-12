package com.example.ecommerce.controller;

import com.example.ecommerce.dto.product.BookDTO;
import com.example.ecommerce.model.product.book.Book;
import com.example.ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> createBook(@RequestBody BookDTO bookDTO) {
        Map<String, Object> response = new HashMap<>();
        
        try {
            Book createdBook = bookService.createBook(bookDTO);
            
            response.put("success", true);
            response.put("message", "Tạo sách mới thành công");
            response.put("data", createdBook);
            
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
            
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Dữ liệu không hợp lệ");
            response.put("error", e.getMessage());
            
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
            
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi tạo sách");
            response.put("error", e.getMessage());
            
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
} 