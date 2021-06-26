package com.abhi.common;
class Base {

    public int no = 10;

    public int roll =  100;

    public String say = "Hello";

    public static final int amount  = 100;

    public void getName() {
        System.out.println("This is base - name");
    }

    public void getAge(){
        System.out.println("This is base - age");
    }

    private void getAddress() {
        System.out.println("This is base - address");
    }

    private void getCity() {
        System.out.println("This is base - city");
    }

    public static void getState() {
        System.out.println("This is base - state");
    }
}


public class InheritanceObjectMappingOne extends Base{

    public int roll = 200;
    public String say = "World";

    public  int amount = 200; // static variable can  override, but it is not overridden

    public void getName() {
        System.out.println("This is derived");
    }

    void getCity(){
        System.out.println("This is derived - city");
    }

    // cannot override static method
    /*public void getState(){
        System.out.println("This is InheritanceObjectMappingOne - state");
    }*/
    public static void main(String[] args) {
        Base base = new InheritanceObjectMappingOne();
        base.getName();  // This is derived - public method override

        base.getAge();  // This is base - age   - Not override

        //base.getAddress(); Not accessible  - private method

        //base.getCity(); Not accessible  - private method

        System.out.println(base.no); // 10   - base

        System.out.println(base.roll);  // 100 - base   Instance variables CANNOT be overridden

        System.out.println(base.say); // Hello - Instance variables CANNOT be overridden

        System.out.println(base.amount); // 100
    }
}


