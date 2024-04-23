package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Homework4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {4, 5, 3, 2, 6, 7, 4, 9};
        int[] array2 = {5, 12, 5, 21, 65, 7, 48, 2, 91, 9};
        reverseArray(array);
        averageOfArray(array);
        searchForElement(array);
        sortAscendingDescending(array);
        findCommonElements(array, array2);
        mergeTwoSortedArrays(array, array2);

    }

    public static void reverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);
    }

    public static void averageOfArray(int[] array) {
        int count = 0;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            sum = sum + array[i];

        }
        average = (double) sum / count;
        System.out.println(average);
    }

    public static void searchForElement(int[] array) {
        while (true) {
            System.out.println("Input element to be found: ");
            int element = scanner.nextInt();
            boolean elementExists = false;
            for (int i = 0; i < array.length; i++)
                if (element == array[i]) {
                    System.out.println("The index of element " + element + " is " + i);
                    elementExists = true;
                    break;
                }
            if (!elementExists) {
                System.out.println("Element not found. Try again");
            } else
                break;
        }
    }

    public static void sortAscendingDescending(int[] array) {
        Arrays.sort(array);
        System.out.println("Print array in ascending order: " + Arrays.toString(array));

        System.out.println("Reverse array in descend order: ");
        reverseArray(array);
    }

    public static void findCommonElements(int[] array, int[] array2) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    System.out.println("The common elements of two arrays are: " + array[i]);
                    break;
                }
            }
        }
    }

    public static void mergeTwoSortedArrays(int[] array, int[] array2) {
        Arrays.sort(array);
        Arrays.sort(array2);
        int[] mergedArray = new int[array.length + array2.length];
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            mergedArray[i] = array[j];
            i++;
        }
        for (int k = 0; k < array2.length; k++) {
            mergedArray[i] = array2[k];
            i++;
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

}