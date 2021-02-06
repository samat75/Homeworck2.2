package com.company;

public class Horse extends Animal {
    private int age;
    private String breed;

    public Horse(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(5 + " " + "Апаллуза");
    }
}
