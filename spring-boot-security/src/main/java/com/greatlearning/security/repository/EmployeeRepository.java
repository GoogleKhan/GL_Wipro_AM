package com.greatlearning.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.security.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
