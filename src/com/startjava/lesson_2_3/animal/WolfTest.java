package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setGender("Мужской");
        wolf1.setNickname("Волчок");
        wolf1.setWeight(31.5);
        wolf1.setAge(7);
        wolf1.setAge(9);
        wolf1.setColour("Серый");
        System.out.println(wolf1.getGender());
        System.out.println(wolf1.getNickname());
        System.out.println(wolf1.getWeight());
        System.out.println(wolf1.getAge());
        System.out.println(wolf1.getColour());
    }
}