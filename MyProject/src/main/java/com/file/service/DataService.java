package com.file.service;

import java.util.List;

import com.file.entity.Data;

public interface DataService {
	
  Data addData(Data data);
  List<Data> getAllData();
}
