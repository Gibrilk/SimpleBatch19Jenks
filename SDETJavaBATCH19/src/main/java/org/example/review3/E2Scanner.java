package org.example.review3;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Grade");
         char grade = scan.next().charAt(0);

         switch (grade){

             case 'A':
                 System.out.println("Very Good Grade");
                 break;
             case'B':
                 System.out.println("Good Grade");
                 break;
             case 'C':
                 System.out.println("Avg Grade");
                 break;
             case 'D':
                 System.out.println("Bad Grade");
                 break;
             case 'F':
                 System.out.println("You failed you need to try again");
                 break;
             default:
                 System.out.println("Wrong Grade Entered");

         }
        }
    }
