package com.example.depemp.service.impl;

import com.example.depemp.model.Department;
import com.example.depemp.model.exception.DepartmentExceptionNotFound;
import com.example.depemp.repository.DepartmentRepository;
import com.example.depemp.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> findAll() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department findById(Long id)     {
        return this.departmentRepository.findById(id).orElseThrow(()->new DepartmentExceptionNotFound(id));

}

    @Override
    public Department save(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Department findByName(String name) {
        return null;
    }


}
