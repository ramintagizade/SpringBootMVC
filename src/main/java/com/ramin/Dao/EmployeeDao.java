package com.ramin.Dao;

import com.ramin.Entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

import com.ramin.Entity.EmployeeCustom;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class EmployeeDao implements CommandLineRunner {

    @Autowired
    private EmployeeCustom employee;

    @Override
    public void run(String... args) throws Exception {

    }

    public Collection<Employee> getAllEmployees() {
        return employee.findAll();
    }
    public Optional<Employee> getEmployeeById(int id) {
        return employee.findById(id);
    }

    public void removeEmployeeById(int id) {
        employee.deleteById(id);
    }

    public void updateEmployee(Employee emp) {
        employee.save(emp);
    }

    public void insertEmployee(Employee emp) {
        employee.insert(emp);
    }
}
