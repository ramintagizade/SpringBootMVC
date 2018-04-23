package com.ramin.Service;

import com.ramin.Dao.EmployeeDao;
import com.ramin.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployees() {
        return this.employeeDao.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return this.employeeDao.getEmployeeById(id);
    }

    public void removeEmployeeById(int id) {
        this.employeeDao.removeEmployeeById(id);
    }
    public void updateEmployee(Employee employee) {
        this.employeeDao.updateEmployee(employee);
    }
    public void insertEmployee(Employee employee) {
        this.employeeDao.insertEmployee(employee);
    }
}
