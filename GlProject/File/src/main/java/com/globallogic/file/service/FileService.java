package com.globallogic.file.service;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.file.entity.File;
import com.globallogic.file.repository.FileRepository;

@Service
public class FileService {
//	@Autowired
//	private FileRecordRepository fileRecordRepository;
	@Autowired 
	private FileRepository fileRepository;
	
	public void saveFile(File file)
	{
		try 
		{
			
		
			java.util.Date date = new java.util.Date();
			java.sql.Date sqlDate = new Date(date.getTime());
			file.setCreatedDate(sqlDate);
			File existingFile=fileRepository.findByFileName(file.getFileName());
			if(existingFile==null) {
				fileRepository.save(file);
				
				
			}
			else if( file.getFileName()==existingFile.getFileName() && file.getInserCount()==0 && file.getNoOfRecords()==existingFile.getNoOfRecords())
			
				{
				System.out.println("File already Exist");
				}
		
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<File> getAllFiles()
	{
		return fileRepository.findAll();
	}
	
}
