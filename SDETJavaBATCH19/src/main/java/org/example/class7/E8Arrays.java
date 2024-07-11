package org.example.class7;

public class E8Arrays {
    public static void main(String[] args) {
        String [] cars  = {"Toyota","Audi","Jeep","BMW","Porsche", "Mercedes"};
        //with loop method
        for(int i =0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        //with while loop method
        int i =0;
        while (i<5){
            System.out.println(cars[i]);
            i++;
        }
    }
}
