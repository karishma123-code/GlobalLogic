package com.globallogic.file.entity;
import java.util.List;
import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.JoinColumn;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long FileId;
	
	@Column(nullable=false)
	private String fileName;
	@Column(nullable = false)
	private Integer noOfRecords;
	@Column
	private Integer inserCount;
	private Date createdDate;
	private Date updatedDate;
	
	@ElementCollection
	    @CollectionTable(name = "File_Employee", joinColumns = @JoinColumn(name = "FileId"))
	    @Column(name = "Employee_Id")
	    public List<Integer> employee = new ArrayList<Integer>();
	
}
