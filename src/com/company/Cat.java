package com.company;

public class Cat extends Animal {
    private int age;
    private String breed;

    public Cat(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(1 + " " + "свинкс");
    }
}

