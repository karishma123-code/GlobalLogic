package com.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication {
	static Logger logger= LogManager.getLogger(MyProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
		System.out.println("Hello");
		
		//Log Levels
		logger.trace("this is trace msg");
		logger.debug("this is debug msg");
		logger.info("this is info msg");
		logger.warn("this is a warn msg");
		logger.error("this is a error msg");
		logger.fatal("this is a fatal msg");
		
	}

}
