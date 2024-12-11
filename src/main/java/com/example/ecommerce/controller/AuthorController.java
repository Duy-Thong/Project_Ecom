package com.example.ecommerce.controller;

import com.example.ecommerce.dto.product.AuthorDTO;
import com.example.ecommerce.model.product.book.Author;
import com.example.ecommerce.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllAuthors() {
        Map<String, Object> response = new HashMap<>();
        try {
            List<Author> authors = authorService.getAllAuthors();
            response.put("success", true);
            response.put("message", "Lấy danh sách tác giả thành công");
            response.put("data", authors);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi lấy danh sách tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getAuthorById(@PathVariable String id) {
        Map<String, Object> response = new HashMap<>();
        try {
            Author author = authorService.getAuthorById(id);
            response.put("success", true);
            response.put("message", "Lấy thông tin tác giả thành công");
            response.put("data", author);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Không tìm thấy tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi lấy thông tin tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> createAuthor(@RequestBody AuthorDTO authorDTO) {
        Map<String, Object> response = new HashMap<>();
        try {
            Author createdAuthor = authorService.createAuthor(authorDTO);
            response.put("success", true);
            response.put("message", "Tạo tác giả mới thành công");
            response.put("data", createdAuthor);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Dữ liệu không hợp lệ");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi tạo tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> updateAuthor(
            @PathVariable String id,
            @RequestBody AuthorDTO authorDTO) {
        Map<String, Object> response = new HashMap<>();
        try {
            Author updatedAuthor = authorService.updateAuthor(id, authorDTO);
            response.put("success", true);
            response.put("message", "Cập nhật tác giả thành công");
            response.put("data", updatedAuthor);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Không tìm thấy tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi cập nhật tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deleteAuthor(@PathVariable String id) {
        Map<String, Object> response = new HashMap<>();
        try {
            authorService.deleteAuthor(id);
            response.put("success", true);
            response.put("message", "Xóa tác giả thành công");
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Không tìm thấy tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (IllegalStateException e) {
            response.put("success", false);
            response.put("message", "Không thể xóa tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi xóa tác giả");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
} 