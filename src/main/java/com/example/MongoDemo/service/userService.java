package com.example.MongoDemo.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MongoDemo.model.Employee;
import com.example.MongoDemo.repository.*;

@Service
public class userService {
	@Autowired
	private userRepo userRepo;
	
	public String createUser(Employee emp) {
		userRepo.save(emp);
		return ("New User created with ID: "+emp.getId());
	}
	
	public Employee update(String name, long salary) {
		List<Employee> listEmployee = userRepo.findAll();
		for (int i = 0; i < listEmployee.size(); i++) {
			if(listEmployee.get(i).getName().equals(name)) {
				listEmployee.get(i).setSalary(salary);
				userRepo.save(listEmployee.get(i));
				return listEmployee.get(i);
			}
		}
		return null;
	}
	
	public Employee delete(String name) {
		List<Employee> listEmployee = userRepo.findAll();
		for (int i = 0; i < listEmployee.size(); i++) {
			if(listEmployee.get(i).getName().equals(name)) {
				userRepo.delete(listEmployee.get(i));
				return listEmployee.get(i);
			}
		}
		return null;
	}
	public List<Employee> listEmployees(){
		return userRepo.findAll();
	}
}
