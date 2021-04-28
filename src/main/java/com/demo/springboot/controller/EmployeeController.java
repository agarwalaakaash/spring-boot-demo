package com.demo.springboot.controller;

import com.demo.springboot.model.Employee;
import com.demo.springboot.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getEmployees(){
        List<Employee> empList = service.getAllEmployees();

        return empList;
    }
}
