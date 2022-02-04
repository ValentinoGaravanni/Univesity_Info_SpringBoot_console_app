package com.example.service;

import com.example.domain.Lectors;
import com.example.repository.LectorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectorsService {

    @Autowired
    LectorsRepo lectorsRepo;

    public Lectors readOneLectors(Long id) { return lectorsRepo.findById(id).orElse(null);}

    public List<Lectors> readLectorByName(String name){return lectorsRepo.findLectorsByLectorNameContaining(name);}

    public List<Lectors> readAllLectors(){return (List<Lectors>) lectorsRepo.findAll();}

}
