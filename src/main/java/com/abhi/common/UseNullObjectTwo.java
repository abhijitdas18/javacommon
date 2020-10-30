package com.abhi.common;
//Ambiguous method call error
public class UseNullObjectTwo {

    public String getName(Integer name){
        return "Object";
    }

    public String getName(String name) {
        return "String";
    }

     public static void main(String[] args) {
        UseNullObjectTwo useNullObject = new UseNullObjectTwo();
        // //Ambiguous method call error , uncomment
        //String name = useNullObject.getName(null);
        //System.out.println("Name : " + name);
    }
}
