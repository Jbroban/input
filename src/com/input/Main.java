package com.input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please insert your name and age: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}
