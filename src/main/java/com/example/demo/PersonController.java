package com.example.demo;

import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	
	@RequestMapping("/all")
	public String getAll() {
		Logger logger = LoggerFactory.getLogger(PersonController.class);
		
		logger.trace("log1");
		logger.debug("log2");
		logger.info("log3");
		logger.warn("log4");
		logger.error("log5!!");
		
		return "";
	}
	

}