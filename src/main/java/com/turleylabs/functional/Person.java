package com.turleylabs.functional;

import java.util.Arrays;
import java.util.List;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("Bob", 45),
                new Person("Sally", 38),
                new Person("Tom", 25),
                new Person("Jane", 32)
        );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "'" + name + '\'' +
                ", " + age +
                '}';
    }
}
