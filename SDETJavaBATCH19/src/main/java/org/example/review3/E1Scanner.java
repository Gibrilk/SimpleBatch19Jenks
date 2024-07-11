package org.example.review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Age");
        int age = scan.nextInt();

        if(age>50){
            System.out.println("You will get 20% discount on Toys");
        }else{
            System.out.println("You will get 10% discount");
        }
    }
}
