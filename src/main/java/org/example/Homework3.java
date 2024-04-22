package org.example;

import java.util.Scanner;

public class Homework3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readGender();
        simpleCalculator();
        factorial();
        multiplicationTable();
        sumOfAllNumbers();
        multiplicationTableForSeven();
    }

    public static void readGender() {
        System.out.println("Type M for male or F for female");
        String gender = scanner.nextLine().toUpperCase();
        switch (gender) {
            case ("M"):
                System.out.println("You are a male");
                break;
            case ("F"):
                System.out.println("You are a female");
                break;
            default:
                System.out.println("You are a Transformer))");
        }

    }

    public static void simpleCalculator() {
        System.out.println(" Input first number: ");
        double num1 = scanner.nextDouble();
        System.out.println(" Input second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Operations available + , - , * , /. Choose one:");
        String operation = scanner.next();
        switch (operation) {
            case ("+"):
                System.out.println("Sum is equal to: " + (num1 + num2));
                break;
            case ("-"):
                System.out.println("Subtraction  is equal to: " + (num1 - num2));
                break;
            case ("*"):
                System.out.println("The product of numbers is equal to: " + (num1 * num2));
                break;
            case ("/"):
                if (num2 != 0) {
                    System.out.println("the result of dividing is equal to: " + (num1 / num2));
                } else System.out.println("Division by zero is not possible ");
                break;
            default:
                System.out.println("Am I a joke to you? Input again ");

        }
    }

    public static void factorial() {
        System.out.println("Input any positive number:");
        int num = scanner.nextInt();
        int increment = 1;
        int factorial = 1;
        while (increment <= num) {
            factorial = factorial * increment;
            increment++;
        }
        System.out.println(" The factorial is equal to: " + factorial);
    }

    public static void multiplicationTable() {
        System.out.println("Input multiplier: ");
        int multiplier = scanner.nextInt();
        int result = 1;
        int increment = 1;
        while (increment <= 10) {
            result = multiplier * increment;
            System.out.println(increment + " * " + multiplier + " = " + result);
            increment++;
        }
    }

    public static void sumOfAllNumbers() {
        System.out.println("Input any positive number:");
        int num = scanner.nextInt();
        int increment = 1;
        int sum = 0;
        while (increment <= num) {
            sum = sum + increment;
            increment++;
        }
        System.out.println(" The sum of all numbers is equal to: " + sum);
    }

    public static void multiplicationTableForSeven() {

        int multiplier = 7;
        int result = 1;
        int increment = 1;
        while (increment <= 14) {
            result = multiplier * increment;
            System.out.println(result);
            increment++;
        }
    }
}
