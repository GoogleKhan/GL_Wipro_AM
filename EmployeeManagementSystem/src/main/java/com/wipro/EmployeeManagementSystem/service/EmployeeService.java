package com.wipro.EmployeeManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.EmployeeManagementSystem.model.Employee;
import com.wipro.EmployeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee add(Employee emp) {

		return employeeRepository.save(emp);
	}

	public Employee edit(Employee emp) {
		return employeeRepository.save(emp);
	}

	public void delete(long id) {
		employeeRepository.deleteById(id);
	}

	public Optional<Employee> getOne(long id) {
		if (id < 0) {
			throw new RuntimeException("Invalid Id");
		}
		return employeeRepository.findById(id);
	}

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

}
