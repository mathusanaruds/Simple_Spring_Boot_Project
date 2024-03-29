package com.developer.employee_management.service.impl;

import com.developer.employee_management.entity.employeeEntity;
import com.developer.employee_management.reposiory.employeeRepository;
import com.developer.employee_management.service.employeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeServiceImplementation implements employeeService {

    public employeeServiceImplementation(employeeRepository employeerepository) {
        this.employeerepository = employeerepository;
    }

    private final employeeRepository employeerepository;


    @Override
    public List<employeeEntity> findallEmployee() {
        return employeerepository.findAll();
    }

    @Override
    public Optional<employeeEntity> findbyId(Long id) {
        return employeerepository.findById(id);
    }

    @Override
    public employeeEntity saveEmployee(employeeEntity employeeentity) {
        return employeerepository.save(employeeentity);
    }

    @Override
    public employeeEntity updateEmployee(employeeEntity employeeenity) {
        return employeerepository.save(employeeenity);
    }

    @Override
    public void deleteEmployee(long id) {
employeerepository.deleteById(id);
    }
}
