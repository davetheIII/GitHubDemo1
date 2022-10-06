package com.aptech.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class ReviewController {
	
	@Value("${student.name: No Name}")
	private String name;
	
	@Value("${student.email: No Email}")
	private String email;
	
	//localhost:8080/getDetails
	@GetMapping("/getDetails")
	public String getStudentDetails() {
		return "Student Details: " + name + " " + email;
	}
	
	//localhost:8080/get
	//@ResponseBody
	@GetMapping("/get")
	public String getStudent() {
		
		return "GET Request Was Sent";
		
	}
	
	//localhost:8080/add
	//@ResponseBody
	@PostMapping("/add")
    public String addStudent() {
		
		return "POST Request Was Sent";
		
	}
    
	//localhost:8080/update?id=50&name=Janet
	//@ResponseBody
	@PutMapping("/update")
    public String updateStudent(@RequestParam("id") Long stud_id, @RequestParam("name") String stud_name) {
    	
    	return "Update Request Was Sent for id: " + stud_id + "and name: " + stud_name;
    }
    
	//localhost:8080/delete
	//@ResponseBody
	@DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long stud_id) {
    	
    	return "DELETE Request Was Sent for id: " + stud_id;
    }
	
}
