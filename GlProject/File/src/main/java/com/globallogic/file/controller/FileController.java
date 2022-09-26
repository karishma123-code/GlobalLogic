package com.globallogic.file.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.file.entity.File;
import com.globallogic.file.service.FileService;

@RestController
@RequestMapping("/file")
public class FileController {
	
	@Autowired 
	private FileService fileService;
	@PostMapping()
	public void saveFile(@RequestBody File file)
	{
		fileService.saveFile(file);
	}
	
	@GetMapping()
	public List<File> getFiles()
	{
		return fileService.getAllFiles();
	}

}
