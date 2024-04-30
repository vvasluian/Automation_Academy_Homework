package org.example;

import java.util.Scanner;

public class Homework6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Subtraction Count");
            System.out.println("2. Celsius to Fahrenheit Conversion");
            System.out.println("3. Even or Odd Check");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Input two numbers: ");
                    subtractCount(scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Input temperature in Celsius");
                    celsiusToFahrenheit(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Input an number: ");
                    evenOrOdd(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Not even close. Try again.");
            }
        } while (choice != 4);

    }

    public static void subtractCount(int num1, int num2) {
        if (num1 < num2 || num1 == 0 || num1 < 0) {
            System.out.println("Can't subtract");
        } else {
            int count = 0;
            while (num1 >= num2) {
                num1 -= num2;
                count++;

            }
            System.out.println(count);

        }
    }

    public static void celsiusToFahrenheit(int celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is equal to: " + fahrenheit);
    }

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else System.out.println(num + " in an odd number");
    }
}