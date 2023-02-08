package com.nemanja.department.service;

import com.nemanja.department.entity.Department;
import com.nemanja.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method of DepartmentService");
        return repository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("inside findDepartmentById method of DepartmentService");
        return  repository.findByDepartmentId(id);
    }

    public List<Department> getDepartments() {
        return repository.findAll();
    }
}
