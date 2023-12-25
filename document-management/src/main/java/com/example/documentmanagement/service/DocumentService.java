package com.example.documentmanagement.service;

import com.example.documentmanagement.model.Document;

import java.util.List;

public interface DocumentService {
    List<Document> getAllDocuments();
    Document getDocumentById(Long id);
    Document saveDocument(Document document);
    void deleteDocument(Long id);
    List<Document> searchDocuments(String query);
}