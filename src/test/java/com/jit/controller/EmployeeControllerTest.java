package com.jit.controller;

import static org.junit.Assert.assertEquals;

import com.jit.model.Employee;
import com.jit.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration()
public class EmployeeControllerTest {

    @Autowired WebApplicationContext wac;
    @Autowired MockHttpSession session;
    @Autowired MockHttpServletRequest request;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
    @MockBean
    private EmployeeService employeeService;

    List<Employee> mockEmployee = Arrays.asList(new Employee("Jitendra", "Kumar", "Male", "ITEC", new Date("15-JAN-1986")),
            new Employee("Pawan", "Kumar", "Male", "HR", new Date("05-FEB-1988")));

    String employeeJson = "{\"fName\":\"Jitendra\",\"lNnme\":\"Kumar\",\"gender\":\"Male\",\"department\":\"ITEC\",\"dob\":\"15-JAN-1986\"}";

    @Test
    public void retrieveEmployees() throws Exception {

        Mockito.when(employeeService.retrieveAllEmployee()).thenReturn(mockEmployee);


        this.mockMvc.perform(get("/employee/all").session(session)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    public void registerEmployee() throws Exception {

        Employee mockEmployee = new Employee("Jitendra", "Kumar", "Male", "ITEC", new Date("15-JAN-1986"));

        // employeeService.addCourse to respond back with mockCourse
        Mockito.when(
                employeeService.registerEmployee(
                        Mockito.any(Employee.class))).thenReturn(mockEmployee);

        this.mockMvc.perform(post("/employee/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(employeeJson))
                .andExpect(status().isNotFound());
    }

}
