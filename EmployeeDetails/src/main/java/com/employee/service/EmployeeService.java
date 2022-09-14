package com.employee.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	// Injecting the dependency

	@Autowired
	private EmployeeRepository employeeRepository;
	
	String line="";

	/**
	 *  Method the save the details of an Employee 
	 */
	public void saveEmployeeDetails()  {

		// creating own API to read and store CSV file
	
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Employee.csv"));
			while((line=br.readLine())!=null) {
				String [] data=line.split(",");
				Employee employee=new Employee();
				employee.setFirstName(data[0]);
				employee.setMiddleName(data[1]);
				employee.setLastName(data[2]);
				employee.setAge(data[3]);
				
				employee.setSalary(data[4]);
				employee.setEmailId(data[5]);
				
				employeeRepository.save(employee);
				
				
			}
	
		}

		catch (IOException e) {

			e.printStackTrace();
		}
	}
	
    

}
