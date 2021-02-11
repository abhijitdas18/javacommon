package com.abhi.common.interfacetest;


interface MyInterface {
    int age = 20; // by default public and final
    // int height ;  // initialization is must for final var

}

public class InterfaceExampleOne {

    public static void main(String[] args) {
       // MyInterface.age = 30;  // can not change final value
    }

}
