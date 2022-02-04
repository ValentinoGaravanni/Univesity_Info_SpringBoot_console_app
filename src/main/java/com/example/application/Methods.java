package com.example.application;

import com.example.validation.NotANumber;

import java.util.Scanner;

public class Methods {

    public static String taskList() {
        String task =
                "\n-------------MENU-------------\n" +
                        "1 - Show head of departments\n" +
                        "2 - Show departments statistics\n" +
                        "3 - Show the average salary for the departments\n" +
                        "4 - Show count of employee of departments\n" +
                        "5 - Global search\n" +
                        "0 - Exit\n" +
                        "-------------------------------";
        return task;
    }

    public static void choiceList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice : ");
        int num = NotANumber.CheckInt(scanner);
        switch (num) {
            case 1 -> {
                System.out.println(HeadOfDepartment.headsList());
                HeadOfDepartment.choice(scanner);
                break;
            }
            case 2 -> {
                System.out.println(DepartmentStatistics.List());
                DepartmentStatistics.choice(scanner);
            }
            case 3 -> {
                System.out.println(AverageSalary.List());
                AverageSalary.choiceSalary(scanner);
            }
            case 4 -> {
                System.out.println(CountEmployee.List());
                CountEmployee.choice(scanner);
            }
            case 5 -> {
                String search = scanner.nextLine();
                System.out.println(GlobalSearch.search(search));

            }
            case 0 -> {
                System.out.println("Bye,see you!");
            }
            default -> {
                System.out.println("No such an option!");
            }
        }

    }
}


