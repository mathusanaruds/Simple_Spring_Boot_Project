package com.developer.employee_management.controller;

import com.developer.employee_management.entity.employeeEntity;
import com.developer.employee_management.service.employeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class employeeController {
    public employeeController(employeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    private final employeeService employeeservice;


@GetMapping
    public List<employeeEntity> findallEmployee(){
        return employeeservice.findallEmployee();
    }

   @GetMapping("/{id}")
    public Optional<employeeEntity> findbyId(@PathVariable("id") Long id){
    return employeeservice.findbyId(id);
    }

    @PostMapping
    public employeeEntity saveEmployee(@RequestBody employeeEntity employeeentity){
    return employeeservice.saveEmployee(employeeentity);
    }

    @PutMapping
    public employeeEntity updateEmployee(@RequestBody employeeEntity employeeentity){
    return employeeservice.saveEmployee(employeeentity);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
    employeeservice.deleteEmployee(id);

    }
}
