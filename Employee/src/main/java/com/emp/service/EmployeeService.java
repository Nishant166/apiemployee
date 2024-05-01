package com.emp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
import com.emp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	 public Employee saveEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }
	 
	 public List<Employee> getEmployeesForBonus(LocalDate date) {
	        return employeeRepository.findByHireDateBefore(date);
	    }

}
