package com.globallogic.employee.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.sql.Date;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.globallogic.employee.entity.Employee;
import com.globallogic.employee.entity.File;
import com.globallogic.employee.repository.EmployeeRepository;
import com.globallogic.employee.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired 
private EmployeeService employeeService;

@Autowired
private EmployeeRepository employeeRepository;

// to display html page
@GetMapping("/")
public ModelAndView index()
{
	return new ModelAndView("index.html");
}


// getting all Employees
@GetMapping("/getAllEmployees")
@ApiOperation(value="Getting All Employee")
public List<Employee> getEmployees()
{
	return employeeService.getEmployee();
	
}

// upload csv file to save employees data
@PostMapping("/")
@ApiOperation(value="Upload Csv File Containing Employee Data")
public List<Employee> saveEmp(@RequestPart("file") @ApiParam(value="File", required=true) MultipartFile file
		,Model model)
{
	// validate file
			 if (file.isEmpty()) {
		         model.addAttribute("message", "Please select a CSV file to upload.");
		         model.addAttribute("status", false);
		     } 
			 else
			 {try 
				{
					BufferedReader bf= new BufferedReader(new InputStreamReader(file.getInputStream()));
					String header=bf.readLine();
					System.out.println(header);
					int noOfRecords=0;
					int inserRecord=0;
					
					ArrayList<Integer> IdOfEmployee=new ArrayList<Integer>();
					String line="";
						while((line=bf.readLine())!= null)
						{
							noOfRecords++;
							String[]data=line.split(",");
							Employee emp=new Employee(data[0],data[1],data[2],Integer.parseInt(data[3]),Double.parseDouble(data[4]),data[5]);
							List<Employee> exist=employeeRepository.findByFirstName(data[0]);
							// if already not exists
							if((exist.size()==0))
							{
								employeeRepository.save(emp);
								inserRecord++;
								IdOfEmployee.add((emp.getEmployeeId()));
							}
							else
							{
								System.out.println("Unable to insert record !\n Duplicate Entry");
							}
						}
						File newFile=new File();
						newFile.setNoOfRecords(noOfRecords);
						newFile.setInserCount(inserRecord);
//						newFile.setCreatedDate(LocalDate.now());
						newFile.setFileName(file.getOriginalFilename());
						newFile.setEmployee(IdOfEmployee);
						System.out.println(newFile+"\n\n\n");
						employeeService.SaveFile(newFile);
						bf.close();
						
					
					}
				catch (Exception e) {
					e.printStackTrace();
				}
				 
			 }
			return employeeService.getEmployee();
	
	}

// get file details
@GetMapping("/files")
public List<File> getAllFiles()
{
	return employeeService.getAllFiles();
}


}

