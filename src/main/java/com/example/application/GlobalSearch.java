package com.example.application;

import com.example.domain.Lectors;
import com.example.service.LectorsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GlobalSearch {
    @Autowired
    private static LectorsService lectorsService;
    public static List<Lectors> search(String name) {
        System.out.println("What I need to search?\n " );

        return lectorsService.readLectorByName(name);
    }
}
