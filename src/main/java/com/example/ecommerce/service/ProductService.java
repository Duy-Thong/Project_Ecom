package com.example.ecommerce.service;

import com.example.ecommerce.dto.product.BookDTO;
import com.example.ecommerce.model.product.Product;
import com.example.ecommerce.model.product.book.Author;
import com.example.ecommerce.model.product.book.Book;
import com.example.ecommerce.model.product.book.Publisher;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.repository.AuthorRepository;
import com.example.ecommerce.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private AuthorRepository authorRepository;
    
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product createProduct(Product product) {
        // Kiểm tra dữ liệu đầu vào
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được để trống");
        }
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Giá sản phẩm phải lớn hơn 0");
        }
        if (product.getStock() < 0) {
            throw new IllegalArgumentException("Số lượng tồn kho không được âm");
        }
        
        return productRepository.save(product);
    }
    
    public Book createBook(BookDTO bookDTO) {
        // Validate dữ liệu
        if (bookDTO.getName() == null || bookDTO.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sách không được để trống");
        }
        if (bookDTO.getPrice() <= 0) {
            throw new IllegalArgumentException("Giá sách phải lớn hơn 0");
        }
        if (bookDTO.getStock() < 0) {
            throw new IllegalArgumentException("Số lượng tồn kho không được âm");
        }
        if (bookDTO.getIsbn() == null || bookDTO.getIsbn().trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN không được để trống");
        }
        
        // Tìm Author
        Author author = authorRepository.findById(bookDTO.getAuthorId())
            .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy tác giả với ID: " + bookDTO.getAuthorId()));
            
        // Tìm Publisher
        Publisher publisher = publisherRepository.findById(bookDTO.getPublisherId())
            .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy nhà xuất bản với ID: " + bookDTO.getPublisherId()));
        
        // Tạo Book mới
        Book book = new Book();
        book.setName(bookDTO.getName());
        book.setPrice(bookDTO.getPrice());
        book.setStock(bookDTO.getStock());
        book.setCategory(bookDTO.getCategory());
        book.setDescription(bookDTO.getDescription());
        book.setImage_url(bookDTO.getImage_url());
        book.setIsbn(bookDTO.getIsbn());
        book.setAuthor(author);
        book.setPublisher(publisher);
        
        return (Book) productRepository.save(book);
    }
} 