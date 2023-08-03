package com.startjava.lesson_2_3.person;

public class Person {

    String gender = "Men";
    String name = "Anton";
    int age = 31;
    double weight = 93.5;

    void wakeUp() {
        System.out.println(name + " wakes up");
    }

    void goWork() {
        System.out.println(name + " is going to work");
    }

    void doWork() {
        System.out.println(name + " is working");
    }

    void goHome() {
        System.out.println(name + " is going home");
    }

    void sleep() {
        System.out.println(name + " falls asleep");
    }

    void showInfo() {
        System.out.println("I'm a " + gender + "\nMy name is " + name + "\nMy age is " + age + 
                "\nmy weight is " + weight);
    }
}