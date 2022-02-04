package com.example.application;

import com.example.service.DepartmentService;
import com.example.validation.NotANumber;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class CountEmployee {
    @Autowired
    
    public static String List() {
        String task =
                "\n-------------MENU-------------\n" +
                        "1 - Show count of employee of Math department\n" +
                        "2 - Show count of employee of Physics department\n" +
                        "3 - Show count of employee of Economy department\n" +
                        "4 - Show count of employee of Foreign Languages department\n" +
                        "5 - Show count of employee of Geography department\n" +
                        "6 - Show count of employee of PE department\n" +
                        "-------------------------------";
        return task;
    }

    public static void choice(Scanner scanner) {
        System.out.print("Which one  : ");
        int num = NotANumber.CheckInt(scanner);
        switch (num) {
            default -> {
                System.out.println("There is no such choice");
            }
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {

            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {

            }
        }
    }
}
