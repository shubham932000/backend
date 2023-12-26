package com.shweta.fileupload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shweta.fileupload.entity.File;
import com.shweta.fileupload.repository.FileRepository;

@Service
public class FileServiceImpl implements FileService{
	
	@Autowired
    private FileRepository fileRepository;
	
	public FileServiceImpl() {
		
	}
	
	
	public FileServiceImpl(FileRepository fileRepository) {
		super();
		this.fileRepository = fileRepository;
	}

	@Override
	public List<File> getAllFiles() {
		// TODO Auto-generated method stub
		 return fileRepository.findAll();
	}

	@Override
	public File saveFile(File file) {
		// TODO Auto-generated method stub
        return fileRepository.save(file);
	}

	@Override
	public List<File> searchFiles(String query) {
		// TODO Auto-generated method stub
		return fileRepository.findByTitleContainingOrContentContaining(query, query);	}

}
