package com.abhi.common;
// Ambiguous method call error
// Java will have to find the most specific one.
// Between Integer and String , none is more specific than the other
// so Java can't decide which one to call.
public class UseNullObjectTwo {

    public String getName(Integer name){
        return "Integer";
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
