package org.example.class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name =scan.nextLine();
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("Please Enter your Salary");
        double salary= scan.nextDouble();
    }
}
