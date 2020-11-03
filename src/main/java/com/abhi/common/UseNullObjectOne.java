package com.abhi.common;
// Between Object and String, both take null.
// String is subclass of Object and more specific
// So, String will call.
// Java will have to find the most specific one
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
