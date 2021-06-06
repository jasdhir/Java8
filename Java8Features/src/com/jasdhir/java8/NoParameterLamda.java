package com.jasdhir.java8;

public class NoParameterLamda {
    public static void main(String[] args) {

       SaySomething saySomething;

        saySomething =new SaySomething() {
          public String say() {
               return "Hello Without Lambda";
           }
        };
        System.out.println(saySomething.say());

       SaySomething s=()-> "This is from Lambda Expression Without Parameter.";
        
       System.out.println(s.say());
    }
}

