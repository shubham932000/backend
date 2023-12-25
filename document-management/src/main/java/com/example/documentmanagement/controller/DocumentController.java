// DocumentController.java
package com.example.documentmanagement.controller;

import com.example.documentmanagement.model.Document;
import com.example.documentmanagement.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @GetMapping("/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentService.getDocumentById(id);
    }

    @PostMapping
    public Document saveDocument(@RequestBody Document document) {
        return documentService.saveDocument(document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
    }

    @GetMapping("/search")
    public List<Document> searchDocuments(@RequestParam String query) {
        return documentService.searchDocuments(query);
    }
}
