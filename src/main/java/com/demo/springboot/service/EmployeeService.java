package com.demo.springboot.service;

import com.demo.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<>(Arrays.asList(
            new Employee(1,"A","123","xyz"),
            new Employee(2,"B","456","uvw"),
            new Employee(3,"C","789","rst")));

    public List<Employee> getAllEmployees() {
        return empList;
    }

    public Employee getEmployee(int id) {
        return empList.stream().filter(x -> (id == x.getId())).iterator().next();
    }

    public Employee createEmployee(Employee emp) {
        empList.add(emp);
        return emp;
    }
}
