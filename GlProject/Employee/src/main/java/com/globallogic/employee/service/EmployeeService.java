package com.globallogic.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.globallogic.employee.entity.Employee;
import com.globallogic.employee.entity.File;
import com.globallogic.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private RestTemplate restTemplate;

// gets List of All Employees
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}

// gets list of All Employees By ID
	public ArrayList<Integer> listOfEmployeeId() {
		return employeeRepository.findAllId();
	}

// rest template call to file microservice to save file i.e to post file
	public void SaveFile(File newFile) {
		restTemplate.postForObject("http://localhost:7002/file/", newFile, File.class);

	}

// rest template call to get all files from FileMicroservice
	@SuppressWarnings("unchecked")
	public List<File> getAllFiles() {
		return restTemplate.getForObject("http://localhost:7002/file/", List.class);
	}

}
