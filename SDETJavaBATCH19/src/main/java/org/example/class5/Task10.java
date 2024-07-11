package org.example.class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String month = scan.nextLine().toLowerCase();
        switch (month) {
            case ("march"):
            case ("april"):
            case ("may"):
                System.out.println("You were born is season Spring");
                break;
            case ("june"):
            case ("july"):
            case ("august"):
                System.out.println("You were born is season Summer");
                break;
            case ("september"):
            case ("october"):
            case ("november"):
                System.out.println("You were born is season Autumn");
                break;
            case ("december"):
            case ("january"):
            case ("february"):
                System.out.println("You were born is season Winter");
                break;
            default:
                System.out.println("Invalid month");

        }
    }
}
