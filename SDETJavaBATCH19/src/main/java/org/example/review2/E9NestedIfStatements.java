package org.example.review2;

public class E9NestedIfStatements {
    public static void main(String[] args) {

        boolean haveCoupon=true;
        int coupon=20;

        if(haveCoupon){

            if(coupon==10){
                System.out.println("Aply 10% discount");
            }else if (coupon==20){
                System.out.println("Aply 20% discount");
            }else{
                System.out.println("Wrong Coupon");
            }

        }
    }
}



