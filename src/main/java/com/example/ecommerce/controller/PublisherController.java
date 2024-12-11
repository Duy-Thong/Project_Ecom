package com.example.ecommerce.controller;

import com.example.ecommerce.dto.product.PublisherDTO;
import com.example.ecommerce.model.product.book.Publisher;
import com.example.ecommerce.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/publishers")
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllPublishers() {
        Map<String, Object> response = new HashMap<>();
        try {
            List<Publisher> publishers = publisherService.getAllPublishers();
            response.put("success", true);
            response.put("message", "Lấy danh sách nhà xuất bản thành công");
            response.put("data", publishers);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi lấy danh sách nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getPublisherById(@PathVariable String id) {
        Map<String, Object> response = new HashMap<>();
        try {
            Publisher publisher = publisherService.getPublisherById(id);
            response.put("success", true);
            response.put("message", "Lấy thông tin nhà xuất bản thành công");
            response.put("data", publisher);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Không tìm thấy nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi lấy thông tin nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> createPublisher(@RequestBody PublisherDTO publisherDTO) {
        Map<String, Object> response = new HashMap<>();
        try {
            Publisher createdPublisher = publisherService.createPublisher(publisherDTO);
            response.put("success", true);
            response.put("message", "Tạo nhà xuất bản mới thành công");
            response.put("data", createdPublisher);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Dữ liệu không hợp lệ");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi tạo nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> updatePublisher(
            @PathVariable String id,
            @RequestBody PublisherDTO publisherDTO) {
        Map<String, Object> response = new HashMap<>();
        try {
            Publisher updatedPublisher = publisherService.updatePublisher(id, publisherDTO);
            response.put("success", true);
            response.put("message", "Cập nhật nhà xuất bản thành công");
            response.put("data", updatedPublisher);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Không tìm thấy nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi cập nhật nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletePublisher(@PathVariable String id) {
        Map<String, Object> response = new HashMap<>();
        try {
            publisherService.deletePublisher(id);
            response.put("success", true);
            response.put("message", "Xóa nhà xuất bản thành công");
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            response.put("success", false);
            response.put("message", "Không tìm thấy nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (IllegalStateException e) {
            response.put("success", false);
            response.put("message", "Không thể xóa nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Lỗi khi xóa nhà xuất bản");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
} 