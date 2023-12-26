package com.shweta.fileupload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shweta.fileupload.entity.File;
import com.shweta.fileupload.repository.FileRepository;

public interface FileService {
	

    public List<File> getAllFiles();

    public File saveFile(File file);

    public List<File> searchFiles(String query);
}
