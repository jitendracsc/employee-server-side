package com.jit.controller;

import java.net.URI;
import java.util.List;

import com.jit.model.Employee;
import com.jit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * List of all registered employee
     * */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employee/all")
    public List<Employee> retrieveAllEmployee() {
        return employeeService.retrieveAllEmployee();
    }

    /**
     * This API help to register a employee
     * */
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employee/register")
    public Employee registerEmployee(@RequestBody Employee employee) {

        Employee employee1 = employeeService.registerEmployee(employee);


       return employee1;
    }

}
