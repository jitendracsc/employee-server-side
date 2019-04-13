package com.jit.util;

import com.jit.model.Employee;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getfName().compareTo(o2.getfName());
    }
}
