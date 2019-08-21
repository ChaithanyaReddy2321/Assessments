package com.example.MongoDemo.controller;

import java.math.BigInteger;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MongoDemo.model.Employee;
import com.example.MongoDemo.service.*;

/**
 * @author chaithanya.reddy
 * Aug 21, 2019
 */

@RestController
@RequestMapping("/employees")
public class restControllers {
	
	@Autowired
	private userService userService;
	
	@PostMapping("/add")
	public String createEmployee(@RequestBody Employee emp) {
		return userService.createUser(emp);
	}
	
	@PutMapping("/update")
	public String updateEmployee(@PathParam (value = "name") String name,
								@PathParam(value = "salary")long salary) {
		Employee emp = userService.update(name, salary);
		if(emp == null)
			return "No user is present with entered name";
		return "Employee salary is updated";
	}
	@DeleteMapping("/delete")
	public String deleteEmployee(@PathParam (value = "name") String name) {
		Employee emp = userService.delete(name);
		if(emp == null)
			return "No user is present with entered name";
		return "Employee is deleted";
	}
	@GetMapping("")
	public List<Employee> getAllUsers() {
		return userService.listEmployees();
	}
	
}
