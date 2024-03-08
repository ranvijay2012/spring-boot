package com.neeraj.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * @return
     */
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public void deleteEmployees(Integer id) {
          employeeRepository.deleteById(id);
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
