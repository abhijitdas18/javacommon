package com.abhi.common;
class Base {

    public int no = 10;

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

    public String say = "World";

    public  int amount = 200;

    public void getName() {
        System.out.println("This is InheritanceObjectMappingOne");
    }

    void getCity(){
        System.out.println("This is InheritanceObjectMappingOne - city");
    }

    // cannot override static method
    /*public void getState(){
        System.out.println("This is InheritanceObjectMappingOne - state");
    }*/
    public static void main(String[] args) {
        Base obj = new InheritanceObjectMappingOne();
        obj.getName();

        obj.getAge();

        //obj.getAddress(); Not accessible

        //obj.getCity(); Not accessible

        System.out.println(obj.no); // 10

        System.out.println(obj.say); // Hello - base class variable

        System.out.println(obj.amount); // 100
    }
}


