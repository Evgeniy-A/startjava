package com.startjava.lesson_2_3.person;

public class Person {
    private String gender = "male";
    private String name = "Fedor";
    private double height = 168.8;
    private double weight = 70.5;
    private int age = 30;

    public Person(String name, String gender, double height, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void go() {
        System.out.println("Человек идет");
    }

    public void sit() {
        System.out.println("Человек сидит");
    }

    public void run() {
        System.out.println("Человек бежит");
    }

    public void speak() {
        System.out.println("Человек говорит");
    }

    public void learningJava() {
        System.out.println("Человек учит Java");
    }
}