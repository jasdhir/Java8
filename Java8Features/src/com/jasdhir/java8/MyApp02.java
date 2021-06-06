package com.jasdhir.java8;

public class MyApp02 {
    public static void main(String[] args) {
            int width=10;
            Drawable d=new Drawable(){
                public void draw(){
                    System.out.println("Drawing  : "+width);
                }
            };
            d.draw();

        Drawable d2=()->{System.out.println("Drawing Again : "+width);};
        d2.draw();
    }

}
