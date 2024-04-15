package org.example;

import java.util.Scanner;

public class Homework1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        findSquareNumber();
        sumAndProductOfTwoNumbers();
        areaAndPerimeterOfSquare();

    }
    public static void findSquareNumber(){
        System.out.println("Type any number: ");
        int num = scanner.nextInt();
        double squareNumber = Math.pow(num,2);
        System.out.println("The square of " + num + " is " + squareNumber);
    }
    public static void sumAndProductOfTwoNumbers(){
        System.out.println("Type first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Type second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        int product = firstNumber * secondNumber;
        System.out.println("Product of " + firstNumber + " and " + secondNumber + " is: " + product);
    }
    public static void areaAndPerimeterOfSquare (){
//        double data type was used because square side is not always a whole number
        System.out.println("Type the square side length: ");
        double squareSide = scanner.nextDouble();
        double area = Math.pow(squareSide,2);
        System.out.println("Area of the square is: " + area);
        double perimeter = 4 * squareSide;
        System.out.println("Perimeter of the square is: " + perimeter);
    }
}