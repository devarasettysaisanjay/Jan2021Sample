package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.pojo.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@RestController
public class TestController {
	
	@Autowired
	private  EmployeeService employeeService; 
	
	@GetMapping("/test")
	public String test(@RequestParam(name="userName")String name) {
		return "This is First Spring Boot Application started by" +name;
		
	}
	
	
	@PostMapping("/saveEmployee")
	public  ResponseEntity<Employee>  saveEmployee(@RequestBody EmployeeDetails employee) {
	Employee e= employeeService.processEmployeeDetails(employee);
	if(null!=e) {
		return ResponseEntity.ok().body(e);
	}
	else {
		return null;
	}
	
	}


}
