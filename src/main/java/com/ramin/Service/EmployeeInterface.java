package com.ramin.Service;

import com.ramin.Entity.Employee;

import java.util.Collection;
import java.util.Optional;

public interface EmployeeInterface {

    Collection<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(int id);
    void removeEmployeeById(int id);
    void updateEmployee(Employee employee);
    void insertEmployee(Employee employee);
}
