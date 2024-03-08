package com.neeraj.springboot.controller;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployee(Integer id);

    void deleteEmployees(Integer id);

    Employee saveEmployee(Employee employee);
}
