package com.paradox.springsample.services;

import com.paradox.springsample.annotations.LogMetrics;
import com.paradox.springsample.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @LogMetrics
    public Employee createEmployee(String name, String empId) {
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setName(name);
        Employee a = oneparam("");
        Employee b = twoparam("", "x");
        Employee c = threeparam("a", "b", "c");
        return employee;
    }

    public void deleteEmployee(String empId) {

    }

    @LogMetrics
    public Employee oneparam(String a) {
        System.out.println("one param");
        return new Employee();
    }

    @LogMetrics
    public Employee twoparam(String a, String b) {
        System.out.println("two param");
        return new Employee();
    }

    @LogMetrics
    public Employee threeparam(String a, String b, String c) {
        System.out.println("three param");
        return new Employee();
    }
}
