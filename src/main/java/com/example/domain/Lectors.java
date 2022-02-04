package com.example.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lectors")
public class Lectors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lector_id;
    private String lectorName;
    private int salary;
    private String degree;

    @ManyToMany(mappedBy = "lectors")
    private Set<Department> departments;

    public Lectors() {
    }

    public Lectors(Long lector_id, String lectorName, int salary, String degree) {
        this.lector_id = lector_id;
        this.lectorName = lectorName;
        this.salary = salary;
        this.degree = degree;
    }

    public Long getLector_id() {
        return lector_id;
    }

    public void setLector_id(Long id) {
        this.lector_id = id;
    }

    public String getLectorName() {
        return lectorName;
    }

    public void setLectorName(String lectorName) {
        this.lectorName = lectorName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "\nLectors{" +
                "id=" + lector_id +
                ", lectorName='" + lectorName + '\'' +
                ", salary=" + salary +
                ", degree='" + degree + '\'' +
                '}';
    }
}