package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

//Repository to perform crud operation
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
