package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        double num1=scan.nextInt();
        System.out.println("Please enter the second number");
        double num2=scan.nextInt();
        System.out.println("Please enter the operator");
        char operator=scan.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
            System.out.println("num1*num2");
            break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Not Acceptable");


        }
    }
}
