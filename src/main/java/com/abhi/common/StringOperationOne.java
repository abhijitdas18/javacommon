package com.abhi.common;

public class StringOperationOne {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "efg";
        String s3 = "xyz";

        s1 = s2;
        s2 = s3;
        s3 = s1;

        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);
        System.out.println("s3 :" + s3);
    }
}
