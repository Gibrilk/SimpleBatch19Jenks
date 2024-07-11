package org.example.class4;

public class Task4NestedIf {
    public static void main(String[] args) {

        boolean collegeDegree = true;
        boolean noDegree = true;
        double gpa = 3.5;

        if (collegeDegree) {
            System.out.println("Congratulations!");
            if ((gpa >= 3.5)) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder!");
            }
        }else{
            System.out.println("You should get a degree");
        }


    }
}
