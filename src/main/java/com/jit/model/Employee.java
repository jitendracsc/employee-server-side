package com.jit.model;

import java.util.Date;
import java.util.List;

/**
 * Model class for Employee
 * */
public class Employee {
    private String fName;
    private String lName;
    private String gender;
    private String department;
    private Date dob;

    public Employee(String fName, String lName, String gender,
                    String department, Date dob) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.department = department;
        this.dob = dob;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee [fName=%s, lName=%s, gender=%s, department=%s, date of birth=%s]", fName,
                lName, gender, department,dob);
    }
}