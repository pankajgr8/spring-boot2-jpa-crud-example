package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public boolean addEmployee(Employee employee) {
		return employeeRepository.save(employee) != null;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeRepository.save(employee) != null;
	}

	@Override
	public Optional<Employee> getById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.deleteById(employee.getId());
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findbyFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

}
