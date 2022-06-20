package com.wipro.EmployeeManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.EmployeeManagementSystem.model.Employee;
import com.wipro.EmployeeManagementSystem.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/emp")
	public Employee add(@RequestBody Employee emp) {
		return employeeService.add(emp);
	}

	@PutMapping("/emp")
	public Employee edit(@RequestBody Employee emp) {
		return employeeService.edit(emp);
	}

	@DeleteMapping("/emp/{id}")
	public void delete(@PathVariable long id) {
		employeeService.delete(id);
	}

	@GetMapping("/emp/{id}")
	public Optional<Employee> getOne(@PathVariable long id) {
		return employeeService.getOne(id);
	}

	@GetMapping("/emp")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

}
