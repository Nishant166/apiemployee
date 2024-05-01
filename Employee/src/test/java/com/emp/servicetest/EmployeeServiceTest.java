package com.emp.servicetest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.emp.repository.EmployeeRepository;
import com.emp.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
   
	@Mock
	private EmployeeRepository employeeRepository;
	@InjectMocks
	private EmployeeService employeeService;
	
	@Test
	public void testGetEmployeesForBonus() {
       
    }
}
