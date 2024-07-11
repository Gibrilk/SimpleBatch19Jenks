package org.example.class4;

public class Task6Donor {
    public static void main(String[] args) {

        int age = 19;
        int weight = 111;

        if(age>18){
            System.out.println("You can donate blood");
            if (age<18){
            System.out.println("You can not donate blood");
                }
            if (weight>110){
                System.out.println("You are eligible");
            }else{
                System.out.println("We can not accept such patient");
            }
        }else{
            System.out.println("You do not meet criteria");
        }





    }
}
