package com.abhi.common.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<Animal> animals = new HashSet<>();

        Animal animal01 = new Animal("Cat", 13);
        Animal animal02 = new Animal("Dog", 23);
        Animal animal03 = new Animal("Cat", 13);
        Animal animal04 = new Animal("Mouse", 10);
        Animal animal05 = new Animal("Cat", 13);

        animals.add(animal01);
        animals.add(animal02);
        animals.add(animal03);
        animals.add(animal04);
        animals.add(animal05);

        System.out.println("Get hashCode of any two equal objects with hasCode override and without override in Animal:");
        System.out.println("hashCode : " + animal01.hashCode());
        System.out.println("hashCode : " + animal03.hashCode());
        // Display the HashSet
        System.out.println("List of animals with duplicate : without implementation of hashCode and equals");
        animals.stream().forEach(x -> System.out.println(x));


    }
}
