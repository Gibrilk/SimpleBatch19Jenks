package org.example.class5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hour using 24 hours format");
        int hour = scan.nextInt();
        if (hour >= 1 && hour <= 11) {
            System.out.println("Morning");
        } else if (hour >= 12 && hour <= 15) {
            System.out.println("Afternoon");
        } else if (hour >= 16 && hour <= 20) {
            System.out.println("Evening ");
        } else if (hour >= 21 && hour <= 24) {
            System.out.println("night");
        } else {
            System.out.println("Invalid");
        }
    }
}
