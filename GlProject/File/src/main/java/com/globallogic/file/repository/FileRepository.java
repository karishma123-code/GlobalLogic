package com.globallogic.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.file.entity.File;


public interface FileRepository extends JpaRepository<File, Long>{

	File findByFileName(String fileName);

}
