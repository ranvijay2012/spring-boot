package com.neeraj.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    private String getMessage() {
        return "Hello Dear Welcome in the employees world!";
    }

    @GetMapping("/employees")
    private List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    private Employee getEmployees(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    private Employee saveEmployees(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    private void deleteEmployees(@PathVariable Integer id) {
         employeeService.deleteEmployees(id);
    }

}
