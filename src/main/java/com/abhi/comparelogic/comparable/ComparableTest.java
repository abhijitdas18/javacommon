package com.abhi.comparelogic.comparable;


import java.util.ArrayList;
import java.util.List;
//  sorting of objects needs to be based on natural order
public class ComparableTest {
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("abhi", 23, "ghy", 2000));
        studentList.add(new Student("ravi", 33, "sil", 2030));
        studentList.add(new Student("moti", 43, "del", 2007));
        studentList.add(new Student("rani", 21, "mon", 2011));




    }
}
