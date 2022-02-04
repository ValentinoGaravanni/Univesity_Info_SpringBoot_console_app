package com.example.application;

import java.util.Scanner;

import static com.example.validation.NotANumber.CheckInt;

public class AverageSalary {
    public static String List() {
        String task =
                "\n-------------MENU-------------\n" +
                        "1 - Show the average salary for the Math department\n" +
                        "2 - Show the average salary for the Physics department\n" +
                        "3 - Show the average salary for the Economy department\n" +
                        "4 - Show the average salary for the Foreign Languages department\n" +
                        "5 - Show the average salary for the Geography department\n" +
                        "6 - Show the average salary for the PE department\n" +
                        "-------------------------------";
        return task;
    }

    public static void choiceSalary(Scanner scan) {
        System.out.print("Choose which one u want to : ");
        int num = CheckInt(scan);
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

