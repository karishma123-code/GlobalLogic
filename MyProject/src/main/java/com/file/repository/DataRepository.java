package com.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.entity.Data;

@Repository
public interface DataRepository extends JpaRepository<Data,Long> {
	
	
	

}
