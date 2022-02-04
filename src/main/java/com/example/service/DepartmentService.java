package com.example.service;

import com.example.domain.Department;
import com.example.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepo departmentRepo;

    public Department readOneDepartment(Long id) {
        return departmentRepo.findById(id).orElse(null);
    }


    public List<Department> readHeadOfDepartment(String headOfDepartment) {
        return departmentRepo.findByHeadOfDepartment(headOfDepartment);
    }

    public List<Department> readAllDepartments() {
        return (List<Department>) departmentRepo.findAll();
    }

}
