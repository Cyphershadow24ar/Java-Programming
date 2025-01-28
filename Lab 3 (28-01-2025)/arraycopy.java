// Write a program to copy the rest of the elements of the array after the position, if the specified number is found in the array.

// Example - 
// arr =[10,20,30,40,50,60,70,105]
// Input number to check for : 50..  THEN
// Arr1 should have the elements - [50,60,70,105]

import java.util.Scanner;

public class arraycopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 105};
        System.out.print("Enter the number to check for: ");
        int num = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;}}

        if (index == -1) {
            System.out.println("Number not found in the array.");
        } else {
            int[] arr1 = new int[arr.length - index];
            for (int i = index; i < arr.length; i++) {
                arr1[i - index] = arr[i];}

            System.out.print("Arr1: ");
            for (int j : arr1) {
                System.out.print(j + " ");}}
        scanner.close();}}