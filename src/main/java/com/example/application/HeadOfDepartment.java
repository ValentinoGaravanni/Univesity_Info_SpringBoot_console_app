package com.example.application;

import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class HeadOfDepartment  {

    @Autowired
    private static DepartmentService departmentService;

    public static String headsList() {
        String task =
                "\n-------------MENU-------------\n" +
                        "1 - Show head of Math department\n" +
                        "2 - Show head of Physics department\n" +
                        "3 - Show head of Economy department\n" +
                        "4 - Show head of Foreign Languages department\n" +
                        "5 - Show head of Geography department\n" +
                        "6 - Show head of PE department\n" +
                        "-------------------------------";
        return task;
    }

    public static void choice(Scanner scanner) {
        System.out.print("Choose which one u want to : ");
        int num = scanner.nextInt();
        switch (num) {
            case 1: {
                System.out.println(departmentService.readHeadOfDepartment("Andrew Petrenko"));
                break;
            }
            case 2: {
                System.out.println(departmentService.readOneDepartment(2l));
            }
            case 3: {
                System.out.println(departmentService.readOneDepartment(3l));
            }
            case 4: {
                System.out.println(departmentService.readOneDepartment(4l));
                break;
            }
            case 5: {
                System.out.println(departmentService.readOneDepartment(5l));
                break;
            }
            case 6: {
                System.out.println(departmentService.readOneDepartment(6l));
                break;
            }
            default: {
                System.out.println("There is no such choice");
            }
        }
    }
}

