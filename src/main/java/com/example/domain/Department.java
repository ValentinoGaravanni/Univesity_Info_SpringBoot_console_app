package com.example.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long department_id;
    private String departmentName;
    private String headOfDepartment;

    @ManyToMany
    @JoinTable(
            name = "department_lector",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "lector_id")
    )
    private Set<Lectors> lectors;


    public Department() {
    }

    public Department(Long department_id, String departmentName) {
        this.department_id = department_id;
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    public String toString() {
        return "\nDepartment info: {" +
                "department_id=" + department_id +
                ", departmentName='" + departmentName + '\'' +
                ", headOfDepartment='" + headOfDepartment + '\'' +
                '}';
    }
}