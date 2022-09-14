package com.employee.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	//Injecting the service class dependency
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	//Logger part 
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@RequestMapping(path="/feedEmployeeData")
	public void saveEmployeeData() {
		employeeService.saveEmployeeDetails();
		
	}
	
	//Displaying the logger messsage at console
	@GetMapping("/message")
	public String getMessage() {
		logger.info("info message");
		logger.warn("warn message");
        logger.error("Error message");
        logger.trace("Trace message");
        logger.debug("debug message");
		
		return "open messsage to check logger";
	}

}