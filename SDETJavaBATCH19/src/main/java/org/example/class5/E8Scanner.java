package org.example.class5;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the amount of loan");
        double loanamount =scan.nextDouble();
        if(loanamount<=2000.000) {
            System.out.println("Approved");
        }else {
            System.out.println("Rejected");
        }

    }
}
