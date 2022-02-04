package com.example.repository;

import com.example.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
    List<Department> findByHeadOfDepartment(String headName);

}
