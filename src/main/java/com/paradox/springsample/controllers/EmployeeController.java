package com.paradox.springsample.controllers;

import com.paradox.springsample.models.Employee;
import com.paradox.springsample.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("name") String name,
                                @RequestParam("empId") String empId) {
        return employeeService.createEmployee(name, empId);
    }

    @DeleteMapping("/")
    public String removeEmployee(@RequestParam("empId") String empId) {
        employeeService.deleteEmployee(empId);
        return "employee removed";
    }
}
