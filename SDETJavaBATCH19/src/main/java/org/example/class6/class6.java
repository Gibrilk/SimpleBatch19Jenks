package org.example.class6;

import java.util.Scanner;

public class class6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter your country name");
        String country=scanner.nextLine();

        switch (country){
            case "USA":
                System.out.println("We speak English");
                break;
            case "France":
                    System.out.println("We speak french");
                    break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case "Eygpt":
                System.out.println("We speak arabic");
                break;
            default:
            System.out.println("Country not supported");

        }
    }
}
