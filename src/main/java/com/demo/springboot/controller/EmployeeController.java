package com.demo.springboot.controller;

import com.demo.springboot.model.Employee;
import com.demo.springboot.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/getEmployee/{foo}") // when using different variable names otherwise recommended to use same var name
    public Employee getEmployee(@PathVariable("foo") int id){
        Employee emp = service.getEmployee(id);

        return emp;
    }

    @PostMapping(value = "/createEmployee")
    public Employee createEmployee(@RequestBody Employee emp){
        Employee e = service.createEmployee(emp);

        return e;
    }

    @PutMapping(value = "/updateEmployee/{id}")
    public Employee updateEmployee(@RequestBody Employee emp, @PathVariable int id){
        Employee e = service.updateEmployee(emp, id);

        return e;
    }

    @DeleteMapping(value = "/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
    }
}
