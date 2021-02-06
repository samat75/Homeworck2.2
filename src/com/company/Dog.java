package com.company;

public class Dog extends Animal {
    private int age;
    private String breed;

    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(2 + " " + "Хаски");
    }
}
