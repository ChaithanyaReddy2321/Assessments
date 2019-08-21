package com.example.MongoDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.MongoDemo.model.Employee;

/**
 * @author chaithanya.reddy
 * Aug 21, 2019
 */
@Repository
public interface userRepo extends MongoRepository<Employee, String> {
	
}
