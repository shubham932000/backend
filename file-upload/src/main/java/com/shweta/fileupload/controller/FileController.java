package com.shweta.fileupload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shweta.fileupload.entity.File;
import com.shweta.fileupload.service.FileService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class FileController {
	@Autowired
    private FileService fileService;

    @GetMapping("/files")
    public List<File> getAllDocuments() {
        return fileService.getAllFiles();
    }

    @PostMapping("/files")
    public File uploadDocument(@RequestBody File file) {
        return fileService.saveFile(file);
    }

    @GetMapping("/search")
    public List<File> searchDocuments(@RequestParam String query) {
        return fileService.searchFiles(query);
    }

}
