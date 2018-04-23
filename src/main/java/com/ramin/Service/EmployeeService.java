package com.ramin.Service;

import com.ramin.Dao.EmployeeDao;
import com.ramin.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeInterface {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Collection<Employee> getAllEmployees() {
        return this.employeeDao.getAllEmployees();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return this.employeeDao.getEmployeeById(id);
    }
    @Override
    public void removeEmployeeById(int id) {
        this.employeeDao.removeEmployeeById(id);
    }
    @Override
    public void updateEmployee(Employee employee) {
        this.employeeDao.updateEmployee(employee);
    }
    @Override
    public void insertEmployee(Employee employee) {
        this.employeeDao.insertEmployee(employee);
    }
}
