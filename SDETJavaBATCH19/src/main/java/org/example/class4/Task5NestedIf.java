package org.example.class4;

public class Task5NestedIf {
    public static void main(String[] args) {

        double mortageRate = 4.3;
        double mortgaePrice  = 200000;

        if (mortageRate>4.5){
            System.out.println("User should not buy a house");
        }else{
            System.out.println("User will consider Buying");
        }

        if(mortgaePrice>100000){
            System.out.println("User will take a loan");
        }else{
            System.out.println("User will pay cash");
        }



    }
}
