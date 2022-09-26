package com.globallogic.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Log4j2
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	
	@NotEmpty(message = "First name is required")
	@Column(name="FirstName",nullable = false)
	private String firstName;
	
	@NotEmpty(message = "Middle name is required")
	@Column(name="MiddleName",nullable = false)
	private String middleName;
	
	@NotEmpty(message = "Last name is required")
	@Column(name="LastName",nullable = false)
	private String lastName;
	
	
	@Column(nullable = false)
	private Integer age;
	
	
	@Column(nullable = false)
	private Double salary;
	
	@Email(message = "Enter correct email id")
	@Column(nullable = false)
	private String email;
	public Employee(String firstName, String middleName, String lastName, Integer age, Double salary, String email) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.email = email;
	}
	
	
	
	
}
