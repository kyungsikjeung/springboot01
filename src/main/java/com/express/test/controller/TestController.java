package com.express.test.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.express.test.dao.TestDAO;

@RestController
@RequestMapping(value = "")
public class TestController {
	
	@Autowired TestDAO  testDAO;

	
	@GetMapping(path="/test")
	public String helloworld() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		
	}
	
	@GetMapping(path="/ttt")
	public String testA() {
		return testDAO.getListAll();
	}

}
