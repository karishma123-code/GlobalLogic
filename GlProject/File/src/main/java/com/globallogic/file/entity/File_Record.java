//package com.globallogic.file.entity;
//
//import java.sql.Date;
//import java.util.List;
//
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.Data;
//
//@Table
//@Entity
//@Data
//public class File_Record {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//	private String fileName;
//	
//	private Integer noOfRecords;
//	
//	private Integer inserCount;
//	
//	private Date createdDate;
//	
//	private Date updatedDate;
//	
//	@ElementCollection
//	private List<Employee>listOfEmployees;
//}
