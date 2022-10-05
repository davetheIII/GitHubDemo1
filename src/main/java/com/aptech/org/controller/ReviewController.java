package com.aptech.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ReviewController {
//localhost:8080/get
	@ResponseBody
	@GetMapping("/get")
	public String getStudent() {
		return "GET Request was sent";
		
	}
	
	@ResponseBody
	@PostMapping("/add")
	public String addStudent() {
		return "ADD Request was sent";
		
	}
	
	@ResponseBody
	@PutMapping("/put")
	public String UpdateStudent(@RequestParam("id") Long student_id,
			@RequestParam("name") String stud_name) {
		return "UPDATE Request was sent for id:" + student_id
				+ "and name:"+ stud_name;
		
	}
	
	@ResponseBody
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") long stud_id) {
		return "DELETE Request was sent for id:" + stud_id;
		
	}
}
