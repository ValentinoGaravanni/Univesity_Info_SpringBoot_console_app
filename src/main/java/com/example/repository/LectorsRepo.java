package com.example.repository;

import com.example.domain.Lectors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public interface LectorsRepo extends JpaRepository<Lectors,Long> {
List<Lectors> findLectorsByLectorNameContaining(String name);
}
