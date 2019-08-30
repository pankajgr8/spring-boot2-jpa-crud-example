package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;
import java.util.Optional;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;


public interface EmployeeService {
	
	boolean addEmployee(Employee employee);

	boolean updateEmployee(Employee employee);

	Optional<Employee> getById(Long id);

	void deleteEmployee(Employee employee);

	List<Employee> getAllEmployee();
	
	List<Employee> findbyFirstName(String firstName);

}
