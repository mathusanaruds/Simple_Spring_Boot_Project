package com.developer.employee_management.service;

import com.developer.employee_management.entity.employeeEntity;

import java.util.List;
import java.util.Optional;

public interface employeeService {
    List<employeeEntity> findallEmployee();
    Optional<employeeEntity> findbyId(Long id);
    employeeEntity saveEmployee(employeeEntity employeeentity);
    employeeEntity updateEmployee(employeeEntity employeeenity);
    void deleteEmployee(long id);

}
