package com.example.documentmanagement.repository;

import com.example.documentmanagement.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByTitleContainingOrContentContaining(String title, String content);
}
