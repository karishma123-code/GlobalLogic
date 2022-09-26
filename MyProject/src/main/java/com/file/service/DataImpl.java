package com.file.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.MyProjectApplication;
import com.file.entity.Data;
import com.file.repository.DataRepository;

@Service
public class DataImpl implements DataService {
	static Logger logger= LogManager.getLogger(MyProjectApplication.class);
    
	@Autowired
	private DataRepository dataRepository;
	
	@Override
	public Data addData(Data data) {
		logger.info("Saving data into the database........");
		return dataRepository.save(data);
	}

	@Override
	public List<Data> getAllData() {
		
		return dataRepository.findAll();
	}

	

}
