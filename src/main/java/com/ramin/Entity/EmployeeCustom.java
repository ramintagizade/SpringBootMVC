package com.ramin.Entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeCustom  extends MongoRepository <Employee,Integer> {

}
