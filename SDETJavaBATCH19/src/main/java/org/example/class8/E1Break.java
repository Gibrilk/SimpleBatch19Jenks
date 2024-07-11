package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String [] names={"James","Iram","Fab","Aladin","Ana","Silvia"};
        String name="ubaidur";
        for(String n:names){
            if(n.equals(name)){
                System.out.println(n+" is present");
            }
        }
    }
}
