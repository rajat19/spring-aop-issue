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
        oneparam("");
        twoparam("", "x");
        threeparam("a", "b", "c");
        return employee;
    }

    public void deleteEmployee(String empId) {

    }

    @LogMetrics
    public void oneparam(String a) {

    }

    @LogMetrics
    public void twoparam(String a, String b) {

    }

    @LogMetrics
    public void threeparam(String a, String b, String c) {

    }
}
