package com.demo.springboot.service;

import com.demo.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getAllEmployees() {
//        List<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee("1","A","123","xyz");
        Employee e2 = new Employee("2","B","456","uvw");
        Employee e3 = new Employee("3","C","789","rst");
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);

        return Arrays.asList(e1,e2,e3);
    }
}
