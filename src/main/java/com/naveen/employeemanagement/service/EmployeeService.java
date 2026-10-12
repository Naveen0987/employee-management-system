package com.naveen.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.naveen.employeemanagement.entity.Employee;
import com.naveen.employeemanagement.exception.EmployeeNotFoundException;
import com.naveen.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();

	}

	public Employee getEmployeeById(Long id) {
		Optional<Employee> found = employeeRepository.findById(id);

		if (found.isPresent()) {
			return found.get();
		}
		throw new EmployeeNotFoundException("id not found");

	}

	public Employee updateEmployee(Long id, Employee employee) {
		Optional<Employee> update = employeeRepository.findById(id);

		if (update.isPresent()) {
			Employee oldemp = update.get();
			oldemp.setName(employee.getName());
			oldemp.setPhone(employee.getPhone());
			oldemp.setEmail(employee.getEmail());
			oldemp.setDepartment(employee.getDepartment());
			oldemp.setDesignation(employee.getDesignation());
			oldemp.setSalary(employee.getSalary());
			return employeeRepository.save(oldemp);

		} else {
			throw new EmployeeNotFoundException("id: "+id+" not found");
		}

	}

	public void deleteEmployee(Long id) {

		Optional<Employee> del = employeeRepository.findById(id);
		if (del.isPresent()) {
			employeeRepository.deleteById(id);

		}
		else {
			throw new EmployeeNotFoundException("id: "+id+" not found");
		}

	}
}
