package com.developer.employee_management.reposiory;

import com.developer.employee_management.entity.employeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<employeeEntity, Long> {

}
