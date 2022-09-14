package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	// Data Members

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String age;
	private String salary;
	private String emailId;

	// Default Constructor
	public Employee() {
		super();

	}

	// Parameterized Constructor

	public Employee(int employeeId, String firstName, String middleName, String lastName, String age, String salary,
			String emailId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.emailId = emailId;
	}

	// Getter and Setter
	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getSalary() {
		return salary;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	// Generating toString()
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", age=" + age + ", salary=" + salary + ", emailId=" + emailId + "]";
	}

}
