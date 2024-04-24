package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input any positive number:");
        int num = scanner.nextInt();
        factorial(num);
        isPalindrome("level");
        sumOfDigits(num);
        sumOfDigitsFromInt(num);

    }

    public static void factorial(int num) {
        int increment = 1;
        int factorial = 1;
        while (increment <= num) {
            factorial = factorial * increment;
            increment++;
        }
        System.out.println(" The factorial is equal to: " + factorial);
    }

    public static void isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        String result = String.valueOf(stringBuilder.reverse());
        if (word.equals(result)) {
            System.out.println("is palindrome");
        } else System.out.println("is not palindrome");

    }

    public static void sumOfDigits(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void sumOfDigitsFromInt(int num) {
        int sum = 0;
        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            sum = sum + Character.getNumericValue(number.charAt(i));
        }
        System.out.println(sum);
    }
}