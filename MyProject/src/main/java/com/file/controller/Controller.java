package com.file.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.file.MyProjectApplication;
import com.file.entity.Data;
import com.file.service.DataService;

@RestController
@RequestMapping("/file")
public class Controller {
	static Logger logger= LogManager.getLogger(MyProjectApplication.class);
	
	
	@Autowired
	private DataService dataService;
	
	
	@GetMapping("/msg")
	public String test() {
		
		logger.info("Controller executing...");
		return "Hello Logger";
	}
	
	@PostMapping("/add")
	public ResponseEntity<Data> addData(@RequestBody Data data){
		logger.info("Adding data........");
		return new ResponseEntity<Data>(dataService.addData(data),HttpStatus.CREATED);
	}
	
	@GetMapping("/allData")
	public List<Data> getAllData(){
		return dataService.getAllData();
	}
	

}
