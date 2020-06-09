package com.example.depemp.service.impl;

import com.example.depemp.model.Department;
import com.example.depemp.model.Employee;
import com.example.depemp.repository.EmployeeRepository;
import com.example.depemp.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(String employeeId) {
        return null;
    }

    @Override
    public Employee save(@RequestBody Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee update(String employeeId, Employee employee) {
        Employee e = this.findById(employeeId);
        e.setUsername(employee.getUsername());
        e.setFullName(employee.getFullName());
        return this.employeeRepository.save(e);
    }

    @Override
    public void deleteById(String employeeId) {
        this.employeeRepository.deleteById(employeeId);
    }


    @Override
    public Employee addEmployeeInNewDepartment(String employeeId, Long departmentId) {
        return null;
    }

    @Override
    public Employee removeEmployeeFromDepartment(String employeeId, Long departmentId) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployeesCreatedBefore(LocalDateTime localDateTime) {
        return null;
    }
}
