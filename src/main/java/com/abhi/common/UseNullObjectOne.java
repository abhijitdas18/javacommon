package com.abhi.common;

public class UseNullObjectOne {

    public String getName(Object name){
        return "Object";
    }

    public String getName(String name) {
        return "String";
    }

     public static void main(String[] args) {
        UseNullObjectOne useNullObject = new UseNullObjectOne();
        String name = useNullObject.getName(null);
        System.out.println("Name : " + name);
    }
}
