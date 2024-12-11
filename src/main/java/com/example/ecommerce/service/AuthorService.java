package com.example.ecommerce.service;

import com.example.ecommerce.dto.product.AuthorDTO;
import com.example.ecommerce.model.product.book.Author;
import com.example.ecommerce.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(String id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy tác giả với ID: " + id));
    }

    public Author createAuthor(AuthorDTO authorDTO) {
        // Validate dữ liệu
        if (authorDTO.getName() == null || authorDTO.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên tác giả không được để trống");
        }
        if (authorDTO.getEmail() == null || authorDTO.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("Email không được để trống");
        }

        Author author = new Author();
        author.setName(authorDTO.getName());
        author.setPhone(authorDTO.getPhone());
        author.setEmail(authorDTO.getEmail());

        return authorRepository.save(author);
    }

    public Author updateAuthor(String id, AuthorDTO authorDTO) {
        Author author = getAuthorById(id);

        if (authorDTO.getName() != null && !authorDTO.getName().trim().isEmpty()) {
            author.setName(authorDTO.getName());
        }
        if (authorDTO.getPhone() != null) {
            author.setPhone(authorDTO.getPhone());
        }
        if (authorDTO.getEmail() != null && !authorDTO.getEmail().trim().isEmpty()) {
            author.setEmail(authorDTO.getEmail());
        }

        return authorRepository.save(author);
    }

    public void deleteAuthor(String id) {
        Author author = getAuthorById(id);
        if (!author.getBooks().isEmpty()) {
            throw new IllegalStateException("Không thể xóa tác giả vì đang có sách liên kết");
        }
        authorRepository.deleteById(id);
    }
} 