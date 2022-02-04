package com.example;

import com.example.application.Methods;
import com.example.service.DepartmentService;
import com.example.service.LectorsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    LectorsService lectorsService;
    @Autowired
    DepartmentService departmentService;

    private Logger logger = LoggerFactory.getLogger(Runner.class);


    @Override
    public void run(String... args) throws Exception {
        System.out.println(lectorsService.readLectorByName("ndr"));
        System.out.println(departmentService.readHeadOfDepartment("Andrew Petrenko"));
        System.out.println(Methods.taskList());
        Methods.choiceList();
    }
}

