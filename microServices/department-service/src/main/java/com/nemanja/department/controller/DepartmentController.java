package com.nemanja.department.controller;

import com.nemanja.department.entity.Department;
import com.nemanja.department.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment method of DepartmentController");
        return  service.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id")   Long id ){
        log.info("inside findDepartmentById method of DepartmentController");
        return  service.findDepartmentById(id);
    }
    @GetMapping ("/")
    public List<Department> getDepartments(){
        return service.getDepartments();
    }

}
