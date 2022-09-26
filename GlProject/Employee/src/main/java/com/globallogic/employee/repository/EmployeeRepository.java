package com.globallogic.employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globallogic.employee.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Query("SELECT id FROM Employee")
	ArrayList<Integer> findAllId();
	List<Employee> findByFirstName(String string);

}
