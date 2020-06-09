package com.example.depemp.controller;

import com.example.depemp.model.Employee;
import com.example.depemp.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeRestController {
    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAll(@RequestParam(required = false ) String name){
            return this.employeeService.findAll();

    }
    @GetMapping("/{id}")
    public Employee findById(@PathVariable String id){
        return this.employeeService.findById(id);
    }
    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        this.employeeService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Employee update(@PathVariable String id,Employee employee){
        return this.employeeService.update(id,employee);

    }

}
