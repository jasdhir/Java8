package com.jasdhir.java8.methodrefs;

interface FunctionalI{
    void canYouUseThis();
}
class SomethingCool{
    public SomethingCool(){
        System.out.println("Just a regular constructor");
    }
}
class MethodReferences {
    public static void main(String[] args) {
        //Two references to functions, declared a bit differently
        FunctionalI f = MethodReferences::staticMethod;
        FunctionalI x = ()-> System.out.println("Lets See here");
        //Appears to be using the same method..
        f.canYouUseThis(); //However, this one is referencing 'staticMethod' defined below
        x.canYouUseThis(); //And this one uses the passed anonymous function on line 12
        //Both appear as Lambda of this class
        System.out.println(f.getClass());
        System.out.println(x.getClass());
        //Very cool! No need to repeat functions if functionality already exists! Simply reference the existing function.
        //Does this work with instances?
        FunctionalI instanceTest = new MethodReferences()::instanceMethod;
        instanceTest.canYouUseThis(); //It does!
        //What about constructors?
        FunctionalI somethingCool = SomethingCool::new;
        somethingCool.canYouUseThis(); //Prints out the message contained within the constructor! nice!
    }
    public static void staticMethod(){
        System.out.println("In a Static Method");
    }
    public void instanceMethod(){
        System.out.println("I don't belong to the class, but the instance!");
    }
}