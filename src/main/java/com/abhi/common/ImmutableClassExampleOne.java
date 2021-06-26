package com.abhi.common;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassExampleOne {

    public static void main(String[] args) {
        Map <String, Integer> markMap = new HashMap<String, Integer>();
        markMap.put("English", 80);
        markMap.put("Mathematics", 97);
        markMap.put("Science", 87);

        Student student = new Student("abhijit", 45, "Bangalore", markMap);

        System.out.println("Student details:" + student);

        // Test immutable object of Student
        markMap.put("Hindi", 90);
        markMap.put("Computer Science", 99);
        System.out.println("Get data : " + student.getMarks()); // Remains unchanged due to deep copy in constructor

        System.out.println("Student details added :" + student); // Remains unchanged due to deep copy in constructor

        student = new Student("abhijit", 45, "Bangalore", markMap);
        System.out.println("New Student object details:" + student);

    }

}
// Immutable class means that once an object is created, we cannot change its content.
// class must final -   child classes can’t be created
// private data members - direct access is not allowed
// final data members - can’t change the value of it after object creation
// parametrized constructor should initialize all the fields performing a deep copy -  data members can’t be modified with object reference
// Deep Copy of objects should be performed in the getter methods - To return a copy rather than returning the actual object reference
// No setters
final class Student {
    private final String name;
    private final int age;
    private final String address;
    private final Map<String, Integer> marks ;

    Student(String name, int age, String address, Map<String, Integer> marks) {
        this.name = name;
        this.age = age;
        this.address = address;
        Map <String, Integer> tempMap = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.marks = tempMap;
    }

    public Map<String, Integer> getMarks() {
        Map <String, Integer> tempMap = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : this.marks.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}
