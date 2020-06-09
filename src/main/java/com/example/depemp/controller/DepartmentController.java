package com.example.depemp.controller;

import com.example.depemp.model.Department;
import com.example.depemp.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
    final private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public String getdepartments(Model model) {
        List<Department> departments = this.departmentService.findAll();
        model.addAttribute("departments", departments);
        return "departments";
    }
    @PostMapping("/{id}/delete")
    public String deleteDepartment(@PathVariable Long id) {

            this.departmentService.deleteById(id);
            return "departments";

    }
    @GetMapping("/add-department")
    public String addNewDepartment(Model model) {
        List<Department> departments = this.departmentService.findAll();
        model.addAttribute("department", new Department());
        return "add-department";
    }
    @PostMapping("/add-department")
    public String saveBook(
            Department department,
            Model model) {
        this.departmentService.save(department);
        return "redirect:/departments";
    }

}
