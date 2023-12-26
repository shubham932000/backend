package com.shweta.fileupload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shweta.fileupload.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Long>{
	List<File> findByTitleContainingOrContentContaining(String title, String content);

}
