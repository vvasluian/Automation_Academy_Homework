package org.example;

import java.util.Scanner;

public class Homework2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        positiveOrNegativeNumber();
        findGreatestNumber();
        leapYear();
        sumAndAverage();
        stringMethod();
    }

    public static void positiveOrNegativeNumber() {
        System.out.println("Type any whole number: ");
        int num = scanner.nextInt();
        if (num >= 0) {
            System.out.println("This number is positive ");
        } else {
            System.out.println("This number is negative");
        }
    }

    public static void findGreatestNumber() {
        System.out.println("Type first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Type second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Type third number: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " :is the greater number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " :is the greater number");
        } else {
            System.out.println(num3 + " :is the greater number");
        }
    }

    public static void leapYear() {
//        The rules for determining leap years are as follows:
//        A year is a leap year if it is divisible by 4.
//        However, if the year is divisible by 100, it is not a leap year, unless it is also divisible by 400.
        System.out.println("Type any year ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void sumAndAverage() {
        System.out.println("Type five numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum of this 5 numbers is: " + sum);
        double average = (double) sum / 5;
        System.out.println("Average is: " + average);
    }

    public static void stringMethod() {
        String text = "I love Java";
        System.out.println(text.charAt(4));
        System.out.println(text.indexOf('J'));
        System.out.println(text + " and QA Automation");
        boolean isThatString = text instanceof String;
        System.out.println(isThatString);

    }
}
