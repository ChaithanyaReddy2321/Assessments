package com.example.MongoDemo.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chaithanya.reddy
 * Aug 21, 2019
 */

@Document(collection = "Employees")
public class Employee {
	
	@Id
	private String id;
	private String name;
	private String department;
	private String reportingManager;
	private int age;
	private long salary;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartments() {
		return department;
	}
	public void setDepartments(String departments) {
		this.department = department;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
