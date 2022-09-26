package com.globallogic.employee.entity;

//import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class File {

	private Long FileId;
	
	
	private String fileName;
	
	private Integer noOfRecords;
	
	private Integer inserCount;
	
	private LocalDate createdDate;
	
	private LocalDate updatedDate;
	
	public List<Integer> employee = new ArrayList<Integer>();
	
}
