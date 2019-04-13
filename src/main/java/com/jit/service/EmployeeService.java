package com.jit.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.jit.model.Employee;
import com.jit.util.EmployeeNameComparator;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();

    /**
     * Service to get the all registered employee with sorted on first name
     * */
    public List<Employee> retrieveAllEmployee() {
        Collections.sort(employees, new EmployeeNameComparator());
        return employees;
    }

    /**
     * Save the new registration
     * */
    public Employee registerEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
}