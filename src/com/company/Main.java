package com.company;

import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {
        creatObject("Cat").print();
        creatObject("Dog").print();
        creatObject("Horse").print();
    }
    public static Printable creatObject(String name){
        Printable temp =null;
        switch (name){
            case "Cat":
                temp = (Printable) new Cat(1,"свинкс");
                break;

            case "Dog":
                temp = (Printable) new Dog(5,"хаски");
                break;

            case "Horse":
                temp = (Printable) new Horse(10,"Апаллуза");
                break;
            default:
                return temp;
        }
        return temp;
    }

}