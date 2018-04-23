package com.ramin.Dao;

import com.ramin.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeDao {
    private  static Map<Integer,Employee> employees;

    static {
        employees = new HashMap<Integer, Employee>() {
            {
                put(1, new Employee(1, "Ramin", "Programmer"));
                put(2, new Employee(2, "Jessica", "Manager"));
                put(3, new Employee(3, "John", "Mathematician"));
            }
        };
    }

    public Collection<Employee> getAllEmployees() {
        return this.employees.values();
    }
    public Employee getEmployeeById(int id) {
        return this.employees.get(id);
    }

    public void removeEmployeeById(int id) {
        this.employees.remove(id);
    }

    public void updateEmployee(Employee employee) {
        Employee emp = this.employees.get(employee.getId());
        emp.setProfession(employee.getProfession());
        emp.setName(employee.getName());
        this.employees.put(employee.getId(), employee);
    }

    public void insertEmployee(Employee employee) {
        this.employees.put(employee.getId(), employee);
    }
}
