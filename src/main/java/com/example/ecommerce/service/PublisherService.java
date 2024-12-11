package com.example.ecommerce.service;

import com.example.ecommerce.dto.product.PublisherDTO;
import com.example.ecommerce.model.product.book.Publisher;
import com.example.ecommerce.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher getPublisherById(String id) {
        return publisherRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy nhà xuất bản với ID: " + id));
    }

    public Publisher createPublisher(PublisherDTO publisherDTO) {
        // Validate dữ liệu
        if (publisherDTO.getName() == null || publisherDTO.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên nhà xuất bản không được để trống");
        }
        if (publisherDTO.getAddress() == null || publisherDTO.getAddress().trim().isEmpty()) {
            throw new IllegalArgumentException("Địa chỉ không được để trống");
        }

        Publisher publisher = new Publisher();
        publisher.setName(publisherDTO.getName());
        publisher.setAddress(publisherDTO.getAddress());

        return publisherRepository.save(publisher);
    }

    public Publisher updatePublisher(String id, PublisherDTO publisherDTO) {
        Publisher publisher = getPublisherById(id);

        if (publisherDTO.getName() != null && !publisherDTO.getName().trim().isEmpty()) {
            publisher.setName(publisherDTO.getName());
        }
        if (publisherDTO.getAddress() != null && !publisherDTO.getAddress().trim().isEmpty()) {
            publisher.setAddress(publisherDTO.getAddress());
        }

        return publisherRepository.save(publisher);
    }

    public void deletePublisher(String id) {
        Publisher publisher = getPublisherById(id);
        if (!publisher.getBooks().isEmpty()) {
            throw new IllegalStateException("Không thể xóa nhà xuất bản vì đang có sách liên kết");
        }
        publisherRepository.deleteById(id);
    }
} 