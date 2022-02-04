package com.example.application;

import com.example.validation.NotANumber;

import java.util.Scanner;

public class DepartmentStatistics {
    public static String List() {
        String task =
                "\n-------------MENU-------------\n" +
                        "1 - Show statistics of Math department\n" +
                        "2 - Show statistics of Physics department\n" +
                        "3 - Show statistics of Economy department\n" +
                        "4 - Show statistics of Foreign Languages department\n" +
                        "5 - Show statistics of Geography department\n" +
                        "6 - Show statistics of PE department\n" +
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
