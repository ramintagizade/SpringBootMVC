package com.ramin.Controller;

import com.ramin.Entity.Employee;
import com.ramin.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return  this.employeeService.getEmployeeById(id);
    }

    @RequestMapping(value = "{id}" ,method = RequestMethod.DELETE)
    public void deleteEmployeeById(@PathVariable("id") int id) {
        this.employeeService.removeEmployeeById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateEmployee(@RequestBody Employee employee){
        this.employeeService.updateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertEmployee(@RequestBody Employee employee) {
        this.employeeService.insertEmployee(employee);
    }
}
