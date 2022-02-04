package com.example.validation;

import java.util.Scanner;

public class NotANumber {
    public static int CheckInt(Scanner scanner){
        while (!scanner.hasNextInt()){
            System.out.println("It's not a number.Type a number!\nNumber : " + scanner.next());
        }
        return scanner.nextInt();
    }
}
